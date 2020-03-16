package cdss.kb.core.patient;

import cdss.kb.core.Core;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class FinancialInfo extends Core {
    // 日期  yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dateTime;
    // 金额
    private String amount;
    // 项目
    private String itemName;
    // 编码
    private Code itemCode;
}
