public class Sample {
	public static void main(String[] args) {
		System.out.println(test("A"));
	}
	public static String test(Object obj) {
		String s = "";
		if (!(obj instanceof String str)) {
			s = obj.toString();
		} else { 
			s = str.toLowerCase(); 
		}
		return s;
		// 黒本の解説では「コンパイルエラー」が表示されると記載されているが、実際にコードを実行すると
		// elseブロック内の str.toLowerCase()が実行され、小文字の「a」が表示される。
	}
}	