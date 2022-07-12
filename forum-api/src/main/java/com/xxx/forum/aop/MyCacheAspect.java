package com.xxx.forum.aop;

import com.alibaba.fastjson.JSON;
import com.xxx.forum.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.Duration;

@Slf4j
@Component
@Aspect
public class MyCacheAspect {
//    @Autowired
//    private RedisTemplate<String,String> redisTemplate;
//    @Around("@annotation(myCache)")
//    public Object around(ProceedingJoinPoint point,MyCache myCache) throws Throwable {
//        Signature signature = point.getSignature();
//        String className = signature.getDeclaringType().getName();
//        String methodName = signature.getName();
//        Class[] parameterTypes = new Class[point.getArgs().length];
//        Object[] args = point.getArgs();
//        String params = "";
//        for (int i = 0; i < args.length; i++) {
//            if(args[i]!=null){
//                params += JSON.toJSONString(args[i]);
//                parameterTypes[i] = args[i].getClass();
//            }else{
//                parameterTypes[i] = null;
//            }
//        }
//
//        String redisKey = className+"::"+methodName+"::"+params;
//        String redisValue = redisTemplate.opsForValue().get(redisKey);
//        if(StringUtils.hasLength(redisValue)){
//            log.info("从缓存取");
//            return JSON.parseObject(redisValue, Result.class);
//        }
//        Object result = point.proceed();
//        redisTemplate.opsForValue().set(redisKey,JSON.toJSONString(result), Duration.ofMillis(myCache.expire()));
//        log.info("存到缓存");
//        return result;
//    }
}
