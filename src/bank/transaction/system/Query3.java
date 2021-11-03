
package bank.transaction.system;


public class Query3 {
    int EliteAccountNo;
    String EmployeeName;

    public Query3(int EliteAccountNo, String EmployeeName) {
        this.EliteAccountNo = EliteAccountNo;
        this.EmployeeName = EmployeeName;
    }

    public int getEliteAccountNo() {
        return EliteAccountNo;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEliteAccountNo(int EliteAccountNo) {
        this.EliteAccountNo = EliteAccountNo;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

   
}
