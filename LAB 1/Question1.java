class Bank {
    double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
        String msg = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(msg);
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }

    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    public void display() {
        System.out.println("Total balance: " + amount);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Bank bank = new Bank(10000);
        bank.withdraw(10000);
        bank.deposit(5000);
        bank.display();
    }

}
