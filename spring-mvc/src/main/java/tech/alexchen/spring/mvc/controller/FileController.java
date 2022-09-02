package tech.alexchen.spring.mvc.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.IoUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.UUID;

/**
 * @author alexchen
 */
@RestController
public class FileController {

    /**
     * 文件上传
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("file") CommonsMultipartFile multipartFile, HttpServletRequest request) throws IOException {
        String fileName = multipartFile.getOriginalFilename();
        if (fileName == null || fileName == "") {
            fileName = UUID.randomUUID().toString();
        } else {
            fileName = DateUtil.now() + "-" + fileName;
        }
        // 上传路径
        File destDir = new File(request.getSession().getServletContext().getRealPath("/upload"));
        if (!destDir.exists()) {
            destDir.mkdir();
        }
        File realPath = new File(destDir, fileName);
        System.out.println("Saved file:" + realPath.getAbsolutePath());

        multipartFile.transferTo(realPath);
        return "success";
    }

    /**
     * 文件下载
     */
    @GetMapping("/download/1")
    public void download(HttpServletRequest request, HttpServletResponse response) {
        String fileName = "home.jpg";

        try {
            response.reset();
            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;fileName=" + URLEncoder.encode(fileName, "utf-8"));

            InputStream inputStream = this.getClass().getResourceAsStream("/images/home.jpg");
            ServletOutputStream outputStream = response.getOutputStream();

            IoUtil.copy(inputStream, outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件预览
     */
    @GetMapping("/download/2")
    public StreamingResponseBody download2() {
        InputStream inputStream = this.getClass().getResourceAsStream("/images/home.jpg");

        return outputStream -> IoUtil.copy(inputStream, outputStream);
    }

}
