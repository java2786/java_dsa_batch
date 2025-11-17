interface Player{
    void hit();
    void getDamage();
    // void fly();
    // void eatPower();
    // void run();
}
class WhitePlayer implements Player{
    public void hit(){
        System.out.println("White player is hitting");
    }
    public void getDamage(){
        System.out.println("White player is getting hit");
    }
}
class BlackPlayer implements Player{
    public void kick(){}
    public void throwBomb(){}

    public void hit(){
        System.out.println("White player is hitting");
    }
    public void getDamage(){
        System.out.println("White player is getting hit");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Player wp = new WhitePlayer();
        BlackPlayer bp = new BlackPlayer();
        wp.hit();

        bp.kick();
    }
}
