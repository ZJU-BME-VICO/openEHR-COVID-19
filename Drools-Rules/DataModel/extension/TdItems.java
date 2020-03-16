package cdss.kb.core.extension;

import java.util.ArrayList;

public class TdItems {
    ArrayList<TdItem> tdItems = new ArrayList<TdItem>();
    public ArrayList<TdItem> getTdItems(){
        return this.tdItems;
    }
    public void setTdItems(ArrayList<TdItem> tdItems){
        this.tdItems = tdItems;
    }
    public void addTdItem(TdItem tdItem){
        this.tdItems.add(tdItem);
    }
    public void addTdItem(String itemText,Remark remark){
        TdItem tdItem = new TdItem(itemText, remark);
        this.tdItems.add(tdItem);
    }
}
