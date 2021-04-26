import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Split split = new Split();
        System.out.println("Input:");
        String line = reader.readLine();
        ArrayList<String> list = split.SplitString(line);

        int flag = 0;
        try {
            CheckCorrect checkCorrect = new CheckCorrect();
            checkCorrect.ThreeArg(list);
            checkCorrect.Operation(list.get(1));
            Roman roman = new Roman();
            if (!list.get(0).matches("[-+]?\\d+") && !list.get(2).matches("[-+]?\\d+")) {
                roman.RomanConv(list);
                flag++;
            }
            checkCorrect.RightNumber(list);
            checkCorrect.CheckAll();

            Result result = new Result();
            if (flag == 0)
                result.ArabNumber(list);
            else
                result.RomanNumber(list);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid data entered.\nPlease check if you entered it correctly data.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid data entered.\nPlease check if you entered it correctly data.");
        }
    }
}
