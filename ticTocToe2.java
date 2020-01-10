import java.util.*;

class ticTocToe2{
		static int place =0;
		static String flag;

		static String ar[] = new String[9];
		static String winner=null;

	public static void main(String[] args){

		int counter=0;
		flag = "player1";
	
		
		//System.out.println("length -> "+ar.length);

		while(winner==null)
		{	
			System.out.println("counter " + counter);
			Scanner in = new Scanner(System.in);

			

			winner = checkWinner();
			if(counter == 8)
				winner="draw";
			if(winner !=null){
				if (winner.equalsIgnoreCase("draw")) {
					System.out.println("It's a draw! Thanks for playing.");
					break;
				} else {
					System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
					break;
				}
			}
		 	
			
			
			if(counter % 2 ==0)
			{
				System.out.println("Player1 plz Enter Your Place ->");
				place = in.nextInt();
			}
			else
			{
				System.out.println("Player2 plz Enter Your Place ->");
				place = in.nextInt();
			}

			
			counter++;
			if(flag.equals("player1"))
			{	
				flag = "player2";
				ar[place-1]="o";
				
			}
			else
			{
				flag = "player1";
				
				ar[place-1]="x";
				
			}
			int c=0;
			for(int i=0;i<=ar.length-1;i++)
			{
				System.out.print(ar[i]+" |");
				c++;
				if(c==3 || c==6)
					System.out.println();
			}
			System.out.println();
			
			if(counter==ar.length)
				break;


				
		}

		

	}

static String checkWinner() {
		for (int a = 0; a < 8; a++) 
		{
			String line = null;
			switch (a) {
			case 0:
				line = ar[0] + ar[1] + ar[2];
				break;
			case 1:
				line = ar[3] + ar[4] + ar[5];
				break;
			case 2:
				line = ar[6] + ar[7] + ar[8];
				break;
			case 3:
				line = ar[0] + ar[3] + ar[6];
				break;
			case 4:
				line = ar[1] + ar[4] + ar[7];
				break;
			case 5:
				line = ar[2] + ar[5] + ar[8];
				break;
			case 6:
				line = ar[0] + ar[4] + ar[8];
				break;
			case 7:
				line = ar[2] + ar[4] + ar[6];
				break;
			}

			if (line.equals("xxx")) {
				return "x";
			} else if (line.equals("ooo")) {
				return "o";
			}
		}

		// for (int a = 0; a < 9; a++) {
		// 	if (Arrays.asList(ar).contains(String.valueOf(a+1))) {
		// 		break;
		// 	}
		// 	else if (a == 8) return "draw";
		// }

		return null;
}

static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			ar[a] = String.valueOf(a+1);
		}
	}
}
				