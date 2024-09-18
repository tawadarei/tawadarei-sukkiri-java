public class PoisonMatango extends Matango {
    int count = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }
    public void attack(Hero h) {
        super.attack(h);
        if(this.count > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            System.out.println(h.hp - (h.hp / 5) + "ポイントのダメージ！");
            this.count -= 1;
        }
    }
}