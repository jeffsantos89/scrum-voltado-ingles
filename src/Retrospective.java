import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Retrospective extends Meeting {
    private List<String> positives;
    private List<String> negatives;
    private List<String> actions;

    public Retrospective(LocalDate date) {
        super("Retrospective", "A meeting to reflect on the sprint and identify improvements", date);
        positives = new ArrayList<>();
        negatives = new ArrayList<>();
        actions = new ArrayList<>();
    }

    public void addPositive(String positive) {
        positives.add(positive);
    }

    public void addNegative(String negative) {
        negatives.add(negative);
    }

    public void addAction(String action) {
        actions.add(action);
    }

    @Override
    public void conductMeeting() {
        System.out.println("Retrospective on " + getDate() + ":");
        System.out.println("Positives:");
        for (String positive : positives) {
            System.out.println("- " + positive);
        }
        System.out.println("Negatives:");
        for (String negative : negatives) {
            System.out.println("- " + negative);
        }
        System.out.println("Actions:");
        for (String action : actions) {
            System.out.println("- " + action);
        }
    }

    public void Retrospective() {
        Retrospective Retrospective = new Retrospective(LocalDate.now());

        // Add positives
        Retrospective.addPositive("Learned new vocabulary");
        Retrospective.addPositive("Improved listening skills");

        // Add negatives
        Retrospective.addNegative("Difficult to understand some parts of the movie");
        Retrospective.addNegative("Had trouble finding time to read the article");

        // Add actions
        Retrospective.addAction("Schedule more time for English practice");
        Retrospective.addAction("Find more movies with English subtitles");

        Retrospective.conductMeeting();
    }
}

