package SynchronizationIssue.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();


        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Void> adderFuture = executorService.submit(adder);
        Future<Void> subtractorFuture = executorService.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(value.getX());
    }
}

// HW : void and Void are same
// after the class, figure out the difference