public class TaskProcessor implements Runnable {

  private long number;

  public TaskProcessor(long number) {
    this.number = number;
  }

  @Override
  public void run() {
    factorial(number);
  }

  private void factorial(long number) {
    long factorial = number;
    for (long i = 1; i < number; i++) {
      factorial *= i;
    }
    System.out.println("Factorial of " + number + " is " + factorial);
  }
}
