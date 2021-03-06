package tba.jdk.anno.dynamic;

/**
 * Created by zhangdong on 2019/5/27.
 */
/**
 * 季节
 */
public enum Season {

    SPRING("spring", SeasonPattern.BEAR), SUMMER("summer", SeasonPattern.HOT), AUTUMN(
            "autumn", SeasonPattern.WITHERED);

    private final String key;
    // 季节特征
    private final SeasonPattern sp;
    private Season(String key, SeasonPattern sp) {
        this.key = key;
        this.sp = sp;
    }
    public String getKey() {
        return this.key;
    }
    public SeasonPattern getSeasonPattern() {
        return sp;
    }
}