package leetcode;

/**
 * Created by zhangdong on 2017/9/28.
 */
public class Leet175 {
    public String CombineTwoTables(){
        return "select p.FirstName,p.LastName,a.City,a.State\n" +
                "from Person p\n" +
                "left join Address a on p.PersonId=a.PersonId";
    }
}
