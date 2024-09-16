//These the game for gussing 
import java.util.Scanner;
class Guesser{
	int guessNum;
	public int guessingNumber(){
		Scanner sc =new Scanner(System.in);
		int i;
		
		System.out.println("Guesser ! Please guess the number");
		guessNum=sc.nextInt();
		return guessNum;
	}
		

	}


class Player{
	int pguessNum;
	int attempt;
	
	public int pguessingNumber(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Player! Please guess the number");
		
		
		pguessNum=sc.nextInt();
		
		if(pguessNum>100){
			System.out.println("Its is not in range!Please choose the number in between 1 to 100");
			
		
		}
		else {
		 		System.out.println(pguessNum);
			}
		
			return pguessNum;
		}
	}
		
	class Umpire{
		int numFromGuesser;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;
		public void collectNumFromGuesser(){
		Guesser gs=new Guesser();
		numFromGuesser=gs.guessingNumber();
	}
	public void collectNumFromPlayer(){
		
		Player p_one=new Player();
		Player p_two=new Player();
		Player p_three=new Player();
		numFromPlayer1=p_one.pguessingNumber();
		numFromPlayer2=p_two.pguessingNumber();
		numFromPlayer3=p_three.pguessingNumber();
	}

	void compare(){
		if(numFromGuesser==numFromPlayer1){
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
				System.out.println("All players won the game!");
			}
			else if(numFromGuesser==numFromPlayer2){
				System.out.println("Player 1 and Player 2 has won the game!");
			}
			else if(numFromGuesser==numFromPlayer3){
				System.out.println("Player 1 and Player 3 has won the game!");
			}
			else{
			System.out.println("Player 1 has won the game!");
		}

		}
		else if(numFromGuesser==numFromPlayer2){
			if(numFromGuesser==numFromPlayer3){
				System.out.println("Player  and Player 3 has won the game!");
			}
			else{
			System.out.println("Player 2 has won the game!");
		}
		}
		else if(numFromGuesser==numFromPlayer3){
			System.out.println("Player 3 has won the game!");
		}
		else{
			System.out.println("Game lost! Try again ");
			System.out.println("Than you for playing");
		}
	}	

	


}
public class GuessingGame{
	public static void main(String args[]){
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}
}