package foo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnotherAspect {
    @Before("execution(* foo.SampleService.printRandomValue(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("AnotherAspect, joinPoint: " + joinPoint.getSignature().getName());
    }
}
