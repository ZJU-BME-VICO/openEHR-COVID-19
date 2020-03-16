package cdss.kb.core;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class Scenario  extends Core{
    // 清单的核查者
    private ArrayList<StaffInformation> performers;
    // 清单当前的状态
    private String status;
    // 清单完成时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date performedTime;
    // 整张清单的备注
    private String note;
    // 清单的前置规则（暂时不需要）
    private String preloadRuleID;
    // 清单的后置规则（暂时不需要）
    private String postSubmittionRuleID;
    // 临床问题（即清单分组）
    private ArrayList<Problem> problems = new ArrayList<>();
    // 清单ID
    private String scenarioID;
    // 清单名（标题） 比如概览，详细信息，查房前端
    private String scenarioName;
    // 清单实例名（暂时不需要）
    private String scenarioInstanceID;
    // 暂时不需要
    private String isScenarioGroup;
    // 暂时不需要
    private String groupedItems;
    // 暂时不需要
    private String refScenario;
    // 清单对应的样式
    private Boolean layout;
    // 暂时不需要
    private String isActive;
    // 清单属于的角色，由推理引擎推出
    private String role;
    // 填补的数据（暂时不需要）
    private String inputData;


    public Scenario(){
//        problems = new ArrayList<Problem>();
//
//        problems.add(new Problem());
    }

//    public Scenario(String status, ArrayList<Problem> problems, String scenarioName) {
//        this.status = status;
//        this.problems = problems;
//        this.scenarioName = scenarioName;
//    }

    public void addProblem(Problem problem){
        this.problems.add(problem);
    }

    public Problem getProblem(String problemID){
        Optional<Problem> problem  = this.problems.stream().filter(problem1 -> problemID.equals(problem1.getProblemID())).findFirst();
        return problem.orElse(null);
    }


    public ArrayList<StaffInformation> getPerformers() {
        return performers;
    }

    public void setPerformers(ArrayList<StaffInformation> performers) {
        this.performers = performers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPerformedTime() {
        return performedTime;
    }

    public void setPerformedTime(Date performedTime) {
        this.performedTime = performedTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPreloadRuleID() {
        return preloadRuleID;
    }

    public void setPreloadRuleID(String preloadRuleID) {
        this.preloadRuleID = preloadRuleID;
    }

    public String getPostSubmittionRuleID() {
        return postSubmittionRuleID;
    }

    public void setPostSubmittionRuleID(String postSubmittionRuleID) {
        this.postSubmittionRuleID = postSubmittionRuleID;
    }

    public ArrayList<Problem> getProblems() {
        return problems;
    }

    public void setProblems(ArrayList<Problem> problems) {
        this.problems = problems;
    }

    public String getScenarioID() {
        return scenarioID;
    }

    public void setScenarioID(String scenarioID) {
        this.scenarioID = scenarioID;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public String getScenarioInstanceID() {
        return scenarioInstanceID;
    }

    public void setScenarioInstanceID(String scenarioInstanceID) {
        this.scenarioInstanceID = scenarioInstanceID;
    }

    public String getIsScenarioGroup() {
        return isScenarioGroup;
    }

    public void setIsScenarioGroup(String isScenarioGroup) {
        this.isScenarioGroup = isScenarioGroup;
    }

    public String getGroupedItems() {
        return groupedItems;
    }

    public void setGroupedItems(String groupedItems) {
        this.groupedItems = groupedItems;
    }

    public String getRefScenario() {
        return refScenario;
    }

    public void setRefScenario(String refScenario) {
        this.refScenario = refScenario;
    }

    public Boolean getLayout() {
        return layout;
    }

    public void setLayout(Boolean layout) {
        this.layout = layout;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }


}
