import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		int sx=0;
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,1));
		cars.add(new Car(75,200,2));
		cars.add(new Car(100,350,3));
		cars.add(new Car(125,500,4));
		cars.add(new Car(150,650,5));
		while (true) {
			clear();
			for (int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move(sx);
			}
			sx++;
			sleep(0.1);
		}
	}
}
