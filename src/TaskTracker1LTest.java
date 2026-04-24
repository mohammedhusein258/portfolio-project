import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaskTracker1LTest {

    @Test
    public void testAddAndSize() {
        TaskTracker t = new TaskTracker1L();
        t.addTask("Homework");
        t.addTask("Workout");
        t.addTask("Study");

        assertEquals(3, t.size());
    }

    @Test
    public void testGetTask() {
        TaskTracker t = new TaskTracker1L();
        t.addTask("Homework");

        assertEquals("Homework", t.getTask(0));
    }

    @Test
    public void testRemoveTask() {
        TaskTracker t = new TaskTracker1L();
        t.addTask("Homework");
        t.addTask("Workout");

        String removed = t.removeTask(1);
        assertEquals("Workout", removed);
        assertEquals(1, t.size());
    }

    @Test
    public void testClear() {
        TaskTracker t = new TaskTracker1L();
        t.addTask("Homework");

        t.clear();
        assertEquals(0, t.size());
    }

    @Test
    public void testTransferFrom() {
        TaskTracker t1 = new TaskTracker1L();
        TaskTracker t2 = new TaskTracker1L();

        t2.addTask("Task A");

        t1.transferFrom(t2);

        assertEquals(1, t1.size());
        assertEquals(0, t2.size());
    }
}