package rz.mesabrook.wbtc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.oredict.OreDictionary;
import rz.mesabrook.wbtc.proxy.CommonProxy;
import rz.mesabrook.wbtc.tab.WBTCTab;
import rz.mesabrook.wbtc.tab.WBTCTabCeiling;
import rz.mesabrook.wbtc.util.Reference;
import rz.mesabrook.wbtc.util.handlers.RegistryHandler;
import rz.mesabrook.wbtc.util.handlers.TileEntityHandler;

import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main
{
	
	@Instance
	public static Main instance;
    
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static CommonProxy proxy;
    
    private static Logger logger;
    
    // Creative Tab
    public static final CreativeTabs WBTC_TAB = new WBTCTab("wbtc_tab");
    public static final CreativeTabs WBTC_TAB_CEILING = new WBTCTabCeiling("wbtc_tab_ceiling");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("[We Built This City] Version " + Reference.VERSION + " loaded.");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	NonNullList<ItemStack> listOfOres = OreDictionary.getOres("stickIron");
    	logger.info("Checking to ensure our items are in the OD " + listOfOres);
    }
    
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
}
