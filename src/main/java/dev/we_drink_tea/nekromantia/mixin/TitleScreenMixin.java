package dev.we_drink_tea.nekromantia.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import dev.we_drink_tea.nekromantia.Nekromantia;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void nekromantia$onInit(CallbackInfo ci) {
		Nekromantia.INSTANCE.getLOGGER().info("This line is printed by an example mod mixin!");
	}
}
