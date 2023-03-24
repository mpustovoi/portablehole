package fuzs.portablehole.init;

import fuzs.portablehole.world.level.block.TemporaryHoleForgeBlock;
import fuzs.puzzleslib.api.init.v2.RegistryReference;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class ModRegistryForge {
    public static final RegistryReference<Block> TEMPORARY_HOLE_BLOCK = ModRegistry.REGISTRY.registerBlock("temporary_hole", () -> new TemporaryHoleForgeBlock(BlockBehaviour.Properties.of(Material.PORTAL, MaterialColor.COLOR_BLACK).noCollission().lightLevel((p_50854_) -> {
        return 15;
    }).strength(-1.0F, 3600000.0F).noLootTable()));

    public static void touch() {

    }
}
