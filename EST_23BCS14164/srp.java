class Account {
    int acc_no;
    int balance;
    String name;

    void print() {
        System.out.print(acc_no + name + balance);
    }
}

class Deposit {
    private Account acc;

    void depositt(int amount) {
        if (acc.balance > amount) {
            acc.balance += amount;
            System.out.println("deposit succesfull");
        } else {
            System.out.println("insufficient funds");
        }
    }
}

class withdraw {
    private Account acc;

    void withdraww(int amount) {
        acc.balance -= amount;
        System.out.println("withdraw succesfull");
    }

}

public class main {
    public static void main(String[] args) {
        Account a = new Account();
        a.acc_no = 1;
        a.balance = 1000;
        a.name = "preet";
        a.print();
        Deposit d = new Deposit();
        d.depositt(0);
        withdraw w = new withdraw();
        w.withdraww(10);
    }
}
