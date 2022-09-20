package rough;

class Area{
	int length,breadth;
	
	Area(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void getArea() {
		int area = length*breadth;
		System.out.println("the area = "+area);
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		Area a=new Area(5,6);
        a.getArea();
	}
}
