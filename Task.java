import java.time.LocalDate;

class Task {
    private String name;
    private String category;
    private LocalDate dueDate;
    private boolean isComplete;

    public Task(String name, String category, LocalDate dueDate) {
        this.name = name;
        this.category = category;
        this.dueDate = dueDate;
        this.isComplete = false;
    }

    public void markAsComplete() {
        this.isComplete = true;
    }

    // Getters and Setters for the fields
}
