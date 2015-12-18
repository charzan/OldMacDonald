class Chick implements Animal 
{     
     //your code here
	private String myType;
	private String mySound;
	private String mySoundTwo;
	public Chick(String type, String sound, String soundTwo)
	{
		myType = type;
		mySound = sound;
		mySoundTwo = soundTwo;
	}
	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";

	}
	public String getSound()
	{
		if(((Math.random()*2 -1)) > 0)
		{
			return mySound;
		}
		else
		{
			return mySoundTwo;
		}
		
	}
	public String getType(){return myType;}
}