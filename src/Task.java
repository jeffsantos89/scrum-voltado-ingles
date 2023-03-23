import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String description;
    private boolean isComplete;
    private List<String> notes;


    public Task(String name) {
        this.name = name;
        notes = new ArrayList<>();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addNotes(String note) {
        notes.add(note);
    }

    public void review() {
        isComplete = true;
        System.out.println("Task \"" + name + "\" is complete.");
    }

    public String getName() {
        return name;
    }
}