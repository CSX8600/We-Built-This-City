package rz.mesabrook.wbtc.blocks.te;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class TileEntityPlaqueRenderer extends TileEntitySpecialRenderer<TileEntityPlaque>{
	@Override
	public void render(TileEntityPlaque te, double x, double y, double z, float partialTicks, int destroyStage,
			float alpha) {
		super.render(te, x, y, z, partialTicks, destroyStage, alpha);
		
		if (te.getAwardedTo() != null)
		{
			GlStateManager.pushMatrix();
			
			GlStateManager.translate(x, y, z);
			GlStateManager.translate(0.5, 0.5, 0.5);
			GlStateManager.translate(0.3125, -0.125, 0.40625);
			GlStateManager.scale(-1, -1, 1);
			FontRenderer fontRenderer = getFontRenderer();
			int stringWidth = fontRenderer.getStringWidth(te.getAwardedTo());
			if (stringWidth > 78)
			{
				GlStateManager.scale(1 / (stringWidth * (1 / 78.0)), 1, 1);
				stringWidth = 78;
			}
			GlStateManager.scale(1/128.0, 1/128.0, 1/128.0);
			GlStateManager.translate(-(stringWidth - 78) / 2, 0, 0);
			fontRenderer.drawString(te.getAwardedTo(), 0, 0, 0xFFFFFF);
			
			GlStateManager.popMatrix();
		}
	}
}
