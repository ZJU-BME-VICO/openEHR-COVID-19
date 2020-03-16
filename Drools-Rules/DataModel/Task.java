package cdss.kb.core;

import java.util.ArrayList;

public class Task  extends Core {
    // 核查项的内容
    private Description description;
    // 对核查项的解释
    private ArrayList<Description> explanation;
    // 核查结果 例如‘false’
    private String result;
    // 备注
    private String note;
    // 暂时不需要
    private String preConditionID;
    // 暂时不需要
    private String assistantRuleID;
    // 暂时不需要
    private String postEffectID;
    // 是否必须核查
    private Boolean mandatory;
    // 核查项名称
    private String taskName;
    // 核查项ID
    private String taskID;
    // 核查项类型（暂时不需要）
    private String type;
    // 核查项的实例名
    private String taskInstanceID;

    public void Task(){
        this.explanation = new ArrayList<Description>();
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public ArrayList<Description> getExplanation() {
        return explanation;
    }

    public void setExplanation(ArrayList<Description> explanation) {
        this.explanation = explanation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPreConditionID() {
        return preConditionID;
    }

    public void setPreConditionID(String preConditionID) {
        this.preConditionID = preConditionID;
    }

    public String getAssistantRuleID() {
        return assistantRuleID;
    }

    public void setAssistantRuleID(String assistantRuleID) {
        this.assistantRuleID = assistantRuleID;
    }

    public String getPostEffectID() {
        return postEffectID;
    }

    public void setPostEffectID(String postEffectID) {
        this.postEffectID = postEffectID;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaskInstanceID() {
        return taskInstanceID;
    }

    public void setTaskInstanceID(String taskInstanceID) {
        this.taskInstanceID = taskInstanceID;
    }
}
