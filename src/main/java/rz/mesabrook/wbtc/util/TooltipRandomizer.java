package rz.mesabrook.wbtc.util;

import java.util.Random;

public class TooltipRandomizer 
{
	
	public static String result;
	
	public static void ChosenTooltip()
	{
		Random chooser = new Random();
		int lines;
		lines = chooser.nextInt(5);
		
		switch(lines)
		{
		case 1:
			result = "A Complicatedly Complex Culinary Creation";
			break;
		case 2:
			result = "An RZ Foodstuffs Co. Product. Patent Pending.";
			break;
		case 3:
			result = "Don't ask how this is held together...";
			break;
		case 4:
			result = "If you stare into this block long enough, it'll stare back.";
			break;
		case 5:
			result = "Don't eat this block, it'll destroy your teeth.";
			break;
		}
	}
}
