//Java Program to return an array from the method 

package array;

public class ReturnArray{  
	
	//creating method which returns an array  
	static int[] get(){  
	return new int[]{10,30,50,90,60};    // Anonymous Array 
	}  
	  
	public static void main(String args[]){  
	int arr[]=get();  //calling method which returns an array  
	for(int i=0;i<arr.length;i++)  
	System.out.println(arr[i]);  
	  }
	}  