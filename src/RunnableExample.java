import java.util.stream.IntStream;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Traditional" + sum);
            }
        };
        new Thread(runnable).start();


        //using runnable
        Runnable runnable1 = () -> {
            System.out.println("Runnable " + IntStream.range(0, 10).sum());
        };
        new Thread(runnable1).start();

        //using Thread
        new Thread(() -> {
            System.out.println("Tread " + IntStream.range(0, 10).sum());
        }).start();
    }
}

