package HW3;


public class Calculate {
    public static <T extends Number> Number sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }


    public static<T extends Number> Number multiply(T num1, T num2) {
        return num1.doubleValue() * num2.byteValue();
    }


    public static<T extends Number> Number divide(T num1, T num2) {
        if (num1.doubleValue() != 0 && num2.doubleValue() != 0) {
            return num1.doubleValue() / num2.doubleValue();
        } else {
            throw new ArithmeticException();
        }
    }


    public static <T extends Number> Number subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(Calculate.sum(12, 3.3));
        System.out.println(Calculate.sum(1, 12));
        System.out.println(Calculate.divide(12, 2));
        System.out.println(Calculate.multiply(2, 2));
        System.out.println(Calculate.subtract(2, 12));
    }
}

