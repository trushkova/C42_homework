package homeWork6;

public class CreditCard {
    public static void main(String[] args) {
        Card card1 = new Card("111", 5500.50);
        Card card2 = new Card("222", 10.00);
        Card card3 = new Card("333", 10000.00);

        System.out.println("НАЧАЛЬНОЕ СОСТОЯНИЕ");
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
        System.out.println();

        System.out.println("СНЯТИЕ/ПОПОЛНЕНИЕ");
        card1.deposit(250.00);
        card2.deposit(500.00);
        card3.withdraw(1200.50);
        System.out.println();

        System.out.println("ОБНОВЛЕННОЕ СОСТОЯНИЕ");
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
class Card {
    private String accountNumber;
    private double balance;
    public Card(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("На счет " + accountNumber + " зачислено: " + amount);
        } else {
            System.out.println("Сумма для зачисления должна быть больше нуля.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Со счета " + accountNumber + " снято: " + amount);
            } else {
                System.out.println("Недостаточно средств на счете " + accountNumber);
            }
        } else {
            System.out.println("Сумма для снятия должна быть больше нуля.");
        }
    }
    public void printInfo() {
        System.out.printf("Номер счета: " + accountNumber + ", Текущий баланс: " + balance + " руб.\n");
    }
}