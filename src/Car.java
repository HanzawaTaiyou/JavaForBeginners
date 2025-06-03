
public class Car {
	int x,y,vx;
	public Car(int x,int y, int vx) {
		this.x=x;
		this.y=y;
		this.vx=vx;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+50,y,100,50);
		frame.fillRect(x, y+50, 200, 50);
		frame.fillOval(x+25,y+100,50,50);
		frame.fillOval(x+125,y+100,50,50);
	}
	public void move() {
		x+=vx;
	}
}
