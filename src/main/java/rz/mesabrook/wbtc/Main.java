package rz.mesabrook.wbtc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rz.mesabrook.wbtc.proxy.CommonProxy;
import rz.mesabrook.wbtc.tab.WBTCTab;

import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
	
	@Instance
	public static Main instance;
	
    public static final String MODID = "wbtc";
    public static final String NAME = "We Built This City";
    public static final String VERSION = "0.0.2";
    public static final String CLIENT_PROXY = "rz.mesabrook.wbtc.proxy.ClientProxy";
    public static final String COMMON_PROXY = "rz.mesabrook.wbtc.proxy.CommonProxy";
    
    @SidedProxy(clientSide = Main.CLIENT_PROXY, serverSide = Main.COMMON_PROXY)
    public static CommonProxy proxy;
    
    private static Logger logger;
    
    // Creative Tab
    public static final CreativeTabs WBTC_TAB = new WBTCTab("wbtc_tab");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("[We Built This City] Version " + Main.VERSION + " loaded.");
    }
}
