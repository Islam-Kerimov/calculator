import java.util.ArrayList;

public class CheckCorrect {
    boolean isOperation;
    boolean isThreeArg;
    boolean isRightNumber;

    public CheckCorrect() {
    }

    public void Operation(String name) {
        if (name.equals("+") || name.equals("-") || name.equals("*") || name.equals("/"))
            this.isOperation = true;
    }

    public void ThreeArg(ArrayList<String> name) {
        if (name.size() == 3)
            this.isThreeArg = true;
    }

    public void RightNumber(ArrayList<String> name) {
        int first = Integer.parseInt(name.get(0));
        int second = Integer.parseInt(name.get(2));

        if ((first > 0 && first <= 10) && (second > 0 && second <= 10))
            this.isRightNumber = true;
    }

    public void CheckAll() throws MyException {
        if (!isOperation || !isThreeArg || !isRightNumber)
            throw new MyException("Invalid data entered.\nPlease check if you entered it correctly data.");
    }
}
