package rz.mesabrook.wbtc.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
import rz.mesabrook.wbtc.cmds.CommandTeleportDimension;
import rz.mesabrook.wbtc.init.ModBlocks;
import rz.mesabrook.wbtc.init.ModItems;
import rz.mesabrook.wbtc.util.IHasModel;
import rz.mesabrook.wbtc.util.TooltipRandomizer;

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
		
		System.out.println(ModItems.IRON_ROD.getUnlocalizedName() + " has been added to the Ore Dictionary under stickIron");
		System.out.println(ModItems.ALUMINUM_ROD.getUnlocalizedName() + " has been added to the Ore Dictionary under stickAluminum");
		System.out.println(ModItems.ALUMINUM_INGOT.getUnlocalizedName() + " has been added to the Ore Dictionary under ingotAluminum");
		System.out.println(ModItems.ALUMINUM_NUGGET.getUnlocalizedName() + " has been added to the Ore Dictionary under nuggetAluminum");
		System.out.println(ModBlocks.CUBE_ALUMINUM.getUnlocalizedName() + " has been added to the Ore Dictionary under blockAluminum");
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		//TileEntityHandler.registerTileEntities();
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
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandTeleportDimension());
	}
}
