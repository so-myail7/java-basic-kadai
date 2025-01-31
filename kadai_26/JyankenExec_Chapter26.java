package kadai_26;

public class JyankenExec_Chapter26 {

    public static void main(String[] args) {
        // Jyanken_Chapter26 クラスをインスタンス化
        Jyanken_Chapter26 game = new Jyanken_Chapter26();

        // 自分の手を入力させる
        String myChoice = game.getMyChoice();

        // 対戦相手の手をランダムに選ぶ
        String opponentChoice = game.getRandom();

        // じゃんけんを行う
        game.playGame(myChoice, opponentChoice);
    }
}
