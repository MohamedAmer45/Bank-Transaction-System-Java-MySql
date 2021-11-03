
package bank.transaction.system;


public class AccountUsesATM {
    int ATMID;
    int AccountNo;

    public int getATMID() {
        return ATMID;
    }

    public void setATMID(int ATMID) {
        this.ATMID = ATMID;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int AccountNo) {
        this.AccountNo = AccountNo;
    }

    public AccountUsesATM(int ATMID, int AccountNo) {
        this.ATMID = ATMID;
        this.AccountNo = AccountNo;
    }
}
