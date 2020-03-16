package cdss.kb.core;

import java.util.ArrayList;
import java.util.Optional;

public class Problem  extends Core{
    // 任务  例如:01
    private ArrayList<Task> tasks = new ArrayList<>();
    // 问题ID  例如:01
    private String problemID;

    public Problem(String problemName) {
        this.problemName = problemName;
        this.problemID = problemName;
    }

    public Problem(){}

    //问题名称（分组名称）
    private String problemName;

    public void addTask(Task task){
        this.tasks.add(task);
    }

    public Task getTaskById(String taskId){
        Optional<Task> task  = this.tasks.stream().filter(task1 -> taskId.equals(task1.getTaskID())).findFirst();
        return task.orElse(null);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public String getProblemID() {
        return problemID;
    }

    public void setProblemID(String problemID) {
        this.problemID = problemID;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

}
