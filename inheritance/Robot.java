package multipleInheritance;

public class Robot  implements Movement,Sound
{
	public void move()
	{
		System.out.println("robot s moving");
	}
	public void talk()
	{
		System.out.println("robot s talking");
	}
}
