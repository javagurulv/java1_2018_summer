package lesson7;

public class SmartWallet {

    private int balance;
    private String pinCode;

    public SmartWallet(String pinCode) {
        this.pinCode = pinCode;
        this.balance = 0;
    }

    public void addMoney(int money) {
        this.balance += money;
    }

    public void deduct(String pinCode, int money) {
        if (isPinCodeCorrect(pinCode)
                && isBalanceEnough(money)) {
            //this.balance -= money;
            this.balance = this.balance - money;
        }
    }

    private boolean isBalanceEnough(int money) {
        return this.balance >= money;
    }

    private boolean isPinCodeCorrect(String pinCode) {
        return this.pinCode.equals(pinCode);
    }

    public int getBalance(String pinCode) {
        if (isPinCodeCorrect(pinCode)) {
            return this.balance;
        } else {
            return -1;
        }
    }

}
