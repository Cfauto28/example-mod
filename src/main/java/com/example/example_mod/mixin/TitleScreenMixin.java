package com.example.example_mod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.screen.TitleScreen;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {

	@Inject(method = "init", at = @At("TAIL"))
	private void exampleMod$onInit(CallbackInfo ci) {
	}
}
