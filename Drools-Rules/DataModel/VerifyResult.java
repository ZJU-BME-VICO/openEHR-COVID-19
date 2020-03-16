package cdss.kb.core;

import java.util.ArrayList;

public class VerifyResult {
    private ArrayList<ReviewResult> reviewResults;

    public VerifyResult() {
        this.reviewResults = new ArrayList<>();
        this.reviewResults.add(new ReviewResult());
    }

    public ArrayList<ReviewResult> getReviewResults() {
        return reviewResults;
    }

    public void setReviewResults(ArrayList<ReviewResult> reviewResults) {
        this.reviewResults = reviewResults;
    }
}
