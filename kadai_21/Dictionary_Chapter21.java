package kadai_21;
import java.util.HashMap;


public class Dictionary_Chapter21 {
	
	 public Dictionary_Chapter21() {}
	 
	 public void mapCheck(String[] datas) {
		HashMap<String,String> dictionary = new HashMap<String,String>();
		
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
     
		 for (String data : datas) {
			
			 
		 if(dictionary.containsKey(data)) {
			 System.out.println(data + "の意味は" + dictionary.get(data));
		 } else {
			 System.out.println(data + "は辞書に存在しません");
		   }	 
		 }
		
	 }
	 
}
