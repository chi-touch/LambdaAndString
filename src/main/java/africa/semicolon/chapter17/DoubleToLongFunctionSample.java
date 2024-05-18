package africa.semicolon.chapter17;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionSample {
    public static void main(String[] args) {
        DoubleToLongFunction doubleToLongFunction = (decimalNumber)->Double.valueOf(decimalNumber).longValue();
        double number = doubleToLongFunction.applyAsLong(30.23);
        System.out.println(number);
    }
}
