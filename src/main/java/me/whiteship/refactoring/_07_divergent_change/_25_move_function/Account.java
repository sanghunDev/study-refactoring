package me.whiteship.refactoring._07_divergent_change._25_move_function;

/**
 *  어떤 함수를 볼때 다른 데이터를 참조하는 데이터가 많으면 해당 함수를 그쪽으로 옮겨주면 좋다
 */
public class Account {

    private int daysOverdrawn;

    private AccountType type;

    public Account(int daysOverdrawn, AccountType type) {
        this.daysOverdrawn = daysOverdrawn;
        this.type = type;
    }

    public double getBankCharge() {
        double result = 4.5;
        if (this.daysOverdrawn() > 0) {
            result += this.type.overdraftCharge(this.daysOverdrawn);
        }
        return result;
    }

    private int daysOverdrawn() {
        return this.daysOverdrawn;
    }

}
