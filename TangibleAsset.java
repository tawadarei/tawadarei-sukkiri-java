public abstract class TangibleAsset {
    String name;
    int price;
    String color;

    public TangibleAsset
       (String name, int price, String color) {
      this.name = name;
      this.price = price;
      this.color = color;
    }
    public String getName() {return this.name;}
    public int getPrice() {return this.price;}
    public String getColor() {return this.color;}   
}
/*練習11−２
 * (ア)
 * Asset
 * (イ)
 * IntangibleAsset
 * (ウ）
 * Patent
 */

 /*練習11−４
  * public class TangibleAsset extends Asset implements Thing {
      String color;
      double weight;
      public TangibleAsset
           (String name, int price, String color, double weight) {
        super(name, price);
        this.color = color;
        this. weight = weight;
      }
      public String getColor() {return this.color;}
      public double getWeight() {return this.weight;}
      public void setWeight(double weight) {this.weight = weight;}←この行は書けなかった。
    }
  */