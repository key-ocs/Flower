package flowers;

/**
 * ひまわりの花を表すクラス
 * ひまわりの色、開花時期、香り、花弁の数など、ひまわりに特有の詳細情報を示す
 */
public class Sunflower extends Flower {

    private static final int SUNFLOWER_PETAL_COUNT = 20;

    /**
     * 指定された色で花を作成
     * 
     * @param color 花の色
     */
    public Sunflower(String color) {
        super(color,"ひまわり");
    }

    /**
     * 開花時期を返す
     * 
     * @return 開花時期
     */
    public String bloomSeason() {
        return "夏から初秋";
    }

    /**
     * 香りの説明を返す
     * 
     * @return 香りの説明
     */
    public String fragrance() {
        return "ナッツのような自然な香り";
    }

    /**
     * 花弁の数を返す
     * 
     * @return 花弁の数
     */
    public int getPetalCount() {
        return SUNFLOWER_PETAL_COUNT;
    }
}

