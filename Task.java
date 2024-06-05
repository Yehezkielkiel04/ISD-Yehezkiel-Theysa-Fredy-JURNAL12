public class Task {
    int deadline;
    String description;

    public Task(int deadline, String description) {
        this.deadline = deadline;
        this.description = description;
    }

    @Override
    public String toString() {
        return deadline + ", " + description;
    }
}
