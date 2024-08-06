package flowers;

/**
 * ユリの花を表すクラス
 * ユリの色、開花時期、香り、花弁の数など、ユリに特有の詳細情報を示す
 */
public class Lily extends Flower {

    private static final int LILY_PETAL_COUNT = 6;

    /**
     * 指定された色で花を作成
     * 
     * @param color 花の色
     */
    public Lily(String color) {
        super(color,"ユリ");
    }

    /**
     * 開花時期を返す
     * 
     * @return 開花時期
     */
    public String bloomSeason() {
        return "夏";
    }

    /**
     * 香りの説明を返す
     * 
     * @return 香りの説明
     */
    public String fragrance() {
        return "甘くフローラルな香り";
    }

    /**
     * 花弁の数を返す
     * 
     * @return 花弁の数
     */
    public int getPetalCount() {
        return LILY_PETAL_COUNT;
    }
}
