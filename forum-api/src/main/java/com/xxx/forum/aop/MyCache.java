package com.xxx.forum.aop;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyCache {
    String key() default "";
    long expire() default 10*60*1000;
}
