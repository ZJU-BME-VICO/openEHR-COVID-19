package cdss.kb.core.extension;

import cdss.kb.core.Core;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
@Data
public class Tr extends Core {
    // 表头单元格
    private String th;
    // 单元格标签
    private ArrayList<TdItems> td;

    public void addTd(TdItems tdItems){
        this.td.add(tdItems);
    }
    public Tr(){
        this.th = "";
        this.td = new ArrayList<TdItems>();
    }
}
