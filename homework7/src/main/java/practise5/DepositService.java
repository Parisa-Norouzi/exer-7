package practise5;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DepositService implements IDepositService {



    public /*synchronized*/ Thread transfer(Deposit depositnum1, Deposit depositnum2, int balance) {
        //validateInput(depositnum1,depositnum2,balance);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        depositnum1.setBalance(depositnum1.getBalance()-balance);
        System.out.println("There is "+depositnum1.getBalance()+ " $"+" in  account "+ depositnum1.getDepositnum());
        depositnum2.setBalance(depositnum2.getBalance()+balance);
       System.out.println("There is "+depositnum2.getBalance()+ " $"+" in  account "+ depositnum2.getDepositnum() );
        return null;
    }

    private void validateInput(Deposit deposit1, Deposit deposit2, int balance)  {
        if(balance>0){
           // throw new RuntimeException("Balance is negative");

        } else {
            System.out.println( "balance is valid");
            }

        }
    }


