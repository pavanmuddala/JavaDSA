package ArrayOperations;
import java.util.Arrays;
import ArrayOperations.SDA;

public class InsertionArray {
    public static void main(String[] args){
        SDA sda=new SDA(5);
        System.out.println(Arrays.toString(sda.arr));
        sda.insert(2, 0);
        sda.insert(3,2);
        sda.insert(2,70);
        sda.insert(24, 30);
    }
}
