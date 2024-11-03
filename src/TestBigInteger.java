import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("222222222222222222222222222222222222222222222222");

        // Adding the two BigIntegers
        BigInteger sum = i1.add(i2);
        System.out.println(sum);

        // Multiplying the two BigIntegers
        BigInteger product = i1.multiply(i2);
        System.out.println(product);
    }
}