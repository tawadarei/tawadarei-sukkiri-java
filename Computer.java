public class Computer extends TangibleAsset {
    String makerName;
    public Computer 
      (String name, int price, String color, String makerName) {
      super(name, price, color);
      this.makerName = makerName;
      }
    public String getMakerName() {return this.makerName;}
    
}
/*もう一度次の日やった
 * public abstract class TangibleAsset {
 *   String name;
 *   int price;
 *   String color;
 * 
 *   public TangibleAsset
 *       (String name, int price, String color) {
 *     this.name = name;
 *     this.price = price;
 *     this.color = color;
 * 
 *   public String getName() {return this.name;}
 *   public int getPrice() {return this.price;}
 *   public Sting getColor() {return this.color;}
 * }
 * 
 * }
 * 
 * public Book extends TangibleAsset {
 *   String isbn;
 *   public TangibleAsset
 *     (String name, int price, String color, String isbn){
 *     super(name, price, color);
 *     this.isbn = isbn;
 * 
 *   public String getIsbn() {return this.isbn;}
 *   }
 * 
 * }
 */