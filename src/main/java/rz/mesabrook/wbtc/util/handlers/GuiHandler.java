package rz.mesabrook.wbtc.util.handlers;

import rz.mesabrook.wbtc.util.Reference;
import rz.mesabrook.wbtc.blocks.containers.ContainerWBTCBin;
import rz.mesabrook.wbtc.blocks.gui.GuiTrashBin;
import rz.mesabrook.wbtc.blocks.te.TileEntityWBTCBin;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_TRASHBIN) return new ContainerWBTCBin(player.inventory, (TileEntityWBTCBin)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_TRASHBIN) return new GuiTrashBin(player.inventory, (TileEntityWBTCBin)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
}
