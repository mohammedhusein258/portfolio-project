public interface TaskTrackerKernel {

    void addTask(String task);

    String removeTask(int index);

    String getTask(int index);

    int size();
}