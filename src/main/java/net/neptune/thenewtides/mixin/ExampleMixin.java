package net.neptune.thenewtides.mixin;

import net.neptune.thenewtides.mixin.ExampleMixin;
import net.minecraft.client.gui.screen.TitleScreen;
import net.neptune.thenewtides.thenewTides;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		thenewTides.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
