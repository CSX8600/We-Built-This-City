package rz.mesabrook.wbtc.init;

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
	public static final SoundEvent OWO_SFX;
	
	static
	{
		OWO_SFX = addSoundsToRegistry("owo");
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
			event.getRegistry().registerAll(SoundInit.OWO_SFX);
			MinecraftForge.EVENT_BUS.register(new SoundRegisterListener());
		}
	}
}
