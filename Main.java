import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);

        TaskProcessor[] array = {
                new TaskProcessor(5),
                new TaskProcessor(6),
                new TaskProcessor(7),
                new TaskProcessor(8),
                new TaskProcessor(9)
        };

        for (var element : array) {
            System.out.println("Submitting " + element);
            service.submit(element);
        }
        System.out.println("All tasks are submitted");

        service.shutdown();
        try {
            service.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Exiting main thread");
    }
}
