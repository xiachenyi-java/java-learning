package com.example2.demo2.config;

import com.example2.demo2.common.JwtUtil;
import com.example2.demo2.common.UserContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 夏辰义
 * 2026/8/2117:59
 */
@Component
@RequiredArgsConstructor
public class LoginInterceptor implements HandlerInterceptor {

    private final JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request,
             HttpServletResponse response,Object handle) throws Exception{
        String token = request.getHeader("Authorization");
        if (token == null || token.isEmpty()){
            writeUnauthorized(response);
            return false;
        }
        if (token.startsWith("Bearer ")){
            token = token.substring(7);
        }
        try {
            jwtUtil.parseToken(token);
        }catch (Exception e){
            writeUnauthorized(response);
            return false;
        }
        // 5. 设置 ThreadLocal
        Integer userId = jwtUtil.getUserIdFromToken(token);
        UserContext.setUserId(userId);

        // 6. 放行
        return true;
    }
    private void writeUnauthorized(HttpServletResponse response) throws Exception {
        response.setStatus(401);                                    // HTTP 状态码 401
        response.setContentType("application/json;charset=UTF-8");  // 告诉浏览器这是 JSON
        response.getWriter().write("{\"code\":401,\"msg\":\"未登录或token无效\"}");
        response.getWriter().flush();                               // 立即发送，不要缓冲
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        UserContext.remove();
    }
}
