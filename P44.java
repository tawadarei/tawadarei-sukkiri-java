package sukkiri;

public class P44 {

	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("一桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();		
          for (int quiz :numbers) {
        	 if (quiz == input) {
        	  System.out.println("アタリ！");
        	 }
        	  
          }
	}

}
