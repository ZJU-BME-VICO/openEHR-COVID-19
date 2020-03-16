package cdss.kb.core;

import java.util.ArrayList;

public class Explanation {
    private ArrayList<Description> explanation = new ArrayList<Description>();
    public void Explanation(){

    }

    public ArrayList<Description> getExplanation() {
        return explanation;
    }

    public void setExplanation(ArrayList<Description> explanation) {
        this.explanation = explanation;
    }

    public void addDescription(Description description){
        this.explanation.add(description);
    }
}
