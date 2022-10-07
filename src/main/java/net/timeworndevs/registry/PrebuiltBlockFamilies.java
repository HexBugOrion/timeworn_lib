package net.timeworndevs.registry;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;

public class PrebuiltBlockFamilies {

    public static void woodFamily(String modId, String woodSetName){
        BlockRegistryFamilyHelper.registerBuildingBlock(new Identifier(modId, woodSetName + "_log"), new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerBuildingBlock(new Identifier(modId, woodSetName + "_stripped_log"), new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerBuildingBlock(new Identifier(modId, woodSetName + "_wood"), new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerBuildingBlock(new Identifier(modId, woodSetName + "_stripped_wood"), new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerBuildingBlock(new Identifier(modId, woodSetName + "_slab"), new SlabBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerBuildingBlock(new Identifier(modId, woodSetName + "_stairs"), new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerDecorBlock(new Identifier(modId, woodSetName + "_fence"), new FenceBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerRedstone(new Identifier(modId, woodSetName + "_fence_gate"), new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerGlassDecor(new Identifier(modId, woodSetName + "_leaves"), new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).sounds(BlockSoundGroup.GRASS).nonOpaque()));
        BlockRegistryFamilyHelper.registerRedstone(new Identifier(modId, woodSetName + "_pressure_plate"), new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.of(Material.WOOD).strength(0.5f).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerRedstone(new Identifier(modId, woodSetName + "_button"), new WoodenButtonBlock(AbstractBlock.Settings.of(Material.WOOD).strength(0.5f).sounds(BlockSoundGroup.WOOD)));
        BlockRegistryFamilyHelper.registerRedstone(new Identifier(modId, woodSetName + "_door"), new DoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));
        BlockRegistryFamilyHelper.registerRedstone(new Identifier(modId, woodSetName + "_trapdoor"), new TrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque()));
        BlockRegistryFamilyHelper.registerBuildingBlock(new Identifier(modId, woodSetName + "_sign"), new SignBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD), SignType.OAK));
    }

    //todo slog through stone sets >:|
    //public static void stoneFamily(String modId, String stoneSetName){

    //}
}
