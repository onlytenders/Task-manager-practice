public class Worker {
    private OnTaskDoneListener taskCallback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener taskCallback, OnTaskErrorListener errorCallback) {
        this.taskCallback = taskCallback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                errorCallback.onError("There is a problem with the " + i + "rd task");
            }
            else {
                taskCallback.onDone("Task " + i + " is done");
            }
        }
    }
}
