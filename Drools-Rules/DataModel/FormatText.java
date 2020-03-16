package cdss.kb.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.IOUtils;

import java.lang.reflect.Type;

public class FormatText  extends Core{

    // 文本值
    private String value;
    // 0-普通文本;1-超链接;2-表单图表展示;3-体征数据;4-低于低危急值;5-低于正常值;6-正常值;7-高于正常值;8-高于高危急值
    private int type;
    // 对映不同的扩展信息：0-空;1-打开dialog的数据 linkData;2- 直接显示的LinkData;3-Signs 体征数据
    private Object extension;


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getExtension() {
        return extension;
    }

    public void setExtension(Object extension) {
        this.extension = extension;
    }



//    public  <T> T getExtension(Type type){
//        if(null == extension){
//            return null;
//        }
//        return JSON.parseObject(extension.toString(), type);
//    }
}
