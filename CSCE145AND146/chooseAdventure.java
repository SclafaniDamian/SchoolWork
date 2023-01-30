// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class chooseAdventure {
    
    public void CYOAdventure() {
        //Scanner
		Scanner key = new Scanner(System.in);
        // variables
        String choice = "none";
		String inventory1 = "nothing";
		//start!
		System.out.println("You are in a safety bunker in an apocalyptic zone: Do you scavenge or listen to the radio? Enter \"scavenge\" or \"listen\":");
		choice = key.nextLine();
		
		//try to scavenge
		if(choice.equalsIgnoreCase("scavenge"))
		{
			System.out.println("You know that air is safe, so you exit the bunker.");
			System.out.println("Upon exiting the bunker, you see some buildings: a grocery store, a hospital, and a police station. Where do you go? Enter \"store\", \"hospital\", or \"station\":");
			choice = key.nextLine();
			
			//go to the grocery store
			if(choice.equalsIgnoreCase("store"))
			{
				System.out.println("You go to the grocery store, a smell of meat is very distinct");
				System.out.println("Do you look for supplies, or follow the smell? Enter \"look\" or \"follow\":");
				choice = key.nextLine();
				
				//look for supplies
				if(choice.equalsIgnoreCase("look"))
				{
					System.out.println("You find some steak that you think you might be able to cook later. Do you take it? True or False:");
					boolean tfChoice = key.nextBoolean();
					
					key.nextLine();
					
					//did you take the steak?
					if(tfChoice)
					{
						inventory1 = "Steak";
					}
					
					System.out.println("Some big gross butcher enters the room. Do you try and bribe him or run? Enter \"bribe\" or \"run\":");
					choice = key.nextLine();
					
					//bribe, or run?
					if(choice.equalsIgnoreCase("bribe") && inventory1.equalsIgnoreCase("steak"))
					{
						System.out.println("You give the butcher the steak. He takes it, tells you to leave, and walks away.");
						inventory1.equals("nothing");
						System.out.println("You run back to your shelter empty handed: Ending 1");
					}
					else if(choice.equalsIgnoreCase("run") || choice.equalsIgnoreCase("bribe") && inventory1.equalsIgnoreCase("nothing"))
					{
						System.out.println("You try to run, but the butcher is surprisingly fast and captures you. Ending 2");

					}
					else
					{
						System.exit(0);
					}
				}
				//follow the smell
				else if(choice.equalsIgnoreCase("follow"))
				{
					System.out.println("You follow the smell and it takes you to some sort of meat locker. A bunch of butchers then find you and capture you. Ending 3");
				}
				else
				{
					System.exit(0);
				}
				
			}
			//go to the hospital
			else if(choice.equalsIgnoreCase("hospital"))
			{
				System.out.println("You arrive at the hospital and you spot some people. Do you try and talk with them or gather supplies? Enter \"talk\" or \"gather\":");
				choice = key.nextLine();
				
				//talk to the people
				if(choice.equalsIgnoreCase("talk"))
				{
					System.out.println("You talk to the group. They are friendly to you and ask you if you are in need of shelter. You then join the group and start having a better chance at survival! Ending 4");
				}
				//gather supplies from the hospital
				else if(choice.equalsIgnoreCase("gather"))
				{
					System.out.println("You sneak around and find some medicine, bandages, and cans of food. You then leave with a full bag of supplies. Ending 5");
				}
				else
				{
					System.exit(0);
				}
			}
			//go to the police station
			else if(choice.equalsIgnoreCase("station"))
			{
				System.out.println("You arrive at the run-down police station. You hear lots of loud people and explosions. Do you look for supplies or try to investigate the noise? Enter \"look\" or \"investigate\":");
				choice = key.nextLine();
				
				//look for supplies
				if(choice.equalsIgnoreCase("look"))
				{
					System.out.println("Do you look outside the station or inside the station? Enter \"outside\" or \"inside\":");
					choice = key.nextLine();
					
					//look around the police station from outside
					if(choice.equalsIgnoreCase("outside"))
					{
						System.out.println("You see that there is a battle going on between some hunters and lunatics. You spot some items worth taking: some scrap metal, a weapon, and a can of food. Which do you take? Enter \"metal\", \"weapon\", or \"food\":");
						choice = key.nextLine();
						
						//store item
						if(choice.equalsIgnoreCase("metal"))
						{
							inventory1 = "scrap metal";
						}
						else if(choice.equalsIgnoreCase("weapon"))
						{
							inventory1 = "weapon";
						}
						else if(choice.equalsIgnoreCase("food"))
						{
							inventory1 = "can of food";
						}
						else
						{
							inventory1 = "nothing";
						}
						
						System.out.println("You are spotted by a crazed-looking woman. \"Did you steal my weapon?!\" she yells");
						
						//check which item you have
						if(inventory1.equalsIgnoreCase("scrap metal") || inventory1.equalsIgnoreCase("can of food") || inventory1.equalsIgnoreCase("nothing"))
						{
							System.out.println("You deny her claim and run off. You escape with the item you picked up. Ending 6");
						}
						else if(inventory1.equalsIgnoreCase("weapon"))
						{
							System.out.println("After seeing his weapon in your hands, she yells \"I knew it!\" She takes the weapon from your hands and says \"Guess the number I am thinking of between 2 and 12. Guess wrong and you get exploded!!!\" Guess a number between 2 and 12:");
							int guessChoice = key.nextInt();
							
							//try and survive!
							if(guessChoice == 3)
							{
								System.out.println("\"Well, I guess I have to respect my deal...GO!\" You run away scared for your life. Ending 7");
							}
							else
							{
								System.out.println("\"WRONG!!!\" You get blown up by the crazed woman. Ending 8");
							}
						}
					}
					//look inside the station
					else if(choice.equalsIgnoreCase("inside"))
					{
						System.out.println("You go inside the police station. You hear lots of explosions going on outside and decide to make your time here quick. You take an iron bar, some cans of food, and some spare parts. You leave quickly with a full bag of supplies. Ending 9");
					}
					else
					{
						System.exit(0);
					}
				}
				//investigate where the noise is coming from
				else if(choice.equalsIgnoreCase("investigate"))
				{
					System.out.println("You find where the source of the noise is coming from. You see a bunch of people fighting. You are then hit with a stray explosive. Ending 10");
				}
				else
				{
					System.exit(0);
				}
			}
		}
		//listen to the radio
		else if(choice.equalsIgnoreCase("listen"))
		{
			System.out.println("You turn on the radio to try and get information from it.");
			System.out.println("There isn't anything useful coming from the radio except for some static \"evifruofeninenoeno\" is what you can hear. Do you look around the room or keep listening to the radio? Enter \"look\" or \"listen\":");
			choice = key.nextLine();
			
			//look around the shelter
			if(choice.equalsIgnoreCase("look"))
			{
				System.out.println("You find a keypad on the wall. What do you think the code is? Enter a 5 digit number as the code");
				int code = key.nextInt();
				
				//input code
				if(code == 11945)
				{
					System.out.println("A secret passage opens! You find out that this bunker can supply you for a long time! You decide that you don't even need to bother with scavenging anymore. Ending 11");
				}
				else
				{
					System.out.println("Your attempt at the code failed. You are sad now. Ending 12");
				}
			}
			//continue listening to the radio
			else if(choice.equalsIgnoreCase("listen"))
			{
				System.out.println("You listen to the static for hours and don\'t here anything new. You decide that there has to be something there. So you listen to the radio for days on end. You continue to find nothing.......You later find out that the radio you own is broken.");
				System.out.println("Ending 13");
			}
			else
			{
				System.exit(0);
			}
		}
		else
		{
			System.exit(0);
		}
		
		
		
		
	}
}
