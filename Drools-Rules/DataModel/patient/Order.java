package cdss.kb.core.patient;

import cdss.kb.core.Core;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Order extends Core {
    // 医嘱类型: 护理，检验，治疗，西药，膳食，检查，膳食
    private String type;
    // 医嘱内容
    private String Text;
    // 医嘱编码
    private Code code;
    // 医嘱剂量
    private String Dosage;
    // 计量单位
    private String unit;
    // 执行频率
    private String Frequency;
    // 医嘱起始时间  yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startDateTime;
    // 医嘱终止时间 yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date stopDateTime;
    // 医嘱输入时间 yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date enterDateTime;
    // 医嘱执行时间 yyyy-MM-dd HH:mm:ss
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date executeDateTime;
    // 责任医生
    private Provider staff;
    // 医嘱执行状态: 已执行，未执行，作废
    private String status;
    // 医嘱执行结果
    private String PerformResult;
    // 重复标记
    private boolean repeated;

    public Order(){
        this.type = "";
        this.Text = "";
        this.code = new Code();
        this.Dosage = "";
        this.unit = "";
        this.Frequency = "";
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.startDateTime = simpleDateFormat.parse("0000-00-00 00:00:00");
            this.stopDateTime  = simpleDateFormat.parse("0000-00-00 00:00:00");
            this.enterDateTime  = simpleDateFormat.parse("0000-00-00 00:00:00");
            this.executeDateTime  = simpleDateFormat.parse("0000-00-00 00:00:00");
        }catch (Exception e){}
        this.staff = new Provider();
        this.status = "";
        this.PerformResult = "";
        this.repeated = false;
    }

}
