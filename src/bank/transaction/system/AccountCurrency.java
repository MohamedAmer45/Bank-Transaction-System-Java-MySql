
package bank.transaction.system;


public class AccountCurrency {
    String Currency;

    public String getCurrency() {
        return Currency;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public void setAccountNo(int AccountNo) {
        this.AccountNo = AccountNo;
    }

    public AccountCurrency(String Currency, int AccountNo) {
        this.Currency = Currency;
        this.AccountNo = AccountNo;
    }
    int AccountNo;
}
