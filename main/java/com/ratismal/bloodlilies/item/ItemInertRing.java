package com.ratismal.bloodlilies.item;

import com.ratismal.bloodlilies.reference.ReferenceItemNames;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;


public class ItemInertRing extends ItemBL
{
    public ItemInertRing()
    {
        setUnlocalizedName(ReferenceItemNames.INERT_RING);
    }
}
