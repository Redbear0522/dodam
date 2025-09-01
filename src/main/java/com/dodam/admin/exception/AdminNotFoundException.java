package com.dodam.admin.exception;

/**
 * 관리자를 찾을 수 없을 때 발생하는 예외
 */
public class AdminNotFoundException extends RuntimeException {
    
    public AdminNotFoundException(String message) {
        super(message);
    }
    
    public AdminNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}