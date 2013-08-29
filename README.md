TorontoCodingDojoMastermind
===========================

Play mastermind against clojure

to play 

1. install [leiningen](http://leiningen.org/)
2. run 
			
		lein repl

3. start a game with	
		
		user=> (use 'mastermind.core)
		user=> (def game (new-game))

4. make guesses; possible colors are red (:r), orange (:o), yellow (:y), green (:g), blue (:b), purple (:p).  For example

		user=> (game [:y :y :g :g]) 
		[1 2]	
		user=> (game [:y :g :y :g])
		[3 0]

	the response [1 2] means that 1 peg of the right color is in the right position and two other pegs have the right color, but are in the wrong position.  The remaining peg is not of the right color. See [Mastermind](http://en.wikipedia.org/wiki/Mastermind_%28board_game%29).

	


