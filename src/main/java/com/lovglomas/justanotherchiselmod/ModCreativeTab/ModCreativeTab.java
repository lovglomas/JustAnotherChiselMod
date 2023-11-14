package com.lovglomas.justanotherchiselmod.ModCreativeTab;

import com.lovglomas.justanotherchiselmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab JACM_TAB = new CreativeModeTab("jacmtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHISEL.get());
        }
    };
}
