package cdss.kb.core;

import java.util.ArrayList;
import java.util.Optional;

public class Process extends Core {
    // 具体清单页
    private ArrayList<Scenario> scenarios = new ArrayList<>();
    // 临床路径ID
    private String processID;
    // 临床路径名称
    private String processName;
    // 临床路径实例名
    private String caseID;
    // 临床路径的状态
    private String status;


    public Process() {

    }

    public void addScenario(Scenario scenario){
        this.scenarios.add(scenario);
    }

    public Scenario getScenario(String ScenarioId){
        Optional<Scenario> scenario  = this.scenarios.stream().filter(scenario1 -> ScenarioId.equals(scenario1.getScenarioID())).findFirst();
        return scenario.orElse(null);
    }

    public ArrayList<Scenario> getScenarios() {
        return scenarios;
    }

    public void setScenarios(ArrayList<Scenario> scenarios) {
        this.scenarios = scenarios;
    }

    public String getProcessID() {
        return processID;
    }

    public void setProcessID(String processID) {
        this.processID = processID;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
