package tech.alexchen.springboot.security.server.handler;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 自定义 AuthenticationProvider，增加验证码比对
 *
 * @author alexchen
 */
public class MyAuthenticationProvider extends DaoAuthenticationProvider {

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails,
                                                  UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        // 验证码比对
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        String code = req.getParameter("captcha");
        HttpSession session = req.getSession(false);
        String verify_code = (String) session.getAttribute("captcha");
        if (code == null || !code.equals(verify_code)) {
            throw new AuthenticationServiceException("验证码错误");
        }
        // 密码比对
        super.additionalAuthenticationChecks(userDetails, authentication);
    }
}

