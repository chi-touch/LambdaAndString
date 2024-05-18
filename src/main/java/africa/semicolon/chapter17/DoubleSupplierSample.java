package africa.semicolon.chapter17;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DoubleSupplierSample {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = ()-> new Random().nextDouble();
        System.out.println(doubleSupplier.getAsDouble());

                //.forEach(x-> System.out.println(x));

    }

//    Supplier<Integer> supplier = ()-> new Random().nextInt();
//        System.out.println(supplier.get());


        //Stream.generate(supplier).forEach(x-> System.out.println(x));
}
