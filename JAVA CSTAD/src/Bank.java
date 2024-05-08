import java.util.UUID;

interface Functionalities{
    void deposit(Double amountOfCashToDeposit);
    void withdraw(Double amountOfCashToWithdraw);
    void showBalance();
}
class Acccount implements Functionalities{
    private final String uuid = UUID.randomUUID().toString();
    private String accountType;
    private Double amountOfCash = 0.0;
    public Acccount(String accountType){
        this.accountType  =accountType;
    }
    @Override
    public void deposit(Double amountOfCashTodDeposit) {
        this.amountOfCash+=amountOfCashTodDeposit;
    }

    @Override
    public void withdraw(Double amountOfCashToWithDraw) {
        if(amountOfCashToWithDraw>this.amountOfCash){
            System.out.println("Your balance is lower than amount you withdraw");
        }else {
            this.amountOfCash-=amountOfCashToWithDraw;
        }
    }

    @Override
    public void showBalance() {
        System.out.println("Your " + this.accountType + " account is: " + this.amountOfCash);
    }
}
public class Bank {
    public static void main(String[] args) {
        Functionalities savingAccount = new Acccount("Savinng");
        savingAccount.deposit(9d);
        savingAccount.showBalance();
    }
}