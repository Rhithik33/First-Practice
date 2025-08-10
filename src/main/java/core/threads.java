package core;

import org.apache.hc.core5.concurrent.DefaultThreadFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class threads {

    public static void main(String[] args) throws InterruptedException
    {

        // Synchronous or sequenctial
        Map<String, String> map = new HashMap<>();
//        String shyam = threads.apiCall(map);
//        System.out.println(shyam);
//
//        String rithu = threads.apiCall(map);
//        System.out.println(rithu);

        // Threading - concurrent (context-switching)
//
        Runnable task1 = () -> {
            try {
                String result = apiCall(map);
                System.out.println(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
//
//        Thread t1 = new Thread(task1);
//        t1.setName("shyam");
//        t1.start();
//
//        Thread t2 = new Thread(task1);
//        t2.setName("rithu");
//        t2.start();
//
        // Asynchronous - Non blocking IO

//        System.out.println("Main thread: " + Thread.currentThread().getName());
//
//        // Simulate async API call
//        CompletableFuture<String> apiFuture = CompletableFuture.supplyAsync(() -> {
//            try {
//                return apiCall(map);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        CompletableFuture<String> api2Future = CompletableFuture.supplyAsync(() -> {
//            try {
//                return apiCall(map);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        // Handle the result when it's ready
//        apiFuture.thenAccept(result -> {
//            System.out.println("API Response: " + result);
//            System.out.println("Handled by thread: " + Thread.currentThread().getName());
//        });
//
//        api2Future.thenAccept(result -> {
//            System.out.println("API Response: " + result);
//            System.out.println("Handled by thread: " + Thread.currentThread().getName());
//        });
//
//        // Main thread continues doing other work
//        System.out.println("Main continues doing other work...");
//
//        // Optional: prevent program from exiting immediately
//        try {
//            TimeUnit.SECONDS.sleep(15); // wait for async task to finish
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // Executor service

//        ExecutorService executor = Executors.newFixedThreadPool(3);
//
//        executor.submit(task1);
//        executor.submit(task1);
//
//        System.out.println("ENd");
//
//        executor.shutdown();

        // 2 seconds run a task
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

        executorService.schedule(task1, 10, TimeUnit.SECONDS);
//        executorService.schedule(task1, 4, TimeUnit.SECONDS);

        executorService.shutdown();


    }

    public static String apiCall(Map<String, String> map) throws InterruptedException
    {
        System.out.println("Executing current thread - " + Thread.currentThread().getName());
        map.put("shyam", "good");
        Thread.sleep(10000);
        return "hello from " + Thread.currentThread().getName();
    }
}
