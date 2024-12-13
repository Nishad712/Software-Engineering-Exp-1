import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class version4 {

    public static void main(String[] args) throws FileNotFoundException {
        // Replace "data.txt" with the actual file path
        File file = new File("C:\\Users\\Hasya Reddy\\Documents\\SE\\multiplesetV4Data.txt");

        Scanner scanner = new Scanner(file);
        List<Double> xValues = new ArrayList<>();
        List<Double> yValues = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");

            double a = Double.parseDouble(values[0].split("=")[1]);
            double b = Double.parseDouble(values[1].split("=")[1]);
            double c = Double.parseDouble(values[2].split("=")[1]);
            double x = Double.parseDouble(values[3].split("=")[1]);

            double y = a * x * x + b * x + c;

            xValues.add(x);
            yValues.add(y);
        }

        // Print the calculated y values
        for (int i = 0; i < xValues.size(); i++) {
            System.out.println("For x = " + xValues.get(i) + ", y = " + yValues.get(i));
        }

    }
}