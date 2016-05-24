package com.hdbandit.multi_tenant.util;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.hdbandit.multi_tenant.constants.CustomRequestAttributes;

public class RequestContextHolderUtils {
    
   private static final String DEFAULT_TENANT_ID = "tenant_1";

   public static final String getCurrentTenantIdentifier() {
       RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
       if (requestAttributes != null) {
            String identifier = (String) requestAttributes.getAttribute(CustomRequestAttributes.CURRENT_TENANT_IDENTIFIER,RequestAttributes.SCOPE_REQUEST);
            if (identifier != null) {
                return identifier;
            }
       }
       return DEFAULT_TENANT_ID;
   }

}
