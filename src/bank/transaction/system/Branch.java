
package bank.transaction.system;


public class Branch {
    int BranchID;
    String BranchAddress;

    public int getBranchID() {
        return BranchID;
    }

    public void setBranchID(int BranchID) {
        this.BranchID = BranchID;
    }

    public String getBranchAddress() {
        return BranchAddress;
    }

    public void setBranchAddress(String BranchAddress) {
        this.BranchAddress = BranchAddress;
    }

    public Branch(int BranchID, String BranchAddress) {
        this.BranchID = BranchID;
        this.BranchAddress = BranchAddress;
    }
}
