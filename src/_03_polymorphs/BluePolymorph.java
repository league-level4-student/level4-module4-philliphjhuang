package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class BluePolymorph extends Polymorph{

	BluePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}

class RedMorph extends Polymorph{

	RedMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
}

class MovingMorph extends Polymorph{
	
	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
	
	public void update() {
		setX(getX() + 3);
		setY(getY() + 3);
		if(getX()>500) {
			setX(-50);
			setY(-50);
		}
	}
}

class CircleMorph extends Polymorph{
	
	int f = 1;
	int r = 100;
	
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		setX(((int)Math.cos(f)*r)+100);
		setY(((int)Math.sin(f)*r)+100);
		f++;
	}
}