package numberPattern;

public class Pattern_1 {
	public static void main(String[] args) {
		
		
		//          1
		//         2 2
		//        3 3 3
		//       4 4 4 4
		//      5 5 5 5 5
		
		
		int space=4;
		int col=1;
		
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <=col; j++) {
				System.out.print(i+" ");
				
			}
			
			System.out.println();
			space--;
			col++;
			
		}
		
	}

}
