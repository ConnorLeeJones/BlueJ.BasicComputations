import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger fact = new BigInteger("1");
        for(int i = 2; i <= value; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
    return fact;
}
}
