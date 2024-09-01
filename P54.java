package sukkiri5;

public class P54 {
    public static double calcTraiangleArea(double bottom, double height) {
      double tArea = (bottom * height) / 2;
      return tArea;
    }
    
    public static double calcCircleArea(double radius) {
      double cArea = radius * radius * 3.14;
      return cArea;
    }
	public static void main(String[] args) {
      double triangleArea = calcTraiangleArea(10.0, 5.0);
      System.out.println("三角形の面積は" + triangleArea + "平方㎝");
      
      double circleArea = calcCircleArea(5.0);
      System.out.println("円の面積は" + circleArea + "平方㎝");

	}

}
