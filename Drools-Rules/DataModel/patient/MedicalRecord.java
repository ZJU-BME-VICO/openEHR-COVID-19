package cdss.kb.core.patient;

import cdss.kb.core.Core;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class MedicalRecord extends Core {
    // 病历类型
    private String type;
    // 记录内容
    private String text;
    // 日期: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dateTime;



    public MedicalRecord(){
        this.type = "";
        this.text = "";
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.dateTime = simpleDateFormat.parse("0000-00-00 00:00:00");
        }catch (Exception e){}
    }
}
