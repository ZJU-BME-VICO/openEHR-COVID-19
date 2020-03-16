package cdss.kb.core.patient;

import cdss.kb.core.Core;
import cdss.kb.core.Process;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Data
public class PastHistory extends Core {
    // 既往史名称
    private ArrayList<Diagnosis> items;
    // 发生时间: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date appearDateTime;
    public Diagnosis getDiagnosis(String diagnosisName) {
        Optional<Diagnosis> diagnosis  = this.items.stream().filter(diagnosis1 -> diagnosisName.equals(diagnosis1.getItemName())).findFirst();
        return diagnosis.orElse(null);
    }
    public PastHistory(){
        items = new ArrayList<Diagnosis>();
    }

}
