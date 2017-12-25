
public class Temperature {
	private double value;
	private char character;
	public double getValue()
	{
		return this.value;
	}
	public void setValue(double value)
	{
		this.value=value;
	}
	public char getCharacter()
	{
		return this.character;
	}
	public void setCharacter(char character)
	{
		this.character=character;
	}
	public Temperature(double value)
	{
		this.value=value;
		this.character='C';
	}
	public Temperature(char character)
	{
		this.value=0;
		this.character=character;
	}
	public Temperature(double value,char character)
	{
		this.value=value;
		this.character=character;
	}
	public Temperature()
	{
		this.value=0;
		this.character='C';
	}
	public double inCelsius()
	{
		if(character=='F')
		{
		
			return (5*(value-32))/(9*1.0);
		}
		return value;
	}
	public double toFahrenheit(double value,char character)
	{
		if(character=='C')
		{
			this.value=(9*(value)/(5*1.0))+32;
			this.character='F';
			return (9*(value)/(5*1.0))+32;
		}
		return -1;
	}
	public String returnScale()
	{
		return Double.toString(this.getValue())+this.getCharacter();
	}
	
	
	public static void main(String[] args) {
		Temperature t=new Temperature();
		t.setValue(2);
		t.setCharacter('F');
		System.out.print(t.getValue()+" ");
		System.out.println(t.getCharacter());
		System.out.println(t.inCelsius());
		System.out.print(t.getValue()+" ");
		System.out.println(t.getCharacter());
		
				

	}

}
