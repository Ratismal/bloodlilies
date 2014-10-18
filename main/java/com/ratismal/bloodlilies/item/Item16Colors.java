package com.ratismal.bloodlilies.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.awt.Color;
import java.util.List;

public class Item16Colors extends ItemBL
{

    public Item16Colors(String name) {
        super();
        setHasSubtypes(true);
        setUnlocalizedName(name);
    }

    @Override
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        if(par1ItemStack.getItemDamage() >= EntitySheep.fleeceColorTable.length)
            return 0xFFFFFF;

        float[] color = EntitySheep.fleeceColorTable[par1ItemStack.getItemDamage()];
        return new Color(color[0], color[1], color[2]).getRGB();
    }

    @Override
    public void getSubItems(Item item, CreativeTabs par2CreativeTabs, List par3List) {
        for(int i = 0; i < 16; i++)
            par3List.add(new ItemStack(item, 1, i));
    }

    @Override
    public String getUnlocalizedName(ItemStack par1ItemStack) {
        return getUnlocalizedNameLazy(par1ItemStack) + par1ItemStack.getItemDamage();
    }

    String getUnlocalizedNameLazy(ItemStack par1ItemStack) {
        return super.getUnlocalizedName(par1ItemStack);
    }

}