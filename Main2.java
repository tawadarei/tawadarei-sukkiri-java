public class Main2 {
    public static void main(String[] args) {
    try{
        int i =Integer.parseInt("三");
    } catch (NumberFormatException e) {
        System.out.println("NumberFormatException例外をcatchしました");
    }
    }
}

/*Integerで、そのページのparseIntは調べられて、
 * Integer.parseInt("三");が書けなくて
 * try{の位置で迷ってしまう
 */