public class Bank {

    int account;
    int balance;

    Bank(){
        balance = 0;
    }

    void printBalance(){
        System.out.println("当前账户的余额是：" + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.printBalance();
    }
}
