package com.gwm.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle方法在控制器的处理请求方法前执行···");
        String url = request.getRequestURI();
        if(url.indexOf("/toLogin")>0||url.indexOf("login")>0){
            return true;
        }
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("user");
        if(obj!=null){
            return true;
        }
        request.setAttribute("msg","还未登录，请先登录！");
        request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle方法在控制器的处理请求方法 调用 后执行，在解析视图之前执行···");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("afterCompletion方法在控制器的处理请求方法 执行完成 后执行，即视图渲染后执行···");
    }
}
