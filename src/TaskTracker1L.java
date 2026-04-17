import java.util.ArrayList;

public class TaskTracker1L extends TaskTrackerSecondary {
    /**
     * Representation invariant: rep != null
     *
     * Abstraction relation: this = sequence of tasks stored in rep where
     * rep.get(i) is the task at position i
     */
    private ArrayList<String> rep;

    public TaskTracker1L() {
        this.rep = new ArrayList<>();
    }

    @Override
    public void addTask(String task) {
        this.rep.add(task);
    }

    @Override
    public String removeTask(int index) {
        return this.rep.remove(index);
    }

    @Override
    public String getTask(int index) {
        return this.rep.get(index);
    }

    @Override
    public int size() {
        return this.rep.size();
    }

    @Override
    public void clear() {
        this.rep = new ArrayList<>();
    }

    @Override
    public TaskTracker newInstance() {
        return new TaskTracker1L();
    }

    @Override
    public void transferFrom(TaskTracker source) {
        TaskTracker1L localSource = (TaskTracker1L) source;
        this.rep = localSource.rep;
        localSource.rep = new ArrayList<>();
    }
}