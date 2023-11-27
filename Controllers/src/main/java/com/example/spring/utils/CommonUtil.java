package com.example.spring.utils;

import jakarta.servlet.http.HttpServletRequest;

public class CommonUtil {
    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");

        return request.getRemoteAddr();
    }
}
