package practise5;


public interface IDepositService {
    Thread transfer(Deposit depositnum1, Deposit depositnum2, int balance);
}
