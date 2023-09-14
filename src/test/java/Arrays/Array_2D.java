package Arrays;

public class Array_2D {

	public static void main(String[] args) {
		
//		int [] a = {1,2,3,4,5};
//		
//		for(int i=0;i<a.length;i++) {
//			
//			System.out.println(a[i]);
//			
//		}	
//		
		int [][] s= {{1,2,3,4,5},{6,7,8,9}};
		
		for(int i=0;i<s.length;i++) {
			
			for(int j=0;j<s[i].length;j++) {
				
				System.out.println(s[i][j]);
				
			}
			
			
		}
		
		int [] [] a= {{9,8,7,6,5},{4,3,2,2,5}};
		
		for (int[] is : a) {
			
			for (int is2 : is) {
				
				System.out.println(is2);
				
			}
			
		}
		
	}

}
