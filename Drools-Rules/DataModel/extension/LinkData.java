package cdss.kb.core.extension;

import cdss.kb.core.Core;

public class LinkData extends Core {
    // 链接数据业务类型  例如ChartData TableData
    private String businessDataType;
    // 链接数据所在的FormatText的index  例如:1
    private int linkDataIndex;

    public LinkData(String businessDataType, int linkDataIndex) {
        this.businessDataType = businessDataType;
        this.linkDataIndex = linkDataIndex;
    }

    public String getBusinessDataType() {
        return businessDataType;
    }

    public void setBusinessDataType(String businessDataType) {
        this.businessDataType = businessDataType;
    }

    public int getLinkDataIndex() {
        return linkDataIndex;
    }

    public void setLinkDataIndex(int linkDataIndex) {
        this.linkDataIndex = linkDataIndex;
    }
}
