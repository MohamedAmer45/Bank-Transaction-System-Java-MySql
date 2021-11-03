
package bank.transaction.system;


public class BranchManager {
    
    int BranchManagerID;

    public BranchManager(int BranchManagerID) {
        this.BranchManagerID = BranchManagerID;
    }

    public int getBranchManagerID() {
        return BranchManagerID;
    }

    public void setBranchManagerID(int BranchManagerID) {
        this.BranchManagerID = BranchManagerID;
    }
}
