import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private List<Task> tasks;
    private LocalDate startDate;
    private LocalDate endDate;

    public Sprint() {
        tasks = new ArrayList<>();
        startDate = LocalDate.now();
        endDate = startDate.plusWeeks(2); // 2-week sprint by default
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void review() {
        for (Task task : tasks) {
            task.review();
        }
    }
}
