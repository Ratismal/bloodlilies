package com.ratismal.bloodlilies.item;

import com.ratismal.bloodlilies.client.helper.IconHelper;
import com.ratismal.bloodlilies.client.reference.ReferenceResources;
import com.ratismal.bloodlilies.creativetab.CreativeTabBL;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBL extends Item
{
    public ItemBL()
    {
        super();
        setCreativeTab(CreativeTabBL.INSTANCE);
    }

    @Override
    public Item setUnlocalizedName(String par1Str) {
        GameRegistry.registerItem(this, par1Str);
        return super.setUnlocalizedName(par1Str);
    }

    @Override
    public String getUnlocalizedNameInefficiently(ItemStack par1ItemStack) {
        return super.getUnlocalizedNameInefficiently(par1ItemStack).replaceAll("item\\.", "item." + ReferenceResources.PREFIX_MOD);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = IconHelper.forItem(par1IconRegister, this);
    }
}