package tech.alexchen.springboot.security.server.controller;

import com.google.code.kaptcha.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.alexchen.springboot.security.server.service.CaptchaService;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author alexchen
 */
@RestController
public class CaptchaController {

    @Resource
    CaptchaService captchaService;

    @GetMapping("/captcha")
    public void getVerifyCodePng(HttpServletRequest request, HttpServletResponse resp)
            throws IOException {
        resp.setDateHeader("Expires", 0);
        resp.setHeader("Cache-Control",
                "no-store, no-cache, must-revalidate");
        resp.addHeader("Cache-Control", "post-check=0, pre-check=0");
        resp.setHeader("Pragma", "no-cache");
        resp.setContentType("image/jpeg");

        Producer producer = captchaService.getProducer();
        String text = producer.createText();
        HttpSession session = request.getSession();
        session.setAttribute("captcha", text);
        BufferedImage image = producer.createImage(text);
        try (ServletOutputStream out = resp.getOutputStream()) {
            ImageIO.write(image, "jpg", out);
        }
    }

}

