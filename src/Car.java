
public class Car {
	int x,y,vx;
	public Car(int x,int y, int vx) {
		this.x=x;
		this.y=y;
		this.vx=vx;
	}
	public void draw(MyFrame frame) {
		//7-EX
		frame.fillRect(x%1000+50,y,100,50);
		frame.fillRect(x%1000, y+50, 200, 50);
		frame.fillOval(x%1000+25,y+100,50,50);
		frame.fillOval(x%1000+125,y+100,50,50);
	}
	//7-EX2
	public void move(int sx) {
		x=x+vx+sx;
	}
}