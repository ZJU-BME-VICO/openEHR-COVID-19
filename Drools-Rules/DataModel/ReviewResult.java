package cdss.kb.core;

public class ReviewResult {
    private String taskID; // 核查项的ID
    private String passReview; // true,false审核是否通过
    private String explaination; // 对审核结果的解释

    public ReviewResult() {
        taskID = "";
        passReview = "";
        explaination = "";
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getPassReview() {
        return passReview;
    }

    public void setPassReview(String passReview) {
        this.passReview = passReview;
    }

    public String getExplaination() {
        return explaination;
    }

    public void setExplaination(String explaination) {
        this.explaination = explaination;
    }
}
