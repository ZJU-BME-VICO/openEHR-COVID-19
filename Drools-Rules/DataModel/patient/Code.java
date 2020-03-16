package cdss.kb.core.patient;

import cdss.kb.core.Core;
import lombok.Data;

@Data
public class Code extends Core {
    private String id; // 项目编号
    private String name; // 项目名称
    private String systemType; // 编码类型: ICD，医院编码等

    public Code() {
        this.id = "";
        this.name = "";
        this.systemType = "";
    }
}
