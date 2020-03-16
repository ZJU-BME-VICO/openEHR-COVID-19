package cdss.kb.core.patient;

import cdss.kb.core.Core;
import cdss.kb.core.Process;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Data
public class PhysicalSign extends Core {
    // 体征名称
    private String itemName;
    // 体征编码
    private String itemCode;
    // 体征值
    private String value;
    // 单位
    private String unit;
    // 测量时间: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date measureDateTime;

    public PhysicalSign(){
        this.itemName = "";
        this.itemCode = "";
        this.value = "";
        this.unit = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            this.measureDateTime = simpleDateFormat.parse("0000-00-00 00:00:00");
        }catch (Exception e){}
    }



}
