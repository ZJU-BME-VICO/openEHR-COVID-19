package cdss.kb.core.patient;

import cdss.kb.core.Core;
import lombok.Data;

@Data
public class Provider extends Core {
    // 编号
    private String id;
    // 姓名
    private String name;
    // 角色：医生，护士
    private String role;

    public Provider(){
        this.id = "";
        this.name = "";
        this.role = "";
    }


}
