// BusinessSearch.java
// Searches for a business and returns output

import static java.lang.System.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class BusinessSearch{
	
   public static void main(String[] args) throws IOException{
      BufferedReader in = new BufferedReader(new FileReader("favorites.txt"))
      try{
      System.out.println(favorites)	
      }
      while(true){
         String business = in.readLine();
         if(name == null) break;
      }






   }
   
   public void mergeSort(int[] A, int left, int right){
      int midpoint;
      if (left < right){
      	midpoint = (left+right)/2;
      	MergeSort(A, left, midpoint);
      	MergeSort(A, midpoint, right);
      	Merge(A, left, midpoint, right);
      }	
   }
   public void merge(int[] A, int left, int mid, int right){
   	   int[] L = new int[mid-left+1];
   	   for(int i=0;i < mid-left+1;i++){
   	   	   L[i]=A[i];
   	   }
   	   
   	   	int [R] = new int[mid-left+1];
   	   	for(int j = 0; j < right-mid; j++){
           R[j] = A[mid+j];
   	   	}

        int i;
        int j;
        int k = 0;
        for(k = left; k < right;k++){
           if(i<L.length && j < R.length){
           	   A[k] = L[i];
           	   i++;
           }
           else{
           	   A[k] = R[j];
           	   j++;
           }
        }
      else if(i >= L.length){
      	      A[k] = R[j];
      	      j++;
      }
      else
      	  A[k] = L[i]
    }
    public static int binarySearch(int[] A, int left, int right, int search){
       int b;

       if(left > right){
       	   return -1;
       	}else{
       		b = (left+right)/2;
       		if(search == A[b]){
       			return b;
       		}else if(search < A[b]){
       			return binarySearch(A, left, right, search);
       		}else{
       			return binarySearch(A, left+1, right, search);
       		}
       	}
    }


    }
}
