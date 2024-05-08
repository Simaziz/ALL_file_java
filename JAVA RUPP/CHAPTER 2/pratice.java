public class pratice{
    public static boolean isSorted(int[] array){
        int length=array.length;

        for(int i=1;i<length;i++){
            if(array[i-1]>array[i]){
                return false;
            }
        }
    }
    public static void main(String[] args){
        int[] array1 ={1,2,3,4,5,6,7,8,9};
        
    }
}