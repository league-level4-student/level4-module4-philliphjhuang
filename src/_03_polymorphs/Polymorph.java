package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width = 50;
    private int height = 50;
    Polymorph(int x, int y){
    	this.x = x;
    	this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    
    public void setX(int x) {
    	this.x = x;
    }
    public int getX() {
    	return x;
    }
    
    public void setY(int y) {
    	this.y = y;
    }
    public int getY() {
    	return y;
    }
    
    public void setWidth(int width) {
    	this.width = width;
    }
    public int getWidth() {
    	return width;
    }
    
    public void setHeight(int height) {
    	this.height = height;
    }
    public int getHeight() {
    	return height;
    }
}
