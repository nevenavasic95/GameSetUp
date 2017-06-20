package org.game.setup;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JComponent;


public class GameCanvas extends JComponent implements ComponentListener {

	private Game game;
	
	public GameCanvas() {
	} 
	
	public GameCanvas(Game game) {
		this.game = game;
		addKeyListener(game);
		addMouseListener(game);
		addMouseMotionListener(game);
		addMouseWheelListener(game);
		requestFocus();
		addComponentListener(this);
    }
	
	public void setGame(Game game) {
		this.game = game;
		addKeyListener(game);
		addMouseListener(game);
		addMouseMotionListener(game);
		requestFocus();
		addComponentListener(this);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		game.draw((Graphics2D)g);
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

}
