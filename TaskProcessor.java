public class TaskProcessor implements Runnable {

    private final int number;

    public TaskProcessor(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Factorial of " + number + " is " + factorial);
        System.out.println("Calculation of factorial for number: # " + number + " took " + (endTime - startTime) + " ms");
    }
}
