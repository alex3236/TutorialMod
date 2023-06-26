package top.alex3236.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import top.alex3236.TutorialMod;

public class ModItemGroup {
    public static ItemGroup CITRINE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "citrine"))
            .displayName(Text.translatable("itemgroup.tutorial-mod.citrine"))
            .icon(() -> new ItemStack(ModItems.CITRINE))
            .build();
    public static void registerModItemGroup() {
        TutorialMod.LOGGER.debug("Registering mod item group for " + TutorialMod.MOD_ID);
    }
}
