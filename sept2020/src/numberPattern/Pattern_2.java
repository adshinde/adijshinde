package numberPattern;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//                5
		//              5 4 5
		//            5 4 3 4 5
		//          5 4 3 2 3 4 5
		
		
		int space=6;
		int col=1;
		int start_col=5;
		
		for (int i = 1; i <=4; i++) {
			
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <=col; j++) {
				
				if (j<=col/2) {
					System.out.print(start_col-j-1+" "); // 5-2-1=
					
				}
				else {
					System.out.print(start_col-j+3+" ");
				}
				
				
			}
			System.out.println();
			space=space-2;
			col=col+2;
			
		}

	}

}
