import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		 BubbleSort ob = new BubbleSort();
	        int v;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the Number of Elements: ");
	        v = sc.nextInt();
	        int arr[] = new int[v];
	        System.out.println("Enter the elements of Array: "); 
	        for(int i=0; i<v; i++)  
	        {  
	           
	        arr[i]=sc.nextInt();  
	        }  
	        System.out.println("Array elements are: ");  
	          
	        for (int i=0; i<v; i++)   
	        {  
	        System.out.println(arr[i]);  
	        }  
	        ob.bubbleSort(arr);
	        System.out.println("Sorted Array:");
	        ob.printArray(arr);
	}
	
	void bubbleSort(int arr[])
    {
        int v = arr.length;
        for (int i = 0; i < v-1; i++)
            for (int j = 0; j < v-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	
	 void printArray(int arr[])
	    {
	        int v = arr.length;
	        for (int i=0; i<v; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

}
