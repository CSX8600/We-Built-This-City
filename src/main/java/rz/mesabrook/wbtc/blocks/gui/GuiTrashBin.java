package rz.mesabrook.wbtc.blocks.gui;

import rz.mesabrook.wbtc.blocks.containers.ContainerWBTCBin;
import rz.mesabrook.wbtc.blocks.te.TileEntityWBTCBin;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiTrashBin extends GuiContainer
{
	private static final ResourceLocation GUI_BIN = new ResourceLocation("wbtc:textures/gui/trash_bin.png");
	private final InventoryPlayer playerInventory;
	private final TileEntityWBTCBin te;
	
	public GuiTrashBin(InventoryPlayer playerInv, TileEntityWBTCBin binInventory, EntityPlayer player)
	{
		super(new ContainerWBTCBin(playerInv, binInventory, player));
		this.playerInventory = playerInv;
		this.te = binInventory;
		
		this.xSize = 179;
		this.ySize = 256;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
		this.fontRenderer.drawString(this.te.getDisplayName().getUnformattedText(), 8, 6, 16086784);
		this.fontRenderer.drawString(this.playerInventory.getDisplayName().getUnformattedText(), 8, this.ySize - 92, 16086784);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(GUI_BIN);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
}
