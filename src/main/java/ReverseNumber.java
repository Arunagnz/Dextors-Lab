/**
 * Created by arunagirinathanr
 * on 16/11/19 9:42 AM
 * for project dexters-lab
 **/
public class ReverseNumber {

    public static int reverseNumber(int input) {
        int output = 0;
        while (input > 0) {
            int rem = input % 10;
            output = output * 10 + rem;
            input = input / 10;
        }
        return output;
    }
}
