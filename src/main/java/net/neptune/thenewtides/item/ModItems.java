package net.neptune.thenewtides.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.neptune.thenewtides.thenewTides;
import net.minecraft.item.Item;

public class ModItems {

    public static final Item TITANIUM_IGNOT = registerItem("titanium_ignot",
            new Item(new FabricItemSettings().group(ModItemGroup.NEWTIDES)));

    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.NEWTIDES)));

    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings().group(ModItemGroup.NEWTIDES)));



    private static Item registerItem(String name, Item item){


        return Registry.register(Registry.ITEM, new Identifier(thenewTides.MOD_ID, name), item);
    }

    public static void registerModItems(){

        thenewTides.LOGGER.info("Registering Mod Items for " + thenewTides.MOD_ID);

    }


}
