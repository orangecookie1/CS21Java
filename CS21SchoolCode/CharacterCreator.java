public class CharacterCreator{
	//Global Variable or smt like that
	int[] attributes = new int[6];
	int[] modifier = new int[6];
	public CharacterCreator(){
		//Order of Attributes: Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma

		//1. Fill Attributes
		for (int x = 0; x < 6; x++){
			attributes[x] = attributeBuilder();
		}

		//2. Pick Race and modify attributes
		String race = raceSelector();

		//Fill Modifers
		for(int u = 0; u < 6; u++){
			modifier[u] = modifier(u);
		}


		String CharacterClass = classSelector();
		int health = health(CharacterClass);

		System.out.print("Race: " + race + "\t\t");
		System.out.println("Age: " + Age(race) + "");


		System.out.print("Class: " + CharacterClass + "\t\t");
		System.out.println("Level: None"); //Didn't Do it :c


		System.out.println("Health: " + health);
		System.out.println("+++++++++++++++++++++++++++++++");


		//3. Display Attributes
		System.out.print("Strength: " + attributes[0] + "\t\t");
		System.out.println("Strength Modifier: " + modifier[0]);

		System.out.print("Dexterity: " + attributes[1] + "\t\t");
		System.out.println("Dexterity Modifier: " + modifier[1]);

		System.out.print("Constitution:" + attributes[2] + "\t\t");
		System.out.println("Constitution Modifier: " + modifier[2]);

		System.out.print("Intelligence:" + attributes[3] + "\t\t");
		System.out.println("Intelligence Modifier: " + modifier[3]);

		System.out.print("Wisdom: " + attributes[4] + "\t\t");
		System.out.println("Wisdom Modifier: " + modifier[4]);

		System.out.print("Charisma: " + attributes[5] + "\t\t");
		System.out.println("Charisma Modifier: " + modifier[5]);



		System.out.println();
		System.out.println("BRICK WALL!!!");

		//AssCi art
		System.out.println("______________________________________________________________________");
		System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
		System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|__");
		System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
		System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|__");
		System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
		System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|__");
		System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
		System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|__");
		System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
		System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|__");
		System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
		System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|__");
		System.out.println("_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
		System.out.println("___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|__");
	//Brick Wall is cool!
    }

  // Rolls Between 1 and Choosen End number
	public int Roll(int sides) {
		return (int) (Math.random() * sides) + 1;
  	}

  // Rolls Between Choosen Start and Choosen End number
	public int Roll2(int start, int end){
		end = end - start;
    	return (int) (Math.random() * end) + start;
    }

  // Sum of Three Numbers
	public int SumOf3(int num1, int num2, int num3) {
		return num1 + num2 + num3;
  }

  // Sorts Values in an array from least to greatest
  public int[] SortArray(int[] arr){
  	for (int x =5; x < arr.length - 1; x++) {
    	int y = x;
    	while (y >= 0 && arr[y] < arr[y + 1]) {
        	int temp = arr[y];
        	arr[y] = arr[y + 1];
        	arr[y + 1] = temp;
        	y--;
      	}
    }
    return (arr);
  }

  // Makes the Attributes For the character
	public int attributeBuilder(){
		int sum = 0;
    	int[] attributeData = new int[4];

    	for (int x = 0; x < attributeData.length; x++) {
    		attributeData[x] = Roll(6);
    	}

    	SortArray(attributeData);
		sum = SumOf3(attributeData[0],attributeData[1],attributeData[2]);
    	return sum;
	}
	//Selects Character Race
	//Order of Attributes: Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma
	public String raceSelector(){
		String[] options = {"Human", "Elf", "Dwarf", "Halfling", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Teifling"};
		int rand = Roll2(0, options.length - 1);
		String race = options[rand];

		switch(race){
			case "Human":
				for(int x = 0; x < 6; x++){
					attributes[x]++;
				}

			case "Elf":
				attributes[1] += 2;

			case "Dwarf":
				attributes[2] += 2;

			case "Halfling":
				attributes[1] += 2;

			case "Dragonborn":
				attributes[0] += 2;
				attributes[5] += 1;

			case "Gnome":
				attributes[3] += 2;

			case "Half-Elf":
				attributes[5] += 2;
				attributes[3] += 1;
				attributes[1] += 1;

			case "Half-Orc":
				attributes[0] += 2;
				attributes[2] += 1;

			case "Teifling":
				attributes[5] += 2;
				attributes[3] += 1;
		}
		return race;
	}

	public String classSelector(){
		//Order of Attributes: Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma
		if((attributes[0] >= attributes[1] && attributes[0] >= attributes[2] && attributes[0] >= attributes[3] && attributes[0] >= attributes[4] && attributes[0] >= attributes[5]) && (attributes[2] >= attributes[1] && attributes[2] >= attributes[3] && attributes[2] >= attributes[4] && attributes[2] >= attributes[5]))
			return "Barbarian";
		else if((attributes[5] >= attributes[0] && attributes[5] >= attributes[1] && attributes[5] >= attributes[2] && attributes[5] >= attributes[3] && attributes[5] >= attributes[4]) && (attributes[1] >= attributes[0] && attributes[1] >= attributes[2] && attributes[1] >= attributes[3] && attributes[1] >= attributes[4]))
			return "Bard";
		else if((attributes[4] >= attributes[0] && attributes[4] >= attributes[1] && attributes[4] >= attributes[2] && attributes[4] >= attributes[3] && attributes[4] >= attributes[5]) && (attributes[5] >= attributes[0] && attributes[5] >= attributes[1] && attributes[5] >= attributes[2] && attributes[5] >= attributes[3]))
			return "Cleric";
		else if((attributes[4] >= attributes[0] && attributes[4] >= attributes[1] && attributes[4] >= attributes[2] && attributes[4] >= attributes[3] && attributes[4] >= attributes[5]) && (attributes[3] >= attributes[0] && attributes[3] >= attributes[1] && attributes[3] >= attributes[2] && attributes[3] >= attributes[5]))
			return "Druid";
		else if((attributes[0] >= attributes[1] && attributes[0] >= attributes[2] && attributes[0] >= attributes[3] && attributes[0] >= attributes[4] && attributes[0] >= attributes[5]) && (attributes[1] >= attributes[5] && attributes[1] >= attributes[2] && attributes[1] >= attributes[3] && attributes[1] >= attributes[4]))
			return "Fighter";
		else if((attributes[1] >= attributes[0] && attributes[1] >= attributes[2] && attributes[1] >= attributes[3] && attributes[1] >= attributes[4] && attributes[1] >= attributes[5]) && (attributes[4] >= attributes[1] && attributes[4] >= attributes[2] && attributes[4] >= attributes[3] && attributes[4] >= attributes[5]))
			return "Monk";
		else if((attributes[0] >= attributes[1] && attributes[0] >= attributes[2] && attributes[0] >= attributes[3] && attributes[0] >= attributes[4] && attributes[0] >= attributes[5]) && (attributes[5] >= attributes[1] && attributes[5] >= attributes[2] && attributes[5] >= attributes[3] && attributes[5] >= attributes[4]))
			return "Paladin";
		else if((attributes[4] >= attributes[0] && attributes[4] >= attributes[1] && attributes[4] >= attributes[2] && attributes[4] >= attributes[3] && attributes[4] >= attributes[5]) && (attributes[1] >= attributes[0] && attributes[1] >= attributes[2] && attributes[1] >= attributes[3] && attributes[1] >= attributes[5]))
			return "Ranger";
		else if((attributes[1] >= attributes[0] && attributes[1] >= attributes[2] && attributes[1] >= attributes[3] && attributes[1] >= attributes[4] && attributes[1] >= attributes[5]) && (attributes[3] >= attributes[0] && attributes[3] >= attributes[2] && attributes[3] >= attributes[4] && attributes[3] >= attributes[5]))
			return "Rouge";
		else if((attributes[5] >= attributes[0] && attributes[5] >= attributes[1] && attributes[5] >= attributes[2] && attributes[5] >= attributes[3] && attributes[5] >= attributes[4]) && (attributes[2] >= attributes[0] && attributes[2] >= attributes[1] && attributes[2] >= attributes[3] && attributes[2] >= attributes[4]))
			return "Sorcerer";
		else if((attributes[5] >= attributes[0] && attributes[5] >= attributes[1] && attributes[5] >= attributes[2] && attributes[5] >= attributes[3] && attributes[5] >= attributes[4]) && (attributes[4] >= attributes[0] && attributes[4] >= attributes[1] && attributes[4] >= attributes[2] && attributes[4] >= attributes[5]))
			return "Warlock";
		else
			return "Wizard";
	}

	//Modifier
	public int modifier(int j){
		if(1 == attributes[j])
			return(-5);
		if(2 == attributes[j] || 3 == attributes[j])
			return(-4);
		if(4 == attributes[j] || 5 == attributes[j])
			return(-3);
		if(6 == attributes[j] || 7 == attributes[j])
			return(-2);
		if(8 == attributes[j] || 9 == attributes[j])
			return(-1);
		if(10 == attributes[j] || 11 == attributes[j])
			return(0);
		if(12 == attributes[j] || 13 == attributes[j])
			return(1);
		if(14 == attributes[j] || 15 == attributes[j])
			return(2);
		if(16 == attributes[j] || 17 == attributes[j])
			return(3);
		if(18 == attributes[j] || 19 == attributes[j])
			return(4);

		return(5);
		}

	//Age
	public int Age(String race){
		if(race == "Dwarf")
			return Roll2(50, 250);
		else if(race == "Elf")
			return Roll2(100, 600);
		else if(race == "Halfling")
			return Roll2(100, 600);
		else if(race == "Human")
			return Roll2(17, 55);
		else if(race == "Dragonborn")
			return Roll2(15, 60);
		else if(race == "Gnome")
			return Roll2(40, 245);
		else if(race == "Half-Elf")
			return Roll2(19, 140);
		else if(race == "Half-Orc")
			return Roll2(14, 60);

		return Roll2(17, 65);
	}



	//Hitpoints
	public int health(String CharacterClass){
		if(CharacterClass == "Barbarian")
			return Roll(4) + 10 + modifier[2];
		else if(CharacterClass == "Barbarian" || CharacterClass == "Bard" || CharacterClass == "Cleric" || CharacterClass == "Druid" || CharacterClass == "Monk" || CharacterClass == "Rouge" || CharacterClass == "Warlock")
			return Roll(4) + 6 + modifier[2];
		else if(CharacterClass == "Fighter" || CharacterClass == "Paladin" || CharacterClass == "Ranger")
			return Roll(4) + 6 + modifier[2];

		return Roll(4) + 4 + modifier[2];
	}



  public static void main(String[] args) {
    CharacterCreator app = new CharacterCreator();
  }
}