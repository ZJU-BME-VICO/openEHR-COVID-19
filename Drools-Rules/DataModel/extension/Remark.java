package cdss.kb.core.extension;

import lombok.Data;


public enum Remark {
    Spacer("间隔符"),
    ItemName("项目名称"),
    lowerThanCritical("低于低危急值"),
    lowerThanNormal("低于正常值"),
    Normal("正常值"),
    higherThanNormal("高于正常值"),
    higherThanCritical("高于高危急值");
    private String description;
    Remark(String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
