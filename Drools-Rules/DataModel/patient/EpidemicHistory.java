package cdss.kb.core.patient;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Data
public class EpidemicHistory {
    //流行病学史


    private ArrayList<String> hisList;
    // 时间: yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date reportDateTime;
    public EpidemicHistory(){
        this.hisList = new ArrayList<>();
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.reportDateTime = simpleDateFormat.parse("0000-00-00 00:00:00");
        }catch (Exception e){}

    }
}
