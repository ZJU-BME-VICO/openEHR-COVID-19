package cdss.kb.core.patient;

import cdss.kb.core.Core;
import lombok.Data;

import java.util.ArrayList;
@Data
public class FamilyHistory extends Core {
    // 亲属关系
    private String relationship;
    // 家族史名称
    private ArrayList<Diagnosis> diagnoses;
    public FamilyHistory(){
        diagnoses = new ArrayList<>();
    }
}
