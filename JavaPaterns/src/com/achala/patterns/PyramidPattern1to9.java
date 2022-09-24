package com.achala.patterns;

public class PyramidPattern1to9 {
	
	public static void main(String[] args) {
		
		int i=9;
		
	for(int k=1;k<=i;k++) {
		  for (int m=i-k;m>=1;m--) {
			  System.out.print("  ");
		  }
		
		 for (int j=1;j<=k;j++) {
			 System.out.print(j);
			 System.out.print(" ");
			 if (j!=1) {
			    if (j==k) {
				    for (int l=j-1;l>=1;l--) {
					    System.out.print(l);
					System.out.print(" ");
				    } 
			   }
		   }
		 }
		 System.out.println();
		 }
		
	}

}
