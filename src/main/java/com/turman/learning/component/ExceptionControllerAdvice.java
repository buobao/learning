package com.turman.learning.component;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 控制器增强器
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(RuntimeException.class)
    public String handleException(RuntimeException e, Model model) {
        return "errorPage";  //错误页面试图名称
    }
}
