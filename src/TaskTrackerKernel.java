public interface TaskTrackerKernel {
    void addTask(String task);

    void completeTask(String task);

    int size();

}