public class Calculation {

    public void fibonacci(int length) {
        int firstNum = -1;
        int lastNum =  1;
        int midNum;

        for (int i = 0; i < length; i++) {
            midNum = firstNum+lastNum;
            System.out.print(midNum + ", ");
            firstNum = lastNum;
            lastNum = midNum;
        }
    }
}
