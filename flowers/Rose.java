package flowers;

/**
 * バラの花を表すクラス
 * バラの色、開花時期、香り、花弁の数など、バラに特有の詳細情報を示す
 */
public class Rose extends Flower {

    private static final int ROSE_PETAL_COUNT = 32;

    /**
     * 指定された色で花を作成
     * 
     * @param color 花の色
     */
    public Rose(String color) {
        super(color,"バラ");
    }

    /**
     * 開花時期を返す
     * 
     * @return 開花時期
     */
    public String bloomSeason() {
        return "春から秋";
    }

    /**
     * 香りの説明を返す
     * 
     * @return 香りの説明
     */
    public String fragrance() {
        return "甘く優雅で女性らしさを感じる香り";
    }

    /**
     * 花弁の数を返す
     * 
     * @return 花弁の数
     */
    public int getPetalCount() {
        return ROSE_PETAL_COUNT;
    }
}
