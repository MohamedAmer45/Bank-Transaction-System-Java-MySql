
package bank.transaction.system;

import java.sql.Date;


public class Account {
    int AccountNo;
    Date AccountDate;
    String AccountName;
    Float Balance;
    int BranchID;

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int AccountNo) {
        this.AccountNo = AccountNo;
    }

    public Date getAccountDate() {
        return AccountDate;
    }

    public void setAccountDate(Date AccountDate) {
        this.AccountDate = AccountDate;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public Float getBalance() {
        return Balance;
    }

    public void setBalance(Float Balance) {
        this.Balance = Balance;
    }

    public int getBranchID() {
        return BranchID;
    }

    public void setBranchID(int BranchID) {
        this.BranchID = BranchID;
    }

    public Account(int AccountNo, Date AccountDate, String AccountName, Float Balance, int BranchID) {
        this.AccountNo = AccountNo;
        this.AccountDate = AccountDate;
        this.AccountName = AccountName;
        this.Balance = Balance;
        this.BranchID = BranchID;
    }

    
}
