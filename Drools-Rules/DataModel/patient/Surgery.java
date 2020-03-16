package cdss.kb.core.patient;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class Surgery {
    // 手术名称
    private String itemName;
    // 手术编码
    private String itemCode;
    // 手术申请时间: yyyy-MM-dd HH:mm:ss
    private Date requestDateTime;
    // 手术申请部门
    private String requestDept;
    // 手术执行状态: 已执行，未执行，作废
    private String status;
    // 手术执行时间: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss" )
    private Date performDateTime;
    // 手术执行部门
    private String performDept;
    // 手术执行医生
    private ArrayList<Provider> staff;

    public Surgery() {
        staff = new ArrayList<>();
    }
}
