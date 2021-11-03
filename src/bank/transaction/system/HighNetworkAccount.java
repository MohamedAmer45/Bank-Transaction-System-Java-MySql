
package bank.transaction.system;


public class HighNetworkAccount {
    int HighNetworkAccountNo;
    int BranchManagerEmployeeID;

    public int getHighNetworkAccountNo() {
        return HighNetworkAccountNo;
    }

    public void setHighNetworkAccountNo(int HighNetworkAccountNo) {
        this.HighNetworkAccountNo = HighNetworkAccountNo;
    }

    public int getBranchManagerEmployeeID() {
        return BranchManagerEmployeeID;
    }

    public void setBranchManagerEmployeeID(int BranchManagerEmployeeID) {
        this.BranchManagerEmployeeID = BranchManagerEmployeeID;
    }

    public HighNetworkAccount(int HighNetworkAccountNo, int BranchManagerEmployeeID) {
        this.HighNetworkAccountNo = HighNetworkAccountNo;
        this.BranchManagerEmployeeID = BranchManagerEmployeeID;
    }
}
