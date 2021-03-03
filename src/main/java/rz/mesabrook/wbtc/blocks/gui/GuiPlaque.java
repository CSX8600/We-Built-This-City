package rz.mesabrook.wbtc.blocks.gui;

import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.client.config.GuiButtonExt;
import rz.mesabrook.wbtc.net.EngravePacket;
import rz.mesabrook.wbtc.util.handlers.PacketHandler;

public class GuiPlaque extends GuiScreen {
	
	GuiTextField awardedToBox;
	GuiButtonExt engrave;
	private EnumHand hand;
	public GuiPlaque(EnumHand hand)
	{
		this.hand = hand;
	}
	
	@Override
	public void initGui() {
		int horizontalCenter = width / 2;
		int verticalCenter = height / 2;
		
		awardedToBox = new GuiTextField(1, fontRenderer, horizontalCenter - 100, verticalCenter - 10, 200, 20);
		awardedToBox.setFocused(true);
		engrave = new GuiButtonExt(1, awardedToBox.x, awardedToBox.y + 24, awardedToBox.width, 20, "Engrave");
		
		buttonList.add(engrave);
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		drawDefaultBackground();
		
		awardedToBox.drawTextBox();
		int stringWidth = fontRenderer.getStringWidth("Awarded To:");
		fontRenderer.drawString("Awarded To:", awardedToBox.x - stringWidth - 4, awardedToBox.y + ((awardedToBox.height - fontRenderer.FONT_HEIGHT) / 2), 0xFFFFFF);
		
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		awardedToBox.mouseClicked(mouseX, mouseY, mouseButton);
		super.mouseClicked(mouseX, mouseY, mouseButton);
	}
	
	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException {
		awardedToBox.textboxKeyTyped(typedChar, keyCode);
		super.keyTyped(typedChar, keyCode);
	}
	
	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if (button == engrave && awardedToBox.getText() != null && !awardedToBox.getText().equals(""))
		{
			EngravePacket packet = new EngravePacket();
			packet.awardedTo = awardedToBox.getText();
			packet.hand = hand;
			PacketHandler.INSTANCE.sendToServer(packet);
			
			Minecraft.getMinecraft().displayGuiScreen(null);
		}
	}
}
