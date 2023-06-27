package top.alex3236.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import top.alex3236.TutorialMod;

public class ModBlocks {
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            ModItemGroup.CITRINE);

    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(2, 6)),
            ModItemGroup.CITRINE);

    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(2, 6)),
            ModItemGroup.CITRINE);

    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups) {
        ModItems.registerItem(name, new BlockItem(block, new FabricItemSettings()), itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.debug("Registering mod blocks for" + TutorialMod.MOD_ID);
    }
}
