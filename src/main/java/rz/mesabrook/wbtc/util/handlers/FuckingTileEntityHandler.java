package rz.mesabrook.wbtc.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rz.mesabrook.wbtc.blocks.te.TileEntityTrashBin;
import rz.mesabrook.wbtc.util.Reference;

public class FuckingTileEntityHandler 
{
	public static void registerTileEntites()
	{
		GameRegistry.registerTileEntity(TileEntityTrashBin.class, new ResourceLocation(Reference.MODID + ":trash_bin"));
	}
}
