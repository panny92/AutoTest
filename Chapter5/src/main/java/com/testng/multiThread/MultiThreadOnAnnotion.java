package com.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
//    invocationCount----表示执行的次数,threadPoolSize-----表示线程池的内线程的个数,timeOut-------超时时间-毫秒
    @Test(invocationCount = 10,threadPoolSize = 2,timeOut = 1000)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
