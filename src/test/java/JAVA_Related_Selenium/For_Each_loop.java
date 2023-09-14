package JAVA_Related_Selenium;

public class For_Each_loop {

	public static void main(String[] args) {
		
		int [][] a= {{1,2,3,4,5},{6,7,8,9,10}};
		
		
		// for loop
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				System.out.println(a[i][j]);
			}
			
		}
		
		// For each loop
		
		for(int [] tempone:a) {
			
			for(int temptwo:tempone) {
				
				System.out.println(temptwo);
				
			}
			
		}
		
		
		

	}

}
