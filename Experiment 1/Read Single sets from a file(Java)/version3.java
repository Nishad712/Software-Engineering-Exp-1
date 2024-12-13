import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class version3 {

    public static void main(String[] args) throws FileNotFoundException {
        // Replacing the path location with the actual file path
        File file = new File("C:\\Users\\Hasya Reddy\\Documents\\SE\\singlesetV3Data.txt");

        Scanner scanner = new Scanner(file);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double solution1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double solution2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The solutions are: " + solution1 + " and " + solution2);
        } else {
            System.out.println("No real solutions");
        }
    }
}