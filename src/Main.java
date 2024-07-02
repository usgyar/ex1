import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int x;
        try(Scanner input = new Scanner(System.in)){
            if (!input.hasNextInt())
                throw new InvalidInputException("Должно быть целое число");
            x = input.nextInt();
            if (x < 0 || x > 49)
                throw new InvalidInputException("Число должно быть положительным и меньше 50");
        }

        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= x; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}