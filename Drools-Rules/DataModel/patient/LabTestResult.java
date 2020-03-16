package cdss.kb.core.patient;

import cdss.kb.core.Core;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class LabTestResult extends Core {
    //设置检验项目的分类
    private String itemCategory;
    // 检验项目名称
    private String itemName;
    // 检验项目编码
    private Code itemCode;
    // 检验申请时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date requestDateTime;
    // 检验申请部门
    private String requestDept;
    // 检验结果描述
    private String result;
    // 单位
    private String unit;
    // 参考范围
    private String referenceValue;
    // 检验报告时间: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date reportDateTime;
    // 检验报告部门
    private String performDept;
    // 检验执行状态: 已执行，未执行，作废
    private String status;

    public LabTestResult(){
        this.itemCategory = "";
        this.itemName = "";
        this.itemCode = new Code();
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.requestDateTime = simpleDateFormat.parse("0000-00-00 00:00:00");
            this.requestDept = "";
            this.result = "";
            this.unit = "";
            this.referenceValue = "";
            this.reportDateTime = simpleDateFormat.parse("0000-00-00 00:00:00");
            this.performDept = "";
            this.status = "";
        }catch (Exception e){}
    }

}
