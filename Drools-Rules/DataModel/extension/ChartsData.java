package cdss.kb.core.extension;

import cdss.kb.core.Core;
import lombok.Data;

@Data
public class ChartsData extends Core {
    // x值 时间
    private String xValue;
    // y值
    private double yValue;
    // 单位
    private String unit;

    public ChartsData(String xValue, double yValue, String unit) {
        this.xValue = xValue;
        this.yValue = yValue;
        this.unit = unit;
    }
}
