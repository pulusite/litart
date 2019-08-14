package tba.jdk.yichang;

/**
 * Created by zhangdong on 2018/4/8.
 */
public class MyException extends RuntimeException{
    private int code ;  //异常对应的返回码
    private String msg;  //异常对应的描述信息

    public MyException() {
        super();
    }

    public MyException(String message, String msg) {
        super(message);
        this.msg = msg;
    }

    public MyException(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
