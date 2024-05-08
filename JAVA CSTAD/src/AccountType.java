import java.util.UUID;

class Account{
    public final String uuid = UUID.randomUUID().toString();

    public String AccoutType;
    public Double AmountOfCash=0.0;
    public Account(String AcountType ){
        this.AccoutType=AcountType;
    }
    public void deposit(Double AmountOfCashToDeposit){
        this.AmountOfCash+=AmountOfCashToDeposit;
    }
    public void Wildraw(Double AmountOfCashToWildraw){
        if(AmountOfCash<AmountOfCashToWildraw){
            System.out.println("Yuor Balance is lower than amount your wildraw ! ");
        }
        else{
            AmountOfCash-=AmountOfCashToWildraw;
        }
    }
    public void showBalance(){
        System.out.println("Your "+this.AccoutType + "Acount is  "+AmountOfCash);
    }

}
public class AccountType {
    public static void main(String[] args) {
        Account saving = new Account("Saving");
        saving.deposit(5d);
        saving.Wildraw(2d);
        saving.showBalance();
    }
}
