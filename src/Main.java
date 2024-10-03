import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Calling Method "Permission" 5 times with different arguments
        System.out.println(permission(generateRandomAge(), -5));
        System.out.println(permission(generateRandomAge(), 15));
        System.out.println(permission(generateRandomAge(), 30));
        System.out.println(permission(generateRandomAge(), 0));
        System.out.println(permission(generateRandomAge(), 28));
    }
// Using булево алгебра
    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age < 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge () {
        Random random = new Random();
        return random.nextInt(100); // Generating random age from 0 to 99
    }
}// End of the program, sir!