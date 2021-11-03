
package bank.transaction.system;


public class AccountMakesTransaction {
    int AccountNo;
    int TransactionID;

    public AccountMakesTransaction(int AccountNo, int TransactionID) {
        this.AccountNo = AccountNo;
        this.TransactionID = TransactionID;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public void setAccountNo(int AccountNo) {
        this.AccountNo = AccountNo;
    }

    public void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }
    
}
