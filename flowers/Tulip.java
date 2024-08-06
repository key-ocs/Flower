package flowers;

/**
 * チューリップの花を表すクラス
 * チューリップの色、開花時期、香り、花弁の数など、チューリップに特有の詳細情報を示す
 */
public class Tulip extends Flower {

    private static final int TULIP_PETAL_COUNT = 6;

    /**
     * 指定された色で花を作成
     * 
     * @param color 花の色
     */
    public Tulip(String color) {
        super(color,"チューリップ");
    }

    /**
     * 開花時期を返す
     * 
     * @return 開花時期
     */
    public String bloomSeason() {
        return "春";
    }

    /**
     * 香りの説明を返す
     * 
     * @return 香りの説明
     */
    public String fragrance() {
        return "ジューシーで甘い香り";
    }

    /**
     * 花弁の数を返す
     * 
     * @return 花弁の数
     */
    public int getPetalCount() {
        return TULIP_PETAL_COUNT;
    }
}
