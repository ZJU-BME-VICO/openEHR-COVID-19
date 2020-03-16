package cdss.kb.core;

import java.util.ArrayList;

public class RuleIdentification {
    private ArrayList<String> RuleIdentification;

    public RuleIdentification(ArrayList<String> ruleIdentification) {
        RuleIdentification = ruleIdentification;
    }

    public ArrayList<String> getRuleIdentification() {
        return RuleIdentification;
    }

    public RuleIdentification() {
        RuleIdentification = new ArrayList<>();
    }

    public void setRuleIdentification(ArrayList<String> ruleIdentification) {
        RuleIdentification = ruleIdentification;
    }
}
