class Arithmetic {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        int addition = num1 + num2;
        System.out.println(addition);

        int num3 = 12;
        int num4 = 12;
        int multiply = num3 * num4;
        System.out.println(multiply);

        int num5 = 10;
        int num6 = 2;
        int divide = num5 % num6;
        System.out.println(divide);

        int num7 = 7;
        num7 = num7 + 2;
        num7 += 1;
        num7++;
        num7--;
        num7 -= 1;
        num7 *= 7;
        num7 /= 2;
        System.out.println(num7);

        int r = ++num7; // increment and then fetch the value
        int r2 = num7++; // fetch the value and then increment
        System.out.println(r);
        System.out.println(r2);
    }
}