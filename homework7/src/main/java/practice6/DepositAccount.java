package practice6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public  class DepositAccount {
    private String depositNumber;
    private int balance;
    private String CustomerCode;
    //Date today = new Date();
   // SimpleDateFormat SDF = new SimpleDateFormat("E yyyy.MM.dd ");
   public DepositAccount(String customercode1,String customercode2, String depositNumber,int balance ) {
       setCustomerCode(customercode1);
       setCustomerCode(customercode2);
       setBalance(balance);
        setDepositNumber(depositNumber);
   }
    public void defray(int balance){
        if(balance >= 0){
            setBalance(getBalance() + balance);

            System.out.println("There is "+getBalance()+ " $"+" in  account ; " );

        } else {
            System.out.println("Invalid balance");
        }
    }

    public synchronized void withdrawal(int balance) throws Exception {
        if (balance >= 0) {
            if (getBalance() >= balance) {
                setBalance(getBalance() - balance);
                System.out.println("There is "+getBalance()+" in account after withdrawal");
            } else {

                throw new RuntimeException("Balance is not enough");
            }
        } else {
            throw new RuntimeException("Invalid balance");
        }
    }
    public void showBalance( String depositNumber) {
        System.out.println("Balance is "+ getBalance());
    }
    public String getDepositNumber() {
        return depositNumber;
    }
   /* public TransactionMethod[] getAllowedTransactionMethods() {
        return new TransactionMethod[0];
    }*/
}
