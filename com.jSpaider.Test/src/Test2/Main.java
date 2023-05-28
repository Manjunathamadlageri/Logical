package Test2;
class Animal
{
	String name;
	public void eat()
	{
		System.out.println("Animal is Eating");
	}
}
class Dog extends Animal
{

	public void DogName(String name)
	{
		this.name=name;
		System.out.println("name");
	}
}
public class Main 
{

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.eat();
		System.out.println(d.name);

	}

}
