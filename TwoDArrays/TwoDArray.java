package TwoDArrays;

public class TwoDArray {
    int arr[][]=null;
    //initializing with integer.minvalue
    TwoDArray(int rows,int columns){
        arr=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    //insertion function
    void insert(int row,int column,int value){
        try{
            if(arr[row][column]==Integer.MIN_VALUE){
                arr[row][column]=value;
                System.out.println("Value inserted successfully");
            }
            else{
                System.out.println("Index is occupied");;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index...");
        }
    }
}
