import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener taskListener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(taskListener, errorListener);
        worker.start();
    }
}
