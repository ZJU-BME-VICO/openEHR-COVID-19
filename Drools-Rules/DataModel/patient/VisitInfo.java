package cdss.kb.core.patient;

import cdss.kb.core.Core;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
@Data
public class VisitInfo extends Core {
    // 入院诊断
    private ArrayList<Diagnosis> diagnoses;
    // 就诊ID
    private String visitId;
    // 保险类型: 地方医保，地方公疗，军队医改，全费
    private String insuranceType;
    // 入院日期: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date enterDate;
    // 科室
    private String department;
    // 床号
    private String bedNumber;
    // 病区
    private String ward;
    // 负责医生
    private Provider staff;
    // 护理等级: 特级护理，一级护理，二级护理
    private String attentionLevel;

    public VisitInfo(){
        diagnoses = new ArrayList<>();
        staff = new Provider();
    }

    public void AddDiagnosis(Diagnosis diagnosis){
        this.diagnoses.add(diagnosis);
    }
}
