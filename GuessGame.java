public class GuessGame{
	//instance varibales for the three players objects
	Player p1;
	Player p2;
	Player p3;

	//It starts the game when called in the main method
	public void startGame(){
		//creating three players objects and assigning them to the three instance variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		//variables to hold players guesses
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		//boolean variables to indicate whether or not the players guesses are correct
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		//a target number to be guessed by the players
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");

		//while(true){
			System.out.println("NUmber to guess is "+targetNumber);

			//calls all players to guess
			p1.guess();
			p2.guess();
			p3.guess();

			//accesing each players number after guessing
			guessp1 = p1.number;
			System.out.println("Player1 guessed "+guessp1);
			guessp2 = p2.number;
			System.out.println("Player2 guessed "+guessp2);
			guessp3 = p3.number;
			System.out.println("Player3 guessed "+guessp3);

			


		

	}
}