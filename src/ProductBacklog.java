import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductBacklog {
    private List<Task> tasks;

    public ProductBacklog() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> selectTasksForSprint() {
        List<Task> selectedTasks = new ArrayList<>();
        Random rand = new Random();
        int numTasks = rand.nextInt(tasks.size()) + 1; // Select between 1 and all tasks
        for (int i = 0; i < numTasks; i++) {
            Task task = tasks.get(rand.nextInt(tasks.size()));
            selectedTasks.add(task);
            tasks.remove(task);
        }
        return selectedTasks;
    }
}