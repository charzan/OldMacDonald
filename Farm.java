class Farm 
{     
   //your code here
	private Animal[] aBunchOfAnimals = new Animal[3];
	public Farm()
	{
		aBunchOfAnimals[0] = new NamedCow("Cow", "Bluebell", "Moo");
		aBunchOfAnimals[1] = new Chick("Chick", "Cluck", "Cheep");
		aBunchOfAnimals[2] = new Pig("Pig","Oink");
	}
	public void animalSounds()	{
		for(int anNum = 0; anNum < aBunchOfAnimals.length; anNum++)
		{
			System.out.println(aBunchOfAnimals[anNum].getType() + " goes " + aBunchOfAnimals[anNum].getSound());
		}
		System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName());
	}
}
