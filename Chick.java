class Chick implements Animal 
{     
     //your code here
	private String myType;
	private String mySound;
	public Chick(String type, String sound, String soundB)
	{
		myType = type;
		mySound = sound;
		mySound = soundB;
	}
	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";

	}
	public String getSound(){return mySound;}
	public String getType(){return myType;}
}