package net.neptune.thenewtides.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.neptune.thenewtides.block.ModBlocks;
import net.neptune.thenewtides.thenewTides;

public class ModItemGroup {

    public static final ItemGroup NEWTIDES = FabricItemGroupBuilder.build(new Identifier(thenewTides.MOD_ID, "newtides"),
            () -> new ItemStack(ModItems.TITANIUM_IGNOT));
}
