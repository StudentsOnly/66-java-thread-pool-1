import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        TaskProcessor[] tasks = {
                new TaskProcessor(5),
                new TaskProcessor(6),
                new TaskProcessor(7),
                new TaskProcessor(8)
        };

        for (TaskProcessor task : tasks) {
            executorService.submit(task);
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(Integer.MAX_VALUE, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed.");
    }
}