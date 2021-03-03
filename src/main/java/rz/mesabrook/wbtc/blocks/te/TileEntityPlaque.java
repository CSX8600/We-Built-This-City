package rz.mesabrook.wbtc.blocks.te;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPlaque extends TileEntity {
	private String plaqueId;
	private String awardedTo;
	
	public TileEntityPlaque()
	{
		super();
	}
	
	public TileEntityPlaque(String plaqueId)
	{
		super();
		this.plaqueId = plaqueId;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		plaqueId = compound.getString("plaqueId");
		awardedTo = compound.getString("awardedTo");
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setString("plaqueId", plaqueId);
		compound.setString("awardedTo", awardedTo);
		return super.writeToNBT(compound);
	}

	public String getAwardedTo() {
		return awardedTo;
	}

	public void setAwardedTo(String awardedTo) {
		this.awardedTo = awardedTo;
		markDirty();
	}

	@Override
	public NBTTagCompound getUpdateTag() {
		NBTTagCompound tag = super.getUpdateTag();
		tag.setString("awardedTo", getAwardedTo());
		return tag;
	}
	
	@Override
	public void handleUpdateTag(NBTTagCompound tag) {
		super.handleUpdateTag(tag);
		
		this.awardedTo = tag.getString("awardedTo");
	}
	
	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString("awardedTo", getAwardedTo());
		return new SPacketUpdateTileEntity(getPos(), 0, tag);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		this.awardedTo = pkt.getNbtCompound().getString("awardedTo");
		super.onDataPacket(net, pkt);
	}
}
