
public class Car extends Vehicle{
	
	public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame,int width) {
		frame.fillRect(x%width+20,y,40,20);
		frame.fillRect(x%width, y+20, 80, 20);
		frame.fillOval(x%width+10,y+40,20,20);
		frame.fillOval(x%width+50,y+40,20,20);
	}
}