
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face face1=new Face(50,50);
		face1.x=50;
		face1.y=50;
		face1.draw(this);
		
		Face face2=new Face(200,100);
		face2.x=200;
		face2.y=150;
		face2.draw(this);
	}
}
