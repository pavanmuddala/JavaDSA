package ArrayOperations;

public class SDA {
    int arr[];
    public SDA(int n){
        arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int pos,int value){
        try{
            if(arr[pos]==Integer.MIN_VALUE){
                arr[pos]=value;
                System.out.println(value + " inserted in position "+pos);
            }
            else{
                System.out.println("Position is occupied");
            }

        }catch(Exception e){
            System.out.println("some exception arised");
        }
    }
    
}