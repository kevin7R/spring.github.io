package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by chenkevin on 8/3/16.
 */
@Aspect
@Component
public class Audience {

    @Pointcut("execution(* concert.Performance.*())")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhone() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before watchPerformance");
        joinPoint.proceed();
        System.out.println("after watchPerformance");
    }

}
