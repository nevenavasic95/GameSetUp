package org.game.setup;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.game.setup.Game;
import org.game.setup.GameCanvas;
import org.game.setup.GameLoop;

public class GameConfiguration {
	
	public static void start(Game game) {
		JFrame frame = new JFrame("Pac-Man");
		frame.setSize(game.Width(), game.Height());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameCanvas canvas = new GameCanvas();
		frame.add(canvas);
		frame.setVisible(true);
		canvas.requestFocus();
		new GameLoop(game, canvas).start();
			
	}

}
