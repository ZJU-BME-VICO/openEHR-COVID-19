package cdss.kb.core.extension;

import cdss.kb.core.Core;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Sign extends Core {
    // 体征项名称 例如T P
    private String name;
    // 体征项值 例如37
    private TdItems value;
    // 体征项单位 例如T P
    private String unit;

    public Sign(String name, TdItems value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }
}
