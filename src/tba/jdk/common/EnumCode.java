package tba.jdk.common;

import java.util.Enumeration;

/**
 * Created by zhangdong on 4/21/18.
 */
public enum EnumCode {
//    MONDAY,TUESDAY;
    SUCCESS(0, "成功"),
    FAILED(-1, "失败"){
        public void get(){

        }
    };

    private int code;
    private String desc;
    EnumCode(int code, String desc) {
        this.code=code;
        this.desc=desc;
    }

    public static EnumCode getEnum(int code){
        if (code<0){

        }
        for (EnumCode enumCode : EnumCode.values()) {
            if (enumCode.getCode()==code){
                return enumCode;
            }
        }
        return null;
    }

    public int getCode(){
        return code;
    }
}
class MyEnumeration implements Enumeration {
    @Override
    public boolean hasMoreElements() {
        return false;
    }

    @Override
    public Object nextElement() {
        return null;
    }
}

