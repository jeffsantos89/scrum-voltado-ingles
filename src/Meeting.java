import java.time.LocalDate;

public abstract class Meeting {
    private String name;
    private String description;
    private LocalDate date;


    public Meeting(String name, String description, LocalDate date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public abstract void conductMeeting();
}