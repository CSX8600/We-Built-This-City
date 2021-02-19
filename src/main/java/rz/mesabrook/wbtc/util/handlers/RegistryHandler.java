package rz.mesabrook.wbtc.util.handlers;

import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import rz.mesabrook.wbtc.Main;
import rz.mesabrook.wbtc.cmds.CommandTeleportDimension;
import rz.mesabrook.wbtc.init.ModBlocks;
import rz.mesabrook.wbtc.init.ModItems;
import rz.mesabrook.wbtc.util.IHasModel;
import rz.mesabrook.wbtc.util.TooltipRandomizer;
import rz.mesabrook.wbtc.world.generation.WorldGenWBTCOres;

@EventBusSubscriber
public class RegistryHandler 
{	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		OreDictionary.registerOre("stickIron", ModItems.IRON_ROD);
		OreDictionary.registerOre("stickAluminum", ModItems.ALUMINUM_ROD);
		OreDictionary.registerOre("ingotAluminum", ModItems.ALUMINUM_INGOT);
		OreDictionary.registerOre("nuggetAluminum", ModItems.ALUMINUM_NUGGET);
		OreDictionary.registerOre("blockAluminum", ModBlocks.CUBE_ALUMINUM);
		OreDictionary.registerOre("oreAluminum", ModBlocks.ALUMINUM_ORE);
		OreDictionary.registerOre("dustAluminum", ModItems.ALUMINUM_DUST);
		
		Main.logger.info(ModItems.IRON_ROD.getUnlocalizedName() + " has been added to the Ore Dictionary under stickIron");
		Main.logger.info(ModItems.ALUMINUM_ROD.getUnlocalizedName() + " has been added to the Ore Dictionary under stickAluminum");
		Main.logger.info(ModItems.ALUMINUM_INGOT.getUnlocalizedName() + " has been added to the Ore Dictionary under ingotAluminum");
		Main.logger.info(ModItems.ALUMINUM_NUGGET.getUnlocalizedName() + " has been added to the Ore Dictionary under nuggetAluminum");
		Main.logger.info(ModBlocks.CUBE_ALUMINUM.getUnlocalizedName() + " has been added to the Ore Dictionary under blockAluminum");
		Main.logger.info(ModBlocks.ALUMINUM_ORE.getUnlocalizedName() + " has been added to the Ore Dictionary under oreAluminum");
		Main.logger.info(ModItems.ALUMINUM_DUST.getUnlocalizedName() + " has been added to the Ore Dictionary under dustAluminum");
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		FuckingTileEntityHandler.registerTileEntites();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		if(!Main.IE_LOADED)
		{
			Main.logger.info("Immersive Engineering NOT detected. WBTC Aluminum Ore gen enabled.");
			GameRegistry.registerWorldGenerator(new WorldGenWBTCOres(), 0);
		}
		else 
		{
			Main.logger.warn("Immersive Engineering detected. WBTC Aluminum Ore gen disabled. Use IE's ore instead.");
		}
		
		if(!Main.JABCM_LOADED)
		{
			Main.logger.info("WBTC goes great with the Just A Basic Concrete Mod!");
			Main.logger.info("Download it today! https://bit.ly/3jHSloq");
		}
		else
		{
			Main.logger.info("Thank you for using JABCM!");
		}
	}
	
	public static void initRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandTeleportDimension());
	}
}
