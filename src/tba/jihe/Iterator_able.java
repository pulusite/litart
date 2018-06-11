package tba.jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhangdong on 2018/6/11.
 *
 *   在ArrayList类创建迭代器之后，除非通过迭代器自身remove或add对列表结构进行修改，否则在其他
 *   线程中以任何形式对列表进行修改，迭代器马上会抛出异常，快速失败。
 */
public class Iterator_able {
    public static void main(String[] args) {
        List list=new ArrayList();
        Iterator it=list.iterator();

        Iterable iterable=null;
//        Collection<E> extends Iterable<E>

    }
}
