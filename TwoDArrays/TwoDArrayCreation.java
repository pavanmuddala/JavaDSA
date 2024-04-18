package TwoDArrays;

import java.util.Arrays;

public class TwoDArrayCreation {
    public static void main(String args[]){
        System.out.println("Hii This is pavan and we are having two d arrays here");
        // //1. Declaration creating a reference to the array
        // int arr[][];
        // //2. Instantiation creating array
        // arr=new int[2][2];
        // //3. initialization of array
        // arr[0][0] = 1;
        // arr[0][1] = 2;
        // arr[1][0] = 3;
        // arr[1][1] = 4;
        // //takes O(mn) where m-->rows and n-->columns
        // System.out.println(Arrays.deepToString(arr));

        //All in one step
        // String twoDarr[][]={{"a","b"},{"c","d"}};
        // System.out.println(Arrays.deepToString(twoDarr));

        TwoDArray t=new TwoDArray(3, 3);
        t.insert(0, 0, 23);
        t.insert(0,1,35);
        t.insert(0,1,35);
        System.out.println(Arrays.deepToString(t.arr));


    }
}
