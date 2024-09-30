import java.util.*;


public class Hero2 {
  private String name;
  public Hero2(String name) {this.name = name;}
  public String getName() {return this.name;}

  public static void main(String []args) {
    Hero2 h1 = new Hero2("斉藤");
    
    Hero2 h2 = new Hero2("鈴木");
    Map<Hero2, Integer> win = new HashMap<Hero2, Integer>();
    win.put(h1, 3);
    win.put(h2, 7);
    for (Hero2 key : win.keySet()) {
        Integer value = win.get(key);  //解答が　int value = ...ですが、
                                       //intだとエラーになってしまいます..
                                       
        System.out.println(key.getName() + "が倒した敵＝" + value);
    }

  }    
}
