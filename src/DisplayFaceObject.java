
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face[] faces=new Face[3];
		faces[0]=new Face(50,50,10,5);
		faces[1]=new Face(200,100,-10,-5);
		faces[2]=new Face(0,100,5,0);
		for (int i=0; i <30; i++) {
			clear();
			faces[0].draw(this);
			faces[1].draw(this);
			faces[2].draw(this);
			faces[0].move();
			faces[1].move();
			faces[2].move();
			sleep(0.1);
		}
	}
}
