package ArrayOperations;
import java.util.Arrays;
import ArrayOperations.SDA;

public class InsertionArray {
    public static void main(String[] args){
        SDA sda=new SDA(5);
        System.out.println(Arrays.toString(sda.arr));
        sda.insert(2, 340);
        sda.insert(3,2);
        sda.insert(2,70);
        sda.insert(24, 30);
        // System.out.println(sda.arr[0]+"--->first element");
        // System.out.println(sda.arr[2]+"--->second element");
        // //Array traversal
        // sda.traversal();
        // System.out.println();
        // //Search for an element in the array
        // sda.search(340);
        // sda.search(0);

        //Delete an element from the array
        System.out.println(sda.arr[2]+" Before Deletion");
        sda.delete(0);
        System.out.println(sda.arr[2]+" after deletion");
    }
}
