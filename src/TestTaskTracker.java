public class TestTaskTracker {
    public static void main(String[] args) {
        TaskTracker t = new TaskTracker1L();

        // add tasks
        t.addTask("Homework");
        t.addTask("Workout");
        t.addTask("Study");

        // test size
        System.out.println("Size: " + t.size()); // expect 3

        // test getTask
        System.out.println("Task 1: " + t.getTask(0)); // Homework

        // test removeTask
        System.out.println("Removed: " + t.removeTask(1)); // Workout

        // test size after remove
        System.out.println("Size after remove: " + t.size()); // 2

        // test clear
        t.clear();
        System.out.println("Size after clear: " + t.size()); // 0

        // test transferFrom
        TaskTracker t2 = new TaskTracker1L();
        t2.addTask("Task A");

        t.transferFrom(t2);

        System.out.println("t size: " + t.size()); // 1
        System.out.println("t2 size: " + t2.size()); // 0
    }
}