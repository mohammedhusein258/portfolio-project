public class TaskTracker {

    private String[] tasks;
    private boolean[] completed;
    private int size;

    public TaskTracker() {
        this.tasks = new String[10];
        this.completed = new boolean[10];
        this.size = 0;
    }

    public void addTask(String task) {
        this.tasks[this.size] = task;
        this.completed[this.size] = false;
        this.size++;
    }

    public void completeTask(int index) {
        if (index >= 0 && index < this.size) {
            this.completed[index] = true;
        }
    }

    public void displayTasks() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.tasks[i] + " - "
                    + (this.completed[i] ? "Done" : "Not Done"));
        }
    }

    public static void main(String[] args) {

        TaskTracker tracker = new TaskTracker();

        tracker.addTask("Finish homework");
        tracker.addTask("Study for exam");
        tracker.addTask("Go to gym");

        tracker.completeTask(1);

        tracker.displayTasks();
    }
}