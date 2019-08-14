package tba.jdk.anno.dynamic;

/**
 * Created by zhangdong on 2019/5/27.
 */

/**
 * 测试方法
 */
public class Test {

    public static void main(String[] args) {
//        System.out.println("原始数据：");
//        for (Season season : Season.values()) {
//            System.out.println(season);
//        }
//        System.out.println("-----------------------------");
//        DynamicEnumUtils.addEnum(Season.class, "WINTER", new Class[]{
//                java.lang.String.class, SeasonPattern.class}, new Object[]{
//                "winter", SeasonPattern.SNOW});
//        System.out.println("添加后的数据：");
//        for (Season season : Season.values()) {
//            System.out.println(season);
//        }
//        System.out.println("-----------------------------");
//        Season season = Season.valueOf("WINTER");
//        System.out.println("新添加的枚举类型可以正常使用：");
//        System.out.println(season.name());
//        System.out.println(season.getKey());
//        System.out.println(season.getSeasonPattern());


        DynamicEnumUtils.addEnum(MessageCodeEnum.class, "TEMP_CODE", new Class[]{
                java.lang.String.class, java.lang.String.class}, new Object[]{
                "STORE00001", "楼层名称已存在"});
        System.out.println(MessageCodeEnum.valueOf("TEMP_CODE"));
        System.out.println(MessageCodeEnum.valueOf("TEMP_CODE").getCode());
        System.out.println(MessageCodeEnum.valueOf("TEMP_CODE").getMsg());


    }
}