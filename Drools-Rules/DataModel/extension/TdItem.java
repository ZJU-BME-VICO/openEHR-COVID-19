package cdss.kb.core.extension;

import cdss.kb.core.Core;
import lombok.Data;

@Data
public class TdItem extends Core {
    // 具体Text
    private String itemText;
    // 数据标识
    private Remark remark;

    public TdItem(String itemText,Remark remark){
        this.itemText = itemText;
        this.remark = remark;
    }
}
