
public class Train extends Vehicle{
	public void draw(MyFrame frame) {
		//7-EX
		frame.fillRect(x,y,100,30);
		frame.fillOval(x+5, y+30, 10, 10);
		frame.fillOval(x+15,y+30,10,10);
		frame.fillOval(x+75,y+30,10,10);
		frame.fillOval(x+85,y+30,10,10);
	}
}
