package kadai_018;

public class KatoExec_Chapter18 {
	
	
	public static void main(String[] args) {
		
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18("加藤", "東京都中野区〇×");
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18("加藤", "東京都中野区〇×");
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18("加藤", "東京都中野区〇×");
		
		
        taro.execIntroduce();
        System.out.println();
        ichiro.execIntroduce();
        System.out.println();
        hanako.execIntroduce();
	}

}
