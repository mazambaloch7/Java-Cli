import java.util.Scanner;

class O1_exercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a degree in Fahrenheit");

        double fahrenheit = input.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in celsius");

    }
}

// this is simple comments