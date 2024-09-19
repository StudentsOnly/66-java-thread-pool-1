public class TaskProcessor implements Runnable {
    private int number;

    public TaskProcessor(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("\tStart thread for " + number);
        System.out.printf("\tFactorial of %d is %d\n", number, calculateFactorial());
        System.out.println("\tFinish thread for " + number);
    }

    private int calculateFactorial() {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            try {
                Thread.sleep(500); // simulate long calculation
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        return "task for number " + number;
    }
}
