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
    public void traversal(){
        try{
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" --> ");
            }
        }catch(Exception e){
            System.out.println("Array no longer exists");
        }
    }
    //Search for an element in the array
    public void search(int valuToSearch){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==valuToSearch){
                System.out.println("Value found at index  --> "+i);
                return ;
            }
        }
        System.out.println("Value not found in the array...");
    }
    //Delete element at particular index
    public void delete(int indexToBeDeleted){
        try{
            arr[indexToBeDeleted]=Integer.MIN_VALUE;
            System.out.println("The provided index is deleted successfully");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The provided index is not in the array range");
        }
    }
    
}