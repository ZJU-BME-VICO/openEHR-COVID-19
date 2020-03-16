package cdss.kb.core.extension;

import cdss.kb.core.Core;

import java.util.ArrayList;

public class LinkTableData extends Core {
    // 数据类型 及下标特征
    private LinkData linkData;
    // table title
    private String   title;
    // table 数据
    private ArrayList<Tr> table = new ArrayList<>();

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

    public ArrayList<Tr> getTable() {
        return table;
    }

    public void setTable(ArrayList<Tr> table) {
        this.table = table;
    }

    public void addLinkData(String businessDataType,int linkDataIndex){
        LinkData linkData = new LinkData(businessDataType, linkDataIndex);
    }

    public void addTable(Tr tr){
        this.table.add(tr);
    }

}
