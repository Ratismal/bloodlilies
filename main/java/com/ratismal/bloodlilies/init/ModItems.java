package com.ratismal.bloodlilies.init;

import com.ratismal.bloodlilies.item.*;
import com.ratismal.bloodlilies.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class ModItems
{
    public static Item inertRing;
    public static Item bloodSoakedRing;
    public static Item bloodInfusedRing;
    public static Item bloodSoakedPetal;

    public static void init()
    {
        inertRing = new ItemInertRing();
        bloodSoakedRing = new ItemBloodSoakedRing();
        bloodInfusedRing = new ItemBloodInfusedRing();
        bloodSoakedPetal = new ItemBloodSoakedPetal();
    }

}
