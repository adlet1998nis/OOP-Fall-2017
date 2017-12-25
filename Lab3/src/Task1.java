class Animal
{
	public String name;
	public String sound;
	public Animal()
	{
		name="";
		sound="";
	}
	public Animal(String name,String sound)
	{
		this.name=name;
		this.sound=sound;
	}
	public String getInfo()
	{
		return "Name:"+this.name+"."+"Sound:"+this.sound;
	}
	public String getInfo(String addInfo)
	{
		return "Name:"+this.name+"."+"Sound:"+this.sound+".Additional Info:"+addInfo;
	}
	
	
}
class Cat extends Animal
{
	public int mass;
	public Cat()
	{
		super();
		mass=0;
	}
	public Cat(String name,String sound,int mass)
	{
		super(name,sound);
		this.mass=mass;
		
	}
	public String getInfo()
	{
		return super.getInfo()+".Mass:"+this.mass;
	}
	public String getInfo(String addInfo)
	{
		return super.getInfo(addInfo)+"Mass:"+this.mass;
	}
}
public class Task1 {

	public static void main(String[] args) {
		
		Cat cat=new Cat("Moska","Meow",7);
		System.out.println(cat.getInfo());
		System.out.println(cat.getInfo("Cat is the most beautiful animal."));
	}

}
