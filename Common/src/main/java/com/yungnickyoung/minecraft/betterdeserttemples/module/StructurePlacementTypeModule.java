package com.yungnickyoung.minecraft.betterdeserttemples.module;

import com.yungnickyoung.minecraft.betterdeserttemples.BetterDesertTemplesCommon;
import com.yungnickyoung.minecraft.betterdeserttemples.world.placement.BetterDesertTemplePlacement;
import com.yungnickyoung.minecraft.yungsapi.api.autoregister.AutoRegister;
import com.yungnickyoung.minecraft.yungsapi.api.autoregister.AutoRegisterStructurePlacementType;

@AutoRegister(BetterDesertTemplesCommon.MOD_ID)
public class StructurePlacementTypeModule {
    @AutoRegister("desert_temple")
    public static final AutoRegisterStructurePlacementType BETTER_DESERT_TEMPLE_PLACEMENT = AutoRegisterStructurePlacementType.of(BetterDesertTemplePlacement.CODEC);
}
