package pkg1;
import pkg2.MyPackage2;
class MyPackage{
	public void display() {
		System.out.println("This msg is from MyPackage class within pkg2");
	}
}
public class Mypackage_c {

	public static void main(String[] args) {
		System.out.println("Package");
		MyPackage m1=new MyPackage();
		MyPackage2 m2=new MyPackage2();
		
		m1.display();
		m2.display();
	
	}
}