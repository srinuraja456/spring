package com.achala.patterns;

public class PyramidPattern9to1 {	
	
	public static void main(String[] args) {
		
		int i=9;
		//8<=9
		for (int j=i;j>=1;j--) {	
			
			for (int m=j;m>1;m--) {
				  System.out.print(" ");
			  }
			
			for(int k=j;k>=j;k--) {
				if(k==i) System.out.print(k);
				else {
				    for(int r=k;r<i;r++) {		
					      System.out.print(r);
				    }					
				    for(int l=i;l>=j;l--) {		
					      System.out.print(l);
				    }	
			    }
			System.out.println();
			
		   }// for (k)
		
	
	}// for (j)
}
	
}
