import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    public class DailyScrum extends Meeting {
        private List<Task> tasks;


        public DailyScrum(LocalDate date) {
            super("Daily Scrum", "A daily meeting to discuss progress and plan for the day", date);
            tasks = new ArrayList<>();
        }

        public void addTask(Task task) {
            tasks.add(task);
        }

        public List<Task> getTasks() {
            return tasks;
        }

        @Override
        public void conductMeeting() {
            System.out.println("Daily Scrum on " + getDate() + ":");
            System.out.println("Tasks for the day:");
            for (Task task : tasks) {
                System.out.println("- " + task.getName());
            }
        }
    }
