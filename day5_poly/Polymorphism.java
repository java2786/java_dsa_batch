import java.util.ArrayList;
import java.util.List;

abstract class Bank{

    abstract void openAccount();
}

class SbiBank extends Bank{
    void offer(){
        System.out.println("2% interest");
    }
    void openAccount(){
        System.out.println("Open sbi account");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        // Bank bank = new Bank();
        SbiBank sbi = new SbiBank();
        sbi.openAccount();
        sbi.offer();
        Bank bank = new SbiBank(); // polymorphism
        bank.openAccount();
        // bank.offer();

        List list = new ArrayList();
    }
}