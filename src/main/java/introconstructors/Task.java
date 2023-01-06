package introconstructors;

import java.time.LocalDateTime;

public class Task {

    private final String title;
    private final String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start() {
        this.startDateTime = LocalDateTime.now();
    }

    public static void main(String[] args) {
        Task task = new Task("Mozi", "filmnézés");

        task.setDuration(120);

        task.start();

        System.out.println("title: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Start time: " + task.getStartDateTime());
        System.out.println("Duration: " + task.getDuration());
    }
}
