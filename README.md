## Exercise: Fixed Thread Pool

#### Objective:

You will create a simple program that utilizes a fixed thread pool to perform parallel tasks.

#### Instructions:

1.	Create a class named TaskProcessor that implements the Runnable interface. This class will represent a task that calculates and prints the factorial of a given number.
2.	In the run() method of the TaskProcessor class, calculate the factorial of the given number and print the result.
3.	In the Main class, create an ExecutorService using Executors.newFixedThreadPool with a specified number of threads (e.g., 4).
4.	Create an array of TaskProcessor objects, each with a different number as input (e.g., 5, 6, 7, and 8).
5.	Submit each TaskProcessor to the ExecutorService for execution.
6.	Wait for all tasks to complete by calling shutdown() and awaitTermination() on the ExecutorService.
