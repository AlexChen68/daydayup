package tech.alexchen.daydayup.java.hutool;

import cn.hutool.jwt.JWT;

/**
 * @author alexchen
 */
public class JWTDemo {

    public static void main(String[] args) {
        String token  = JWT.create()
                .setPayload("id", 1024)
                .setPayload("name", "alexchen")
                .setPayload("phone", "18388888888")
                .setKey("alexchen.tech@gmail.com".getBytes())
                .sign();
        System.out.println(token);
    }
}
