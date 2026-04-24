public abstract class TaskTrackerSecondary implements TaskTracker {

    @Override
    public void clear() {
        while (this.size() > 0) {
            this.removeTask(0);
        }
    }

    @Override
    public void transferFrom(TaskTracker source) {
        TaskTracker temp = this.newInstance();

        while (source.size() > 0) {
            temp.addTask(source.removeTask(0));
        }

        while (temp.size() > 0) {
            this.addTask(temp.removeTask(0));
        }
    }
}