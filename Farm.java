class Farm 
{     
   //your code here
	private Animal[] aBunchOfAnimals = new Animal[3];
	public Farm()
	{
		aBunchOfAnimals[0] = new Cow("Cow", "Moo");
		aBunchOfAnimals[1] = new Chick("Chick", "Cluck", "Cheep");
		aBunchOfAnimals[2] = new Pig("Pig","Oink");
	}
	public void animalSounds()
	{
		for(int anNum = 0; anNum < aBunchOfAnimals.length; anNum++)
		{
			System.out.println(aBunchOfAnimals[anNum].getType() + " goes " + aBunchOfAnimals[anNum].getSound());
		}
	}
}
