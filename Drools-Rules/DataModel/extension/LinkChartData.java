package cdss.kb.core.extension;

import cdss.kb.core.Core;

import java.util.ArrayList;

public class LinkChartData  extends Core {
    // 数据类型 及下标特征
    private LinkData linkData;
    // 趋势图title
    private String   title;
    // 是否显示图例
    private Boolean  legendShow;
    // 指标轴
    private Coordinates coordinates;
    // 指标轴对映的数据
    private ArrayList<ChartsDatas> Lines = new ArrayList<>();

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<ChartsDatas> getLines() {
        return Lines;
    }

    public void setLines(ArrayList<ChartsDatas> lines) {
        Lines = lines;
    }

    public LinkData getLinkData() {
        return linkData;
    }

    public void setLinkData(LinkData linkData) {
        this.linkData = linkData;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getLegendShow() {
        return legendShow;
    }

    public void setLegendShow(Boolean legendShow) {
        this.legendShow = legendShow;
    }

    public void addLinkData(String businessDataType,int linkDataIndex){
        LinkData linkData = new LinkData(businessDataType,linkDataIndex);
        this.setLinkData(linkData);
    }
    public void addLine(ChartsDatas chartsDatas){
        this.Lines.add(chartsDatas);
    }
}
