package com.array;

public class FindFirstMissingPositiveNumberInGivenArray {

	public static int smallestMissingPositiveNumber(int[] arr) {
	    if(arr.length == 0) {
	      return 1;
	    }
	    
	    int i = 0;
	    while(i < arr.length) {
	      if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
	        int otherIndex = arr[i] - 1;
	        
	        int x = arr[i];
	        arr[i] = arr[otherIndex];
	        arr[otherIndex] = x;
	      } else {
	        i++;
	      }
	    }
	    
	    for(i = 0; i < arr.length; i++) {
	      if(arr[i] != i + 1) {
	          return i + 1;
	      }
	    }
	    
	    return arr.length + 1;
	  }
	  
	  public static void main(String[] args) {
	    int[] arr = {3, 2, 6, -3, 2, 7, 4};

	    System.out.println(smallestMissingPositiveNumber(arr));
	  }

	}