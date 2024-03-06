package net.irisshaders.iris.mixin.shadows;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.irisshaders.iris.shadows.CullingDataCache;
import net.minecraft.client.renderer.LevelRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(LevelRenderer.class)
public class MixinLevelRenderer implements CullingDataCache {

	@Unique
	private ObjectArrayList savedRenderChunks = new ObjectArrayList(69696);


	@Shadow
	private double prevCamRotX;

	@Shadow
	private double prevCamRotY;

	@Unique
	private double savedLastCameraX;

	@Unique
	private double savedLastCameraY;

	@Unique
	private double savedLastCameraZ;

	@Unique
	private double savedLastCameraPitch;

	@Unique
	private double savedLastCameraYaw;

	@Override
	public void saveState() {
		swap();
	}

	@Override
	public void restoreState() {
		swap();
	}

	@Unique
	private void swap() {
	}
}
