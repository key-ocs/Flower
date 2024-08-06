package flowers;

/**
 * 花を表す抽象クラス
 * このクラスは、すべての花に共通するプロパティとメソッドを含む
 */
public abstract class Flower {
    protected String color;
    protected int petalCount;
    protected final String name; // 花の名前を保持する定数

    /**
     * 指定された色で花を構築する
     * 花弁の数は {@code getPetalCount()} メソッドの実装によって設定される
     * 
     * @param color 花の色
     * @param name  花の名前
     */
    public Flower(String color, String name) {
        this.color = color;
        this.name = name;
        this.petalCount = getPetalCount();
    }

    /**
     * 花の情報を表示する
     * 情報には花の種類、色、花弁の数、開花時期、香りが含まれる
     */
    public void displayInfo() {
        System.out.println("これは " + name + " です。");
        System.out.println("色: " + color);
        System.out.println("花弁の数: " + petalCount);
        System.out.println("開花時期: " + bloomSeason());
        System.out.println("香り: " + fragrance());
    }

    /**
     * 花の開花時期を返す
     * 
     * @return 開花時期
     */
    public abstract String bloomSeason();

    /**
     * 花の香りの説明を返す
     * 
     * @return 香りの説明
     */
    public abstract String fragrance();

    /**
     * 花の花弁の数を返す
     * 
     * @return 花弁の数
     */
    public abstract int getPetalCount();
}
