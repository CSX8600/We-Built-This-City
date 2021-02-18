package rz.mesabrook.wbtc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import rz.mesabrook.wbtc.init.ModBlocks;
import rz.mesabrook.wbtc.init.ModItems;
import rz.mesabrook.wbtc.proxy.CommonProxy;
import rz.mesabrook.wbtc.tab.WBTCTab;
import rz.mesabrook.wbtc.tab.WBTCTabCeiling;
import rz.mesabrook.wbtc.tab.WBTCTrophyTab;
import rz.mesabrook.wbtc.util.Reference;
import rz.mesabrook.wbtc.util.TooltipRandomizer;
import rz.mesabrook.wbtc.util.handlers.RegistryHandler;

import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main
{
	
	@Instance
	public static Main instance;
    
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static CommonProxy proxy;
    
    public static Logger logger;
    public static boolean IE_LOADED = false;
    public static boolean JABCM_LOADED = false;
    
    // Creative Tabs
    public static final CreativeTabs WBTC_TAB = new WBTCTab("wbtc_tab");
    public static final CreativeTabs WBTC_TAB_CEILING = new WBTCTabCeiling("wbtc_tab_ceiling");
    public static final CreativeTabs WBTC_TAB_TROPHY = new WBTCTrophyTab("wbtc_tab_trophy");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        IE_LOADED = Loader.isModLoaded("immersiveengineering");
        JABCM_LOADED = Loader.isModLoaded("jabcm");
        RegistryHandler.preInitRegistries(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("[We Built This City] Version " + Reference.VERSION + " loaded.");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	NonNullList<ItemStack> ironStick = OreDictionary.getOres("stickIron");
    	NonNullList<ItemStack> aluminumStick = OreDictionary.getOres("stickAluminum");
    	NonNullList<ItemStack> aluminumIngot = OreDictionary.getOres("ingotAluminum");
    	NonNullList<ItemStack> aluminumNug = OreDictionary.getOres("nuggetAluminum");
    	NonNullList<ItemStack> aluminumBlock = OreDictionary.getOres("blockAluminum");
    	NonNullList<ItemStack> aluminumOre = OreDictionary.getOres("oreAluminum");
    	NonNullList<ItemStack> aluminumDust = OreDictionary.getOres("dustAluminum");
    	
    	logger.info("Checking to ensure our items are in the OD " + ironStick + aluminumStick + aluminumIngot + aluminumNug + aluminumBlock + aluminumOre + aluminumDust);
		TooltipRandomizer.ChosenTooltip();
		
		GameRegistry.addSmelting(ModBlocks.ALUMINUM_ORE, new ItemStack(ModItems.ALUMINUM_INGOT), 69);
		Main.logger.info("Aluminum Ore Smelting Recipe Registered.");
    }
    
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
}
