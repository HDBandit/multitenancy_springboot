package com.hdbandit.multi_tenant;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

import com.hdbandit.multi_tenant.util.RequestContextHolderUtils;

@Component
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {
    
     @Override
     public String resolveCurrentTenantIdentifier() {
         return RequestContextHolderUtils.getCurrentTenantIdentifier();
     }
    
     @Override
     public boolean validateExistingCurrentSessions() {
         return true;
     }
}
