package com.classpick.web.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.classpick.web.account.controller.AccountController;
import com.classpick.web.common.response.ResponseDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetAuthenUser {
   public static String getAuthenUser() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
              
        if (authentication == null) {
            log.info("No authentication found");
            return null;
        }
                
        String memberId = authentication.getName();
        
        if (memberId == null || memberId.isEmpty()) {
            log.info("Member ID is null or empty");
            return null;
        }

        return memberId;
    }
}
