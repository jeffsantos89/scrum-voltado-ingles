
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScrumEnglishLearningSystem {
    private List<Sprint> sprints;
    private ProductBacklog productBacklog;

    public ScrumEnglishLearningSystem() {
        sprints = new ArrayList<>();
        productBacklog = new ProductBacklog();
    }

    public void createSprint() {
        Sprint sprint = new Sprint();
        List<Task> tasks = productBacklog.selectTasksForSprint();
        sprint.setTasks(tasks);
        sprints.add(sprint);
    }

    public void reviewSprints() {
        for (Sprint sprint : sprints) {
            sprint.review();
        }
    }

    public void retrospective() {
        // TODO: Implement retrospective functionality
    }

    public static void main(String[] args) {
        ScrumEnglishLearningSystem scrum = new ScrumEnglishLearningSystem();

        // Create tasks
        Task task1 = new Task("Watch a movie in English");
        task1.setDescription("Watch a movie in English with English subtitles, and take notes of new vocabulary.");

        Task task2 = new Task("Read an article in English");
        task2.setDescription("Read an article in English and summarize it in writing.");

        Task task3 = new Task("Write a paragraph in English");
        task3.setDescription("Write a paragraph in English on a topic of your choice, and have it reviewed by a native speaker.");

        // Add tasks to backlog
        scrum.productBacklog.addTask(task1);
        scrum.productBacklog.addTask(task2);
        scrum.productBacklog.addTask(task3);

        // Create sprints
        scrum.createSprint();
        scrum.createSprint();

        // Review sprints
        scrum.reviewSprints();
    }
}