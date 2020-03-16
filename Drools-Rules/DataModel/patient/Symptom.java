package cdss.kb.core.patient;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Symptom {
    private String text;
    // 时间: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date reportDateTime;

    public Symptom(){
        this.text = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            this.reportDateTime = simpleDateFormat.parse("0000-00-00 00:00:00");
        }catch (Exception e){}
    }
}
