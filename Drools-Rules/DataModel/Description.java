package cdss.kb.core;

import java.util.ArrayList;

public class Description extends Core {

    // 描述格式化文本
    private ArrayList<FormatText> formatTexts;

    public Description() {
        formatTexts = new ArrayList<FormatText>();
    }


    public ArrayList<FormatText> getFormatTexts() {
        return formatTexts;
    }

    public void setFormatTexts(ArrayList<FormatText> formatTexts) {
        this.formatTexts = formatTexts;
    }

    public void addFormatText(FormatText formatText){
        this.formatTexts.add(formatText);
    }
}
