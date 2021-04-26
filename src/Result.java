import java.util.ArrayList;

public class Result {
    public void ArabNumber(ArrayList<String> list) {
        int first = Integer.parseInt(list.get(0));
        int second = Integer.parseInt(list.get(2));

        System.out.println("Output:");
        switch (list.get(1)) {
            case "+" -> System.out.println(first + second);
            case "-" -> System.out.println(first - second);
            case "*" -> System.out.println(first * second);
            case "/" -> System.out.println(first / second);
        }
    }

    public void RomanNumber(ArrayList<String> list) {
        NumberConvert numberConvert = new NumberConvert();
        int first = Integer.parseInt(list.get(0));
        int second = Integer.parseInt(list.get(2));

        if (first / second == 0)
            System.out.println("Invalid data entered.\nPlease check if you entered it correctly data.");
        else {
            System.out.println("Output:");
            switch (list.get(1)) {
                case "+" -> System.out.println(numberConvert.ArabToRoman(first + second));
                case "-" -> System.out.println(numberConvert.ArabToRoman(first - second));
                case "*" -> System.out.println(numberConvert.ArabToRoman(first * second));
                case "/" -> System.out.println(numberConvert.ArabToRoman(first / second));
            }
        }
    }
}
