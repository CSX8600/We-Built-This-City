package rz.mesabrook.wbtc.util.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rz.mesabrook.wbtc.Main;
import rz.mesabrook.wbtc.init.ModBlocks;
import rz.mesabrook.wbtc.init.ModItems;

public class SmeltingRecipes 
{
	public static void registerSmeltingRecipes()
	{
		// Aluminum Ore
		GameRegistry.addSmelting(ModBlocks.ALUMINUM_ORE, new ItemStack(ModItems.ALUMINUM_INGOT), 69);
		
		// Plastic Ingots
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_WHITE, new ItemStack(ModItems.PLASTIC_WHITE), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_ORANGE, new ItemStack(ModItems.PLASTIC_ORANGE), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_MAGENTA, new ItemStack(ModItems.PLASTIC_MAGENTA), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_LBLUE, new ItemStack(ModItems.PLASTIC_LBLUE), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_YELLOW, new ItemStack(ModItems.PLASTIC_YELLOW), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_LIME, new ItemStack(ModItems.PLASTIC_LIME), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_PINK, new ItemStack(ModItems.PLASTIC_PINK), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_GRAY, new ItemStack(ModItems.PLASTIC_GRAY), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_SILVER, new ItemStack(ModItems.PLASTIC_SILVER), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_CYAN, new ItemStack(ModItems.PLASTIC_CYAN), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_PURPLE, new ItemStack(ModItems.PLASTIC_PURPLE), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_BLUE, new ItemStack(ModItems.PLASTIC_BLUE), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_BROWN, new ItemStack(ModItems.PLASTIC_BROWN), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_RED, new ItemStack(ModItems.PLASTIC_RED), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_GREEN, new ItemStack(ModItems.PLASTIC_GREEN), 10);
		GameRegistry.addSmelting(ModItems.RAW_PLASTIC_BLACK, new ItemStack(ModItems.PLASTIC_BLACK), 10);
		
		Main.logger.info("Smelting Recipes Registered.");
	}
}
