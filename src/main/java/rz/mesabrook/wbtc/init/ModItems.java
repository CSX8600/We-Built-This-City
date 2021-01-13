package rz.mesabrook.wbtc.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import rz.mesabrook.wbtc.items.drinks.WBTC_Beverage;
import rz.mesabrook.wbtc.items.weapons.ItemSod;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Test Drink
	//public static final Item TEST_WATER = new WBTC_Beverage("test_water");
	
	// Sods
	public static final Item WOOD_SOD = new ItemSod("wood_sod", ToolMaterial.WOOD);
	public static final Item STONE_SOD = new ItemSod("stone_sod", ToolMaterial.STONE);
	public static final Item IRON_SOD = new ItemSod("iron_sod", ToolMaterial.IRON);
	public static final Item GOLD_SOD = new ItemSod("gold_sod", ToolMaterial.GOLD);
	public static final Item DIAMOND_SOD = new ItemSod("diamond_sod", ToolMaterial.DIAMOND);
}
