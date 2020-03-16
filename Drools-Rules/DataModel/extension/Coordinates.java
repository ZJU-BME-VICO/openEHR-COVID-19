package cdss.kb.core.extension;

import cdss.kb.core.Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Coordinates extends Core {
    // x轴
    private String xAxis;
    // y轴组合
    private ArrayList<String> yAxis;

    public String getxAxis() {
        return xAxis;
    }

    public void setxAxis(String xAxis) {
        this.xAxis = xAxis;
    }

    public ArrayList<String> getyAxis() {
        return yAxis;
    }

    public void setyAxis(ArrayList<String> yAxis) {
        this.yAxis = yAxis;
    }
    public void addyAxis(String... yAxis) {
        this.yAxis = (ArrayList<String>) Arrays.stream(yAxis).collect(Collectors.toList());
    }
}
