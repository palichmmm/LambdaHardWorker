public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    private int error = 33;
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == error) {
                errorCallback.onError("Task " + i + " error!");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
