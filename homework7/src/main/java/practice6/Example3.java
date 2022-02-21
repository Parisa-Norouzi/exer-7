package practice6;


public class Example3 {
    public static void main(String[] args) throws Exception {

        //Customer customer1=new Customer("Ali","124");
        //Customer customer2=new Customer("Majid","125");
        //List<String> customers = new ArrayList<String>();
       //customers.add("123");
       // customers.add("125");
        DepositAccount deposit = new DepositAccount("124","126","1234",250);
        Thread costumerA = new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName()+" is running");
               // for (int i =0 ; i< 10; i++) {
                    deposit.withdrawal(10);
               // }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread costumerB = new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName() + " is running");
                // for (int i =0 ; i< 10; i++) {
                deposit.withdrawal(40);
            //}
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        costumerA.start();
        costumerB.start();
        costumerA.join();
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("final balance is:"+deposit.getBalance());

    }
}