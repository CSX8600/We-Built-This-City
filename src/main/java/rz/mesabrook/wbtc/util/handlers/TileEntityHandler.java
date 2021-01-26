package rz.mesabrook.wbtc.util.handlers;

import rz.mesabrook.wbtc.blocks.te.TileEntityWBTCBin;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityWBTCBin.class, "wbtc:trash_bin");
	}
}
