import java util.ArrayList;

public class Hero {
  public static void main(String[] args) {

    private String name;
    public Hero(String name) {this.name = name;}
    public String getName() {return this.name;}
    Hero 1 = new Hero("斉藤");
    Hero 2 = new Hero("鈴木");
    List<Hero> hero = new ArrayList<Hero>();  //左辺はArrayListじゃない
      name.add(1);
      name.add(2);
      
      for (Hero e : hero) {
        System.out.println(e.getName());

      }
  }
}