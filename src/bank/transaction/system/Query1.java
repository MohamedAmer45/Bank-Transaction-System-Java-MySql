
package bank.transaction.system;


public class Query1 {
    int AccountNo;
    String Name;
    Float Balance;

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int AccountNo) {
        this.AccountNo = AccountNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Float getBalance() {
        return Balance;
    }

    public void setBalance(Float Balance) {
        this.Balance = Balance;
    }

    public Query1(int AccountNo, String Name, Float Balance) {
        this.AccountNo = AccountNo;
        this.Name = Name;
        this.Balance = Balance;
    }
}
