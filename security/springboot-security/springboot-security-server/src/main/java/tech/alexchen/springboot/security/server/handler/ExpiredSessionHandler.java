package tech.alexchen.springboot.security.server.handler;

import cn.hutool.json.JSONUtil;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Session 过期处理器
 *
 * @author alexchen
 */
public class ExpiredSessionHandler implements SessionInformationExpiredStrategy {

    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent event)
            throws IOException {
        String msg = "登录超时或已在另一台机器登录，您被迫下线！";
        HttpServletResponse response = event.getResponse();
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(msg);
    }

}
