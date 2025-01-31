package kadai_26;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

    // 自分の手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);

        // 自分のじゃんけんの手を入力させる
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        
        String userInput = scanner.nextLine().trim();  // 入力を取得し、前後の空白を削除

        // 入力が正しいかどうか確認
        while (!userInput.equals("r") && !userInput.equals("s") && !userInput.equals("p")) {
            System.out.println("エラーです。r,s,pのいずれかを入力してください");
            userInput = scanner.nextLine().trim();  // 再入力を受け付け
        }

        return userInput;
    }

    // 対戦相手の手をランダムに選ぶメソッド
    public String getRandom() {
        // Math.random() で0以上3未満の数を取得し、0, 1, 2を選ぶ
        int randomIndex = (int) Math.floor(Math.random() * 3);  // 0, 1, 2のいずれかを選ぶ
        String[] choices = {"r", "s", "p"};  // 0=r, 1=s, 2=p
        return choices[randomIndex];
    }

    // じゃんけんを行うメソッド
    public void playGame(String myChoice, String opponentChoice) {
        // じゃんけんの手をHashMapに登録
        HashMap<String, String> hands = new HashMap<>();
        hands.put("r", "グー");
        hands.put("s", "チョキ");
        hands.put("p", "パー");

        // 自分と相手の手を表示
        System.out.println("自分の手は" + hands.get(myChoice) + "," + "対戦相手の手は" + hands.get(opponentChoice));
      

        // 勝敗を判定
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
