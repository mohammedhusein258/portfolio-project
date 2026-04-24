public interface TaskTracker extends TaskTrackerKernel {

    TaskTracker newInstance();

    void clear();

    void transferFrom(TaskTracker source);
}
//
