package common;

import static gregtech.api.enums.Mods.ThaumicTinkerer;

import java.util.HashMap;

import net.minecraft.item.ItemStack;

import common.recipeLoaders.AlloySmelter;
import common.recipeLoaders.Assembler;
import common.recipeLoaders.AssemblyLine;
import common.recipeLoaders.ChemicalReactor;
import common.recipeLoaders.Crafting;
import common.recipeLoaders.FormingPress;
import common.recipeLoaders.Mixer;
import common.recipeLoaders.ResearchableAssemblyLine;
import common.recipeLoaders.Unpackager;

import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import kekztech.KekzCore;

public class Recipes {

    public static void postInit() {
        KekzCore.LOGGER.info("Registering recipes...");

        new AlloySmelter().run();
        new Assembler().run();
        new AssemblyLine().run();
        new ChemicalReactor().run();
        new Crafting().run();
        new FormingPress().run();
        new Mixer().run();
        new ResearchableAssemblyLine().run();
        new Unpackager().run();

        KekzCore.LOGGER.info("Finished registering recipes");
    }

}
