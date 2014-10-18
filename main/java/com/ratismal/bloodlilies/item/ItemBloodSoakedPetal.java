package com.ratismal.bloodlilies.item;

import com.ratismal.bloodlilies.reference.ReferenceItemNames;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import vazkii.botania.api.recipe.IFlowerComponent;
import com.ratismal.bloodlilies.item.Item16Colors;

public class ItemBloodSoakedPetal extends Item16Colors implements IFlowerComponent
{
    public ItemBloodSoakedPetal()
    {
        super(ReferenceItemNames.BLOOD_SOAKED_PETAL);
    }

    @Override
    public boolean canFit(ItemStack stack, IInventory apothecary) {
        return true;
    }

    @Override
    public int getParticleColor(ItemStack stack) {
        return getColorFromItemStack(stack, 0);
    }


}
