package cdss.kb.core.extension;

import cdss.kb.core.Core;

import java.util.ArrayList;

public class Signs extends Core {
    // 体征数据组合
    private ArrayList<Sign> signs = new ArrayList<>();

    public ArrayList<Sign> getSigns() {
        return signs;
    }

    public void setSigns(ArrayList<Sign> signs) {
        this.signs = signs;
    }

    public  void addSign(String name, TdItems value, String unit){
        Sign sign = new Sign(name, value, unit);
        signs.add(sign);
    }

}
