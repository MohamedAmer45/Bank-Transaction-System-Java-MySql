
package bank.transaction.system;


public class Employee {
    int EmployeeID;
    String EmployeeName;
    int BranchID;

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public int getBranchID() {
        return BranchID;
    }

    public void setBranchID(int BranchID) {
        this.BranchID = BranchID;
    }

    public Employee(int EmployeeID, String EmployeeName, int BranchID) {
        this.EmployeeID = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.BranchID = BranchID;
    }
}
