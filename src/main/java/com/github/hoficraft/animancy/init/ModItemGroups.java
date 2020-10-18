package com.github.hoficraft.animancy.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import com.github.hoficraft.animancy.Animancy;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class ModItemGroups {

	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Animancy.MODID, () -> new ItemStack(ModItems.ONYX.get()));

	public static final class ModItemGroup extends ItemGroup {

		@Nonnull
		private final Supplier<ItemStack> iconSupplier;

		public ModItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}

		@Override
		@Nonnull
		public ItemStack createIcon() {
			return iconSupplier.get();
		}

	}
}
