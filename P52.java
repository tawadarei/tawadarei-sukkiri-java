package sukkiri5;

public class P52 {
    public static void email(String address, String title, String text) {
    	System.out.println("件名:" + title);
    	System.out.println(address + "に、以下のメールを送信しました。");
    	System.out.println("本文:" + text);
            
    }
	public static void main(String[] args) {
		String address = "Address";
		String title = "Title";
		String text = "Text";
		email(address, title, text);
		
	}

}
