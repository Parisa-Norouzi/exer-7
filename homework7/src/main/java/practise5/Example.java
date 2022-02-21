package practise5;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        //Thread thread1 = new Thread(Example::thread1);
        Deposit deposit1=new Deposit("224",1000);
        Deposit deposit2=new Deposit("225",500);
        DepositService Transaction=new DepositService();
       // Transaction.transfer(deposit1, deposit2, 200);
        //threads.add(Transaction.transfer(deposit1, deposit2, 200));

        Thread thread1 = new Thread(()->{
               System.out.println(Thread.currentThread().getName() + " is running");
               threads.add(Transaction.transfer(deposit1, deposit2, 200));
        });
        Thread thread2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " is running");
            threads.add(Transaction.transfer(deposit1, deposit2, 100));
        });
        Thread thread3 = new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " is running");
            threads.add(Transaction.transfer(deposit2, deposit1, 50));
         });

        thread1.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("final balance is:"+deposit1.getBalance());
        System.out.println("final balance is:"+deposit2.getBalance());
        }

    }

