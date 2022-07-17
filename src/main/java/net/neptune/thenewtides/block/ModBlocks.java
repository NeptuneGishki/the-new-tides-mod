package net.neptune.thenewtides.block;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.neptune.thenewtides.item.ModItemGroup;
import net.neptune.thenewtides.thenewTides;

public class ModBlocks {

    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),ModItemGroup.NEWTIDES);

    public static final Block SAKURA_PLANKS = registerBlock("sakura_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool()),ModItemGroup.NEWTIDES);

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()),ModItemGroup.NEWTIDES);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(thenewTides.MOD_ID,name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup  group){
        return Registry.register(Registry.ITEM , new Identifier(thenewTides.MOD_ID, name),
                new BlockItem(block , new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        thenewTides.LOGGER.info("Registering ModBlocks for" + thenewTides.MOD_ID);

    }


}
