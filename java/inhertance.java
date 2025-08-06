package inheritance;
class GParent
{
	int age=25;
	void call() {
		System.out.println("GParent age"+ age);
	}
}
class Parent extends GParent
{
	int D=25;
	void call2() {
		System.out.println("Parent Dat"+ D);
	}
}
class child extends Parent
{
	String str="Tamil";
	void name() {
		System.out.println("child name"+str);
	}
}
public class inhertance {

	public static void main(String[] args) {
		Parent obj=new Parent();
		obj=call();
		obj=call2();
		obj=name();
		// TODO Auto-generated method stub

	}
   
}