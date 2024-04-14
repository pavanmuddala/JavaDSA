//1.Arrays can store data of specified type
//2.Elements of an array located in a contigous location
//3.Each element of an array have an unique index
//4.The size of an array is predefined and can not be modified

//There are two types of arrays
//1. One Dimentional or single dimentional arrays
//2. Multi Dimentional Arrayss

//There are three steps to create array
//1.Declare a variable which will store the first element address of the array
//2.instantiate the array with required size
//3.initialize the array if not it will store 0 by default

import java.util.Arrays;
class MyArrays {
    public static void main(String args[]){
        System.out.println("In arrays....");
        int[] arr;
        arr=new int[5];
        arr[0] = 23;
        arr[1] = 10;
        arr[2] = 20;
        System.out.println(Arrays.toString(arr));

        //Altogether in a single step
        String sArr[] = {"a","b","c"};
        System.out.println(Arrays.toString(sArr));

    }
}
