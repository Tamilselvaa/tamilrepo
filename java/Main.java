// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class GFather
{
	void god()
		{
			System.out.println("GFather");
		}
}		
class mother extends GFather
{
	void action()
	{
		System.out.println("MOM");
	}
	}
class uncle extends GFather
{
	void action()
	{
		System.out.println("MAMA");
	}
}

class anuty extends GFather
{
	void action()
	{
		System.out.println("ATHA");
	}
}

public class Main{
	public static void main(String[] args){
		
		
		mother m=new mother();
		m.action();
		m.god();
		uncle u=new uncle();
		u.action();
		u.god();
		aunty a=new anuty();
		a.action();
		a.god();
	}
}