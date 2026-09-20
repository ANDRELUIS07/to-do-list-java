package include;

public class Task {
    private String name;
    private boolean status = false;

    public Task(String name, boolean status){
        this.name = name;
        this.status = status;
    }

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
