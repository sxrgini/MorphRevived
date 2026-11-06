package com.iiampanda.morph.api;

public final class AddonApi
{
    public static volatile boolean keysDisabled = false;
    public static volatile String resourceNameKey = "morph.hud.biomass";
    public static volatile String resourceAmountKey = "morph.gui.biomass.amount";
    public static volatile int barFill = 0xFFB03A2E;
    public static volatile int barBack = 0xFF2A1A1A;
    public static volatile int barLabel = 0xFFFFCCCC;
    public static volatile String costUnit = "BM";

    private AddonApi()
    {
    }

    public static void reset()
    {
        keysDisabled = false;
        resourceNameKey = "morph.hud.biomass";
        resourceAmountKey = "morph.gui.biomass.amount";
        barFill = 0xFFB03A2E;
        barBack = 0xFF2A1A1A;
        barLabel = 0xFFFFCCCC;
        costUnit = "BM";
    }
}
