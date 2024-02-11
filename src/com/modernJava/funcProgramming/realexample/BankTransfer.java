package com.modernJava.funcProgramming.realexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {
    public static void main(String[] args) {
        AccountFactory accountFactory = BankAccount::new;
        BankAccount studentBankAccount = accountFactory.getBankAccount(1, 50000, "StudentA");
        BankAccount universitybankAccount = accountFactory.getBankAccount(2, 100000, "university");

        BiPredicate<Double, Double> p1 = (balance, amount) -> balance > amount;
        BiConsumer<String, Double> printer = (x, y) -> System.out.println(x + y);
        BiConsumer<BankAccount, BankAccount> printer2 = (student, university) -> {
            System.out.println("Ending balance of the student account : " + studentBankAccount.getBalance() +
                    " University bank account : " + universitybankAccount.getBalance());
        };

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " says :: Executing Transfer");
            try {
                double amount = 1000;
                if (!p1.test(studentBankAccount.getBalance(), amount)) {
                    printer.accept(Thread.currentThread().getName() + " says :: balance insufficient, ", amount);
                    return;
                }
                while (!studentBankAccount.transfer(universitybankAccount, amount)) {
                    TimeUnit.MILLISECONDS.sleep(100);
                    continue;
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        });
        printer.accept(Thread.currentThread().getName() + " says transfer successful: Balance in account :", universitybankAccount.getBalance());

        for (int i = 0; i < 20; i++) {
            executorService.submit(t1);
        }
        executorService.shutdown();

        try {
            while (!executorService.awaitTermination(24L, TimeUnit.HOURS)) {
                System.out.println("Not yet. Still waiting for termination");
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        printer2.accept(studentBankAccount, universitybankAccount);
    }
}
