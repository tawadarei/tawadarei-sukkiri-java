/*
public class Wizard {
   private int hp;
   private int mp;
   private String name;
   private Wand wand;
  public void heal(Hero h) {
    int basePoint = 10;
    int recovPoint = 
       (int)(basePoint() * this.wand.power);
    h.setHp(h.getHp() + recovPoint);
    System.out.println
      (h.getName() + "のHPを" + recovPoint + "回復した！");
  } 
}
*練習13-2
*powerはWandで、privateアクセスされます　　//wizardクラスで　が抜けてる
*原因：Wandクラスでpowerフィールドはprivateなので、
*     Wizardクラスから直接powerを取得できない
*
* 
*/
