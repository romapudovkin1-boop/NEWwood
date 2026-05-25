/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tititi.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tititi.TiMod;

public class TiModSounds {
	public static SoundEvent BREAKNEW;

	public static void load() {
		BREAKNEW = register("breaknew", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("ti", "breaknew")));
	}

	private static SoundEvent register(String registryname, SoundEvent element) {
		return Registry.register(BuiltInRegistries.SOUND_EVENT, ResourceLocation.fromNamespaceAndPath(TiMod.MODID, registryname), element);
	}
}