package leetcode;

/**
 * Created by zhangdong on 2017/9/29.
 */
public class Leet196_ {
    public String deleteDuplicateEmails(){
        String s1="DELETE p1 FROM Person p1 INNER JOIN Person p2\n" +
                "WHERE p1.Email = p2.Email AND p1.Id > p2.Id;";
        String s2="DELETE FROM p1 USING Person p1 INNER JOIN Person p2\n" +
                "WHERE p1.Email = p2.Email AND p1.Id > p2.Id;";
        String s3="DELETE FROM Person WHERE ID NOT IN \n" +
                "(SELECT * FROM (SELECT MIN(Id) FROM Person p GROUP BY Email) t);";
        return s3;
    }
}
