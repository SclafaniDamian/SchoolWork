// Made By Damian Sclafani
package CSCE145AND146;

public class TowersOfHanoi {
    
    public void TowersOfHanoiMain() {
		tower(10,"A","B","C");

	}
	static int count = 0;
	public static void tower(int diskNum, String fromRod, String toRod, String otherRod)
	{
		if(diskNum <= 1)
		{
			System.out.println((++count) + " Move disk 1 from rod " + fromRod + " to rod " + toRod);
			return;
		}
		tower(diskNum-1,fromRod,otherRod,toRod);
		System.out.println((++count) + " Move disk " + diskNum + " from rod " + fromRod + " to rod " + toRod);
		tower(diskNum-1,otherRod,toRod,fromRod);
	}
}
