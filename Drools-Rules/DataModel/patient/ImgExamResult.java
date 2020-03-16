package cdss.kb.core.patient;

import cdss.kb.core.Core;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class ImgExamResult extends Core {
    // 检查项目名称
    private String itemName;
    // 检查项目编码
    private Code itemCode;
    // 检查申请时间: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date requestDateTime;
    // 检查申请部门
    private String requestDept;
    // 检查执行状态: 已执行，未执行，作废
    private String status;
    // 检查结果描述
    private String description;
    // 检查报告时间: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date reportDateTime;
    // 检查执行部门
    private String performDept;


}
