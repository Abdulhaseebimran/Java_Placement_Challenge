public class selection_sort {
      public static void Print_array(int arr[]){
        for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+ " ");
        }
        System.out.println();
      } 
    public static void main(String[] args) {
        int arr[] = {7,8,9, 3, 2, 1};

        // selections sort
        // outer loop
        for(int i=0; i<arr.length-1; i++){
            // inner loop
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
               if(arr[smallest] > arr[j]){
                 smallest = j;
              }
              int temp = arr[smallest];
              arr[smallest] = arr[i];
              arr[i] = temp;
            }
        }
        Print_array(arr);
    }
}
