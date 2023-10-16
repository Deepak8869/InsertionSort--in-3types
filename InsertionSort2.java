public class InsertionSort2 {
    public static void main(String[] args) {
        int [] arr = {2,5,6,1};
        for(int i = arr.length-1;i>=0;i--){
            for(int j = i;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
