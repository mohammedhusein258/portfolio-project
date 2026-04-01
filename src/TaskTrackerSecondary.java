/**
 * Secondary methods implementation for my TaskTracker component.
 */
public abstract class TaskTrackerSecondary implements TaskTracker {

    @Override
    public boolean isCompleted(String task) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int completedCount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int remainingTasks() {
        return this.size();
    }

    @Override
    public String toString() {
        return "TaskTracker with " + this.size() + " tasks";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TaskTracker)) {
            return false;
        }
        TaskTracker other = (TaskTracker) obj;
        return this.size() == other.size();

    }
}