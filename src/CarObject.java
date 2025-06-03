
public class CarObject extends MyFrame{
	public void run() {
		Car car1=new Car(50,50,5);
		Car car2=new Car(300,250,-5);
		while(true) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car1.move(0);
			car2.move(0);
			sleep(0.1);
		}
	}
}
