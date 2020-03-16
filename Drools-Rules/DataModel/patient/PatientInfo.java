package cdss.kb.core.patient;

import cdss.kb.core.Core;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
@Data
public class PatientInfo extends Core {
    // 病人ID
    private String patientId;
    // 姓名
    private String name;
    // 性别: 男，女
    private String sex;
    // 出生日期: yyyy-MM-dd
    @JSONField(format = "yyyy-MM-dd")
    private Date dateOfBirth;
    // 血型: [0]-RH血型：阴性，阳性，未知; [1]-ABO血型：A，B，AB，O，未知, 例如['阴性','A']"
    private ArrayList<String> bloodType;
    // 电话
    private String phone;
    // 地址
    private String address;
    // 婚姻状态: 已婚，未婚，离婚
    private String maritalStatus;
    // 职业
    private String occupation;

    public PatientInfo(){
        bloodType = new ArrayList<>();
    }

}
