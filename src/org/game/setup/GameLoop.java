package org.game.setup;


public class GameLoop extends Thread {
	
	private final Game game;
	private final GameCanvas canvas;
    private boolean stopped;

	public GameLoop(Game game, GameCanvas canvas) {
		this.game = game;
		this.canvas = canvas;
        this.stopped = false;
	}
       
    public void stopGame() {
        stopped = true;
    }

}
