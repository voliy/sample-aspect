package foo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SampleAspect {
    @Before("execution(* foo.SampleService.printRandomValue(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("joinPoint: " + joinPoint.getSignature().getName());
    }
}
