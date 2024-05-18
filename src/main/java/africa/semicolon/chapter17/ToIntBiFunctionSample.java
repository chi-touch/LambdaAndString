package africa.semicolon.chapter17;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionSample {
    public static void main(String[] args) {
        ToIntBiFunction<Integer,Integer> toIntBiFunction = Integer::compareTo;

        int result = toIntBiFunction.applyAsInt(2,2);
        System.out.println(toIntBiFunction);
    }
}
