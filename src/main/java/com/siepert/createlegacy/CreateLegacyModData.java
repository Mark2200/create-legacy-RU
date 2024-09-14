package com.siepert.createlegacy;

import com.siepert.createlegacy.mainRegistry.ModBlocks;
import com.siepert.createlegacy.util.TimedLucky;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Some basic variables.
 *
 * @author Siepert123
 * */
public final class CreateLegacyModData {
    public static final String MOD_ID = "create"; //Mod ID; will never change
    public static final String NAME = "Create Legacy"; //Mod name; will never change
    public static final String VERSION = "24w37a"; //The version, based on snapshot naming scheme
    public static final int VERSION_NUMBER = 8;
    public static final int KINETIC_VERSION = 3;
    public static final String CLIENT_PROXY = "com.siepert.createlegacy.proxy.ClientProxy"; //Client proxy class
    public static final String COMMON_PROXY = "com.siepert.createlegacy.proxy.CommonProxy"; //Common proxy class

    public static String WIP_TT = "[WIP - DO NOT USE]";

    public static String ITEM_OUTPUT_TAG = "RecipeOutput";

    public static Random random = new Random(System.currentTimeMillis());
    public static TimedLucky timedLucky = new TimedLucky();

    public static final List<Block> WRENCHABLES = new ArrayList<>();
    static {
        WRENCHABLES.add(ModBlocks.BLAZE_BURNER);
        WRENCHABLES.add(ModBlocks.AXLE);
        WRENCHABLES.add(ModBlocks.CASING_BLOCK);
        WRENCHABLES.add(ModBlocks.COGWHEEL);
        WRENCHABLES.add(ModBlocks.SAW);
        WRENCHABLES.add(ModBlocks.DEPLOYER);
        WRENCHABLES.add(ModBlocks.PRESS);
        WRENCHABLES.add(ModBlocks.DRILL);
        WRENCHABLES.add(ModBlocks.BELT);
        WRENCHABLES.add(ModBlocks.NETWORK_INSPECTOR);
        WRENCHABLES.add(ModBlocks.CHUTE);
        WRENCHABLES.add(ModBlocks.FURNACE_ENGINE);
        WRENCHABLES.add(ModBlocks.CREATIVE_MOTOR);
        WRENCHABLES.add(ModBlocks.CHASSIS);
        WRENCHABLES.add(ModBlocks.HAND_CRANK);
        WRENCHABLES.add(ModBlocks.KINETIC_UTILITY);
        WRENCHABLES.add(ModBlocks.WATER_WHEEL);
        WRENCHABLES.add(ModBlocks.ITEM_HOLDER);
        WRENCHABLES.add(ModBlocks.FAN);
        WRENCHABLES.add(ModBlocks.MILLSTONE);
        WRENCHABLES.add(ModBlocks.FUNNEL);
        WRENCHABLES.add(Blocks.LEVER);
        WRENCHABLES.add(Blocks.PISTON);
        WRENCHABLES.add(Blocks.STICKY_PISTON);
        WRENCHABLES.add(Blocks.DISPENSER);
        WRENCHABLES.add(Blocks.DROPPER);
        WRENCHABLES.add(Blocks.POWERED_REPEATER);
        WRENCHABLES.add(Blocks.UNPOWERED_REPEATER);
        WRENCHABLES.add(Blocks.POWERED_COMPARATOR);
        WRENCHABLES.add(Blocks.UNPOWERED_COMPARATOR);
        WRENCHABLES.add(Blocks.REDSTONE_WIRE);
        WRENCHABLES.add(Blocks.REDSTONE_LAMP);
        WRENCHABLES.add(Blocks.LIT_REDSTONE_LAMP);
        WRENCHABLES.add(Blocks.HOPPER);
        WRENCHABLES.add(Blocks.RAIL);
        WRENCHABLES.add(Blocks.ACTIVATOR_RAIL);
        WRENCHABLES.add(Blocks.DETECTOR_RAIL);
        WRENCHABLES.add(Blocks.GOLDEN_RAIL);
        WRENCHABLES.add(Blocks.OBSERVER);
    }
}
