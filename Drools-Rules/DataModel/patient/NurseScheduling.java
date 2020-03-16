package cdss.kb.core.patient;

import cdss.kb.core.Core;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class NurseScheduling extends Core {
    // 负责护士
    private Provider staff;
    // 日期: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dateTime;
    // 科室
    private String department;
    // 病区
    private String ward;
}
