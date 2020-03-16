package cdss.kb.core.patient;

import cdss.kb.core.Core;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Diagnosis extends Core {
    // 诊断名称
    private String itemName;
    // 诊断编号
    private String itemCode;
    // 诊断类型: 门诊诊断，主要诊断，入院初诊，其它诊断
    private String type;
    // 诊断时间 yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date datetime;
    // 诊断分类 新冠肺炎患者分型  疑似/确诊/轻型/普通型/重型/危重性/恢复期
    private String category;
    public Diagnosis(){
        this.itemName = "";
        this.itemCode = "";
        this.type = "";
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.datetime = simpleDateFormat.parse("0000-00-00 00:00:00");
        }catch (Exception e){}
        this.category = "";
    }

}
