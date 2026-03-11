package Multilevel;

class Puppy extends Dog
{
	void Sleep()
	{
		System.out.println("Sleeping");
	}
	public static void main(String[]args)
	{
		Puppy p=new Puppy();
		p.Eat();
		p.Sleep();
		p.Bark();
	}
}
