
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y, int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		//7-EX
		frame.fillRect(x+50,y,100,50);
		frame.fillRect(x, y+50, 200, 50);
		frame.fillOval(x+25,y+100,50,50);
		frame.fillOval(x+125,y+100,50,50);
	}
	//7-EX2
	public void move() {
		x+=vx;
		y+=vy;
	}
}