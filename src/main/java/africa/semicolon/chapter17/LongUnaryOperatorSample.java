package africa.semicolon.chapter17;

import java.util.function.LongUnaryOperator;
import java.util.function.ToIntBiFunction;

public class LongUnaryOperatorSample {
    public static void main(String[] args) {
        LongUnaryOperator unaryOperator = (number)-> 2 * number;
        Long result = unaryOperator.applyAsLong(30L);
        System.out.println(result);

//        ToIntBiFunction<Integer,Integer> toIntBiFunction = (x, y)-> y;
//
//        int result = toIntBiFunction.applyAsInt(2,6);
//        System.out.println(result);
    }
}
