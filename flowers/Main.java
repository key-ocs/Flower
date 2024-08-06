package flowers;

/**
 * メインクラスで、さまざまな種類の花を作成し、その情報を表示する
 */
public class Main {
    /**
     * プログラムのエントリーポイント
     * バラ、チューリップ、ユリ、ひまわりのインスタンスを作成し、それぞれの情報を表示する
     */
    public static void main(String[] args) {
        Flower[] flowers = {
            new Rose("赤"),
            new Tulip("黄"),
            new Lily("白"),
            new Sunflower("黄")
        };

        // foreach ループを使用して各花の情報を表示
        for (Flower flower : flowers) {
            flower.displayInfo();
            System.out.println();
        }
    }
}
