
package bank.transaction.system;


public class EliteAccount {
    int EliteAccountNo;
    int SeniorBankerEmployeeNo;

    public int getEliteAccountNo() {
        return EliteAccountNo;
    }

    public void setEliteAccountNo(int EliteAccountNo) {
        this.EliteAccountNo = EliteAccountNo;
    }

    public int getSeniorBankerEmployeeNo() {
        return SeniorBankerEmployeeNo;
    }

    public void setSeniorBankerEmployeeNo(int SeniorBankerEmployeeNo) {
        this.SeniorBankerEmployeeNo = SeniorBankerEmployeeNo;
    }

    public EliteAccount(int EliteAccountNo, int SeniorBankerEmployeeNo) {
        this.EliteAccountNo = EliteAccountNo;
        this.SeniorBankerEmployeeNo = SeniorBankerEmployeeNo;
    }
}
