package cdss.kb.core.extension;

import cdss.kb.core.Core;

import java.util.ArrayList;

public class ChartsDatas extends Core {
    // 趋势图所有指标数据
    private ArrayList<ChartsData> chartsDatas = new ArrayList<>();

    public ArrayList<cdss.kb.core.extension.ChartsData> getChartsData() {
        return chartsDatas;
    }

    public void setChartsData(ArrayList<cdss.kb.core.extension.ChartsData> chartsData) {
        this.chartsDatas = chartsData;
    }

    public void add(String x,double y,String unit){
        ChartsData chartsData = new ChartsData(x,y,unit);
        this.chartsDatas.add(chartsData);
    }
}
