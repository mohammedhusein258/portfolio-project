public interface TaskTracker extends TaskTrackerKernel {
    boolean isCompleted(String task);
    int completedCount();
    int remainingTasks();

}