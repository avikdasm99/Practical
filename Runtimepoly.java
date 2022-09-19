package practical;


class  F{
	void show() {
		System.out.println("show anything");
	}
}
public class Runtimepoly extends F {
	void show() {
		System.out.println("show nothing");
	}
	public static void main(String[] args) {
		F obj=new Runtimepoly();
		obj.show();
	}

}
