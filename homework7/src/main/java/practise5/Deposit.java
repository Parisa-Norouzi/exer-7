package practise5;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deposit {
    private String depositnum;
    private volatile int balance;



}
