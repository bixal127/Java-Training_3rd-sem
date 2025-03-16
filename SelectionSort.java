public class SelectionSort {

    static void Sort(int arr[]){
       
       int n = arr.length;
       for(int i = 0; i < n-1  ; i ++){
       int smallest = i;
       
             for(int j = i+1 ; j < n ; j++){
               if(arr[j] < arr[smallest])
               {
                   smallest = j;
               }
           }
                 int  temp = arr[i];
                   arr[i]= arr[smallest];
                   arr[smallest] = temp;
        }
       }

    static void Display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        
    }
System.out.println();
    }

    public static void main(String[] args){
        int arr[] ={2,5,8,4,2};
        Sort(arr);
        System.out.print("Number after sorting : " );
        Display(arr);
        
    }
}
