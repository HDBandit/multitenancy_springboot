package com.hdbandit.multi_tenant.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hdbandit.multi_tenant.constants.CustomRequestAttributes;

public class MultitenancyInterceptor extends HandlerInterceptorAdapter {
    
    private static final String TENANT_PATH_VARIABLE = "tenantId";

    @SuppressWarnings("unchecked")
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
         Map<String, Object> pathVars = (Map<String, Object>) req.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
         
         if (pathVars.containsKey(TENANT_PATH_VARIABLE)) {
             req.setAttribute(CustomRequestAttributes.CURRENT_TENANT_IDENTIFIER, pathVars.get(TENANT_PATH_VARIABLE));
         }
         
         return true;
    }

}
