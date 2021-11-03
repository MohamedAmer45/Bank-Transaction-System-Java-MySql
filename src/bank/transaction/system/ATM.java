
package bank.transaction.system;

public class ATM {
    int ATMID;
    String ATMLocation;
    int BranchID;

    public int getATMID() {
        return ATMID;
    }

    public void setATMID(int ATMID) {
        this.ATMID = ATMID;
    }

    public String getATMLocation() {
        return ATMLocation;
    }

    public void setATMLocation(String ATMLocation) {
        this.ATMLocation = ATMLocation;
    }

    public int getBranchID() {
        return BranchID;
    }

    public void setBranchID(int BranchID) {
        this.BranchID = BranchID;
    }

    public ATM(int ATMID, String ATMLocation, int BranchID) {
        this.ATMID = ATMID;
        this.ATMLocation = ATMLocation;
        this.BranchID = BranchID;
    }

   
}
