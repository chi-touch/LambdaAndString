package africa.semicolon.chapter17;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionSample {
    public static void main(String[] args) {
        ToIntBiFunction<Integer,Integer> toIntBiFunction = (numb,number)-> number;

        int result = toIntBiFunction.applyAsInt(2,6);
        System.out.println(result);

//
//        ToIntBiFunction<Integer,Integer> toIntBiFunction = (x,y)-> y;
//
//        int result = toIntBiFunction.applyAsInt(2,6);
//        System.out.println(result);
    }
}
