public class DebugMain {

	public static void main(String[] args) {

        int i;
	    Game game = new Game();
	    
	    /* inizializzazione del gioco */
	    	    	    
	        game.state="active";
	        game.round=1;
	        game.winner=0;
	        game.player1.name=1;
	        game.player2.name=1;

	        for (i=0;i<=5;i++) {
	            game.player1.container[i] = 3;
	            game.player2.container[i] = 3;
	            }
	        game.player1.container[6] = 0;
	        game.player2.container[6] = 0;
	        
	        while (game.state.equals("active")){
	        	game.gameController(game.state, game.player1, game.player2, game.player, game.container, game.winner, game.dateTime, game.input);
	        
	        System.out.println("A chi tocca? Giocatore:");
	        System.out.println(game.round);
	        }
	        
	}

}
