package cdss.kb.core.patient;

import cdss.kb.core.Core;
import lombok.Data;

@Data
public class Transfer extends Core {
    // 转入科室
    private String department;
    // 转入床号;
    private String bedNumber;
    // 转入病区
    private String ward;
    // 负责医生
    private Provider staff;
}
