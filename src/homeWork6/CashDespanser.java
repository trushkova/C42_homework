package homeWork6;


public class CashDespanser {
    private int count20;
    private int count50;
    private int count100;


    public CashDespanser(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
        System.out.println("Текущий баланс: " + getTotalBalance() + " руб.");
    }
    private int getTotalBalance() {
        return (count20 * 100) + (count50 * 50) + (count100 * 10);
    }
    public void addMoney(int add20, int add50, int add100) {
        this.count20 += add20;
        this.count50 += add50;
        this.count100 += add100;
        System.out.println("Деньги добавлены. Новый баланс: " + getTotalBalance() + " руб.");
    }
    public boolean withdrawMoney(int amount) {
        System.out.println("Запрошена сумма для снятия: " + amount + " руб.");

        if (amount % 20 != 0) {
            System.out.println("Ошибка: сумма должна быть кратна 20 руб.");
            return false;
        }

        int needed100 = amount / 100;
        int take100 = Math.min(needed100, count100);
        amount -= take100 * 100;

        int needed50 = amount / 50;
        int take50 = Math.min(needed50, count50);
        amount -= take50 * 50;

        int needed20 = amount / 20;
        int take20 = Math.min(needed20, count20);
        amount -= take20 * 20;

        if (amount != 0) {
            System.out.println("Операция невозможна: недостаточно купюр нужного номинала.");
            return false;
        }

        this.count100 -= take100;
        this.count50 -= take50;
        this.count20 -= take20;

        System.out.println("Выдача средств успешна:");
        if (take100 > 0) System.out.println("купюр номиналом 100: " + take100 + " шт.");
        if (take50 > 0) System.out.println("купюр номиналом 50: " + take50 + " шт.");
        if (take20 > 0) System.out.println("купюр номиналом 20: " + take20 + " шт.");
        return true;
    }

    public static void main(String[] args) {
        CashDespanser atm = new CashDespanser(10, 10, 10); // Инициализируем банкомат

        atm.addMoney(5, 2, 1); // Пополняем банкомат

        // Проверяем снятие
        boolean isSuccess = atm.withdrawMoney(240);
        System.out.println("Результат операции: " + isSuccess);
    }
}
