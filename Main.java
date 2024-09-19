import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newFixedThreadPool(4);

    TaskProcessor[] taskProcessors = new TaskProcessor[4];
    for (int i = 0; i < taskProcessors.length; i++) {
      taskProcessors[i] = new TaskProcessor(i + 5);
      executorService.submit(taskProcessors[i]);
    }

    executorService.shutdown();

    try {
      executorService.awaitTermination(1, TimeUnit.HOURS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
