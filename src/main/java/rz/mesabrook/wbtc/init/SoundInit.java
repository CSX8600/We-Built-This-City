package rz.mesabrook.wbtc.init;

import org.apache.logging.log4j.Logger;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import rz.mesabrook.wbtc.util.Reference;

public class SoundInit 
{
	private static Logger logger;
	
	public static final SoundEvent OWO_SFX;
	public static final SoundEvent RZ_TROPHY;
	public static final SoundEvent CSX_TROPHY;
	public static final SoundEvent TD_TROPHY;
	public static final SoundEvent TLZ_TROPHY;
	public static final SoundEvent LW_TROPHY;
	public static final SoundEvent MD_TROPHY;
	public static final SoundEvent SVV_TROPHY;
	public static final SoundEvent TROPHY_BREAK;
	public static final SoundEvent OOF;
	
	static
	{
		OWO_SFX = addSoundsToRegistry("owo");
		RZ_TROPHY = addSoundsToRegistry("rz_trophy");
		CSX_TROPHY = addSoundsToRegistry("csx_trophy");
		TD_TROPHY = addSoundsToRegistry("td_trophy");
		TLZ_TROPHY = addSoundsToRegistry("tlz_trophy");
		LW_TROPHY = addSoundsToRegistry("lw_trophy");
		MD_TROPHY = addSoundsToRegistry("md_trophy");
		SVV_TROPHY = addSoundsToRegistry("svv_trophy");
		TROPHY_BREAK = addSoundsToRegistry("trophy_break");
		OOF = addSoundsToRegistry("oof");
	}
	
	private static SoundEvent addSoundsToRegistry(String soundId)
	{
		ResourceLocation shotSoundLocation = new ResourceLocation(Reference.MODID, soundId);
		SoundEvent soundEvent = new SoundEvent(shotSoundLocation);
		soundEvent.setRegistryName(shotSoundLocation);
		return soundEvent;
	}
	
	public class SoundRegisterListener
	{
		@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
		public void registerSoundEvents(RegistryEvent.Register<SoundEvent> event)
		{
			try
			{
				event.getRegistry().registerAll(SoundInit.OWO_SFX);
				event.getRegistry().registerAll(SoundInit.RZ_TROPHY);
				event.getRegistry().registerAll(SoundInit.CSX_TROPHY);
				event.getRegistry().registerAll(SoundInit.TD_TROPHY);
				event.getRegistry().registerAll(SoundInit.TLZ_TROPHY);
				event.getRegistry().registerAll(SoundInit.LW_TROPHY);
				event.getRegistry().registerAll(SoundInit.MD_TROPHY);
				event.getRegistry().registerAll(SoundInit.SVV_TROPHY);
				event.getRegistry().registerAll(SoundInit.TROPHY_BREAK);
				event.getRegistry().registerAll(SoundInit.OOF);
				
				MinecraftForge.EVENT_BUS.register(new SoundRegisterListener());
			}
			catch(Exception ex)
			{
				logger.error("[WBTC SoundLoader] ERROR: " + ex);
			}
		}
	}
}
