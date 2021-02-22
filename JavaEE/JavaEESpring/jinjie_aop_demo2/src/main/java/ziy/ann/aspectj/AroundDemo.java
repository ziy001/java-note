package ziy.ann.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author ziy
 * @version 1.0
 * @date 上午11:49 2020/10/22
 * @description TODO:
 * @className AroundDemo
 */
@Aspect
public class AroundDemo {
    @Around(value = "ziy.ann.aspectj.Custom.myPointcut1()")
    private void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        proceedingJoinPoint.proceed();
    }
}
