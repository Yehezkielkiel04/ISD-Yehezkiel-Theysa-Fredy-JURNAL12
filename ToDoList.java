import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ToDoList {
    private ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(int deadline, String description) {
        Task newTask = new Task(deadline, description);
        tasks.add(newTask);
        sortTasks();
    }

    public void removeTask() {
        if (!tasks.isEmpty()) {
            Task removedTask = tasks.remove(0);
            System.out.println("Task \"" + removedTask.description + "\" selesai dilaksanakan, berikutnya:");
        } else {
            System.out.println("Tidak ada task yang tersisa.");
        }
    }

    public void showNextTask() {
        if (!tasks.isEmpty()) {
            System.out.println("Task terdekat yang harus diselesaikan: " + tasks.get(0).description);
        } else {
            System.out.println("Tidak ada task yang tersisa.");
        }
    }

    public void clearTasks() {
        tasks.clear();
        System.out.println("Semua task telah dihapus.");
    }

    private void sortTasks() {
        Collections.sort(tasks, Comparator.comparingInt(task -> task.deadline));
    }
}
