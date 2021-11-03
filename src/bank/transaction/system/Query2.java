
package bank.transaction.system;

import java.sql.Date;


public class Query2 {
   int TransactionID;
   Float TransactionAmount;
   Date TransactionDate;
   int ATMID;

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }

    public Float getTransactionAmount() {
        return TransactionAmount;
    }

    public void setTransactionAmount(Float TransactionAmount) {
        this.TransactionAmount = TransactionAmount;
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

    public Query2(int TransactionID, Float TransactionAmount, Date TransactionDate, int ATMID) {
        this.TransactionID = TransactionID;
        this.TransactionAmount = TransactionAmount;
        this.TransactionDate = TransactionDate;
        this.ATMID = ATMID;
    }

   
}
