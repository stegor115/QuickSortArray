//Stephen Gordon
public class QuickSort {
	    public void QuickSorter() 
	    { 	
	    //What is this?
	    }
	 static int recursiveCalls = 0; //Global variable
	    public void quickSort(int[] arr, int left, int right)  //Array, Zero for start of array, array.length for right
	    {
	        int pivotIndex = (left + right)  / 2; //Finds middle
	        int pivotValue = arr[pivotIndex]; //Gets value at middle
	        System.out.println("Pivot Index = " + pivotIndex + " Pivot Value = " + pivotValue);
	 
	        int i = left, j = right;
	 
	        while(i <= j) 
			{
	 
	            while(arr[i] < pivotValue) 
	            {
	                i++;
	            }
	 
	            while(arr[j] > pivotValue) 
	            {
	                j--;
	            }
	 
	            if(i <= j) 
	            {
	            	System.out.println("Swapping " + arr[i] + " with " + arr[j]);
 	                int tmp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp;
	                i++;
	                j--;
	            }
	             
	            if(left < i) 
	            {
	            	recursiveCalls++;
	                quickSort(arr, left, j);
	            }
	 
	            if(right > i) 
	            {
	            	recursiveCalls++;
	                quickSort(arr, i, right);
	            }
	        }//end while
	    } //end method
	    
	    public static int[] insertionSort(int[] myArray){
	    	int value; // value to insert
	    	int pos = 0;
	    	for(int i = 1; i < myArray.length; i++){
	    		value = myArray[i];
	    		pos = i;
	    		while(pos-1 != 0 && myArray[pos-1] > value){
	    			myArray[pos] = myArray[pos-1];
	    			pos = pos-1;
	    		} //end while
	    		myArray[pos] = value;
	    	} //end for
	    	return myArray;
	    } // end method
	  
	  public static void main(String[] args) 
	  {
	        QuickSort sortObj = new QuickSort();
	        int[] arr = new int[] {4, 2, 7, 5, 1, 3, 6};
	 
	        sortObj.quickSort(arr, 0, arr.length - 1);
	        
	        //insertionSort(arr);
	 
	        for(int i = 0; i < arr.length; i++) 
	        {
	            System.out.print(arr[i] + " ");
	        }
	        
	        System.out.print(" Total Recursive Calls = " + recursiveCalls);
	    }
}
