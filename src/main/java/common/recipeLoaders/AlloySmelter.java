package common.recipeLoaders;

import gregtech.api.enums.TierEU;
import kekztech.Items;

import common.items.MetaItem_CraftingComponent;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.util.GT_Recipe.GT_Recipe_Map.sAlloySmelterRecipes;
import static gregtech.api.util.GT_RecipeBuilder.SECONDS;

public class AlloySmelter implements Runnable {

    @Override
    public void run() {
        if (BartWorks.isModLoaded()) {
            final MetaItem_CraftingComponent craftingItem = MetaItem_CraftingComponent.getInstance();

            // YSZ Cermic Plate
            GT_Values.RA.stdBuilder()
                .itemInputs(
                    craftingItem.getStackOfAmountFromDamage(Items.YSZCeramicDust.getMetaID(),3),
                    ItemList.Shape_Mold_Plate.get(0)
                )
                .itemOutputs(craftingItem.getStackOfAmountFromDamage(Items.YSZCeramicPlate.getMetaID(), 1))
                .noFluidInputs()
                .noFluidOutputs()
                .duration(20*SECONDS)
                .eut(TierEU.RECIPE_HV)
                .addTo(sAlloySmelterRecipes);
        }
    }
}