package rz.mesabrook.wbtc.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import rz.mesabrook.wbtc.items.drinks.WBTC_Beverage;
import rz.mesabrook.wbtc.items.weapons.ItemSod;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Sod Materials
	public static final ToolMaterial SOD_WOOD = EnumHelper.addToolMaterial("wbtc_wood", 0, 30, 1.0F, -2.0F, 8);
	public static final ToolMaterial SOD_STONE = EnumHelper.addToolMaterial("wbtc_stone", 1, 66, 2.0F, -0.5F, 5);
	public static final ToolMaterial SOD_IRON = EnumHelper.addToolMaterial("wbtc_iron", 2, 125, 3.0F, -1.0F, 8);
	public static final ToolMaterial SOD_GOLD = EnumHelper.addToolMaterial("wbtc_gold", 0, 16, 1.0F, -2.0F, 11);
	public static final ToolMaterial SOD_DIAMOND = EnumHelper.addToolMaterial("wbtc_diamond", 3, 780, 4.0F, -0.5F, 5);
	
	// Sods
	public static final Item WOOD_SOD = new ItemSod("wood_sod", SOD_WOOD);
	public static final Item STONE_SOD = new ItemSod("stone_sod", SOD_STONE);
	public static final Item IRON_SOD = new ItemSod("iron_sod", SOD_IRON);
	public static final Item GOLD_SOD = new ItemSod("gold_sod", SOD_GOLD);
	public static final Item DIAMOND_SOD = new ItemSod("diamond_sod", SOD_DIAMOND);
}
