/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tititi.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class TiModTabs {
	public static void load() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(tabData -> {
			tabData.accept(TiModBlocks.YELLOW_WOODED.asItem());
		});
	}
}