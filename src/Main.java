import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x%2==0;
        System.out.println(isEven.test(4));

        Consumer<Integer> doubler = x -> System.out.println(x*2);
        doubler.accept(234);

        Function<Float, Integer> toInt = Math::round;
        System.out.println(toInt.apply(4.5f));

        Supplier<String> lorem = () -> "lorem ipsum dollor sit amet";
        System.out.println(lorem.get());

        UnaryOperator<Integer> factorOfTwo = x -> {
            int result = 2;
            for (int i = 1; i < x; i++) {
                result *= 2;
            }
            return result;
        };
        System.out.println(factorOfTwo.apply(10));

        BinaryOperator<String> joinStrings = (line1, line2) -> line1 + line2;

        System.out.println(joinStrings.apply("some string ", "joined"));
    }
}
