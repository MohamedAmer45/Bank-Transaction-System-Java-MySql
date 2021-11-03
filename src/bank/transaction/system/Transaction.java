
package bank.transaction.system;

import java.sql.Date;


public class Transaction {
    int TransactionID;
    String TransactionType;
    Float TransactionAmount;
    Float TransactionTime;
    Date TransactionDate;
    int ATMID;

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(String TransactionType) {
        this.TransactionType = TransactionType;
    }

    public Float getTransactionAmount() {
        return TransactionAmount;
    }

    public void setTransactionAmount(Float TransactionAmount) {
        this.TransactionAmount = TransactionAmount;
    }

    public Float getTransactionTime() {
        return TransactionTime;
    }

    public void setTransactionTime(Float TransactionTime) {
        this.TransactionTime = TransactionTime;
    }

    public Date getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(Date TransactionDate) {
        this.TransactionDate = TransactionDate;
    }

    public int getATMID() {
        return ATMID;
    }

    public void setATMID(int ATMID) {
        this.ATMID = ATMID;
    }

    public Transaction(int TransactionID, String TransactionType, Float TransactionAmount, Float TransactionTime, Date TransactionDate, int ATMID) {
        this.TransactionID = TransactionID;
        this.TransactionType = TransactionType;
        this.TransactionAmount = TransactionAmount;
        this.TransactionTime = TransactionTime;
        this.TransactionDate = TransactionDate;
        this.ATMID = ATMID;
    }
}
