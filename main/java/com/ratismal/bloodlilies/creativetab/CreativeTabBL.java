package com.ratismal.bloodlilies.creativetab;

import com.ratismal.bloodlilies.client.reference.ReferenceResources;
import com.ratismal.bloodlilies.init.ModItems;
import com.ratismal.bloodlilies.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import vazkii.botania.client.lib.LibResources;

public final class CreativeTabBL extends CreativeTabs {

    public static CreativeTabBL INSTANCE = new CreativeTabBL();
    List list;

    public CreativeTabBL() {
        super(Reference.MOD_NAME);
        setNoTitle();
        setBackgroundImageName(ReferenceResources.GUI_CREATIVE);
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(ModItems.bloodInfusedRing);
    }

    @Override
    public Item getTabIconItem() {
        return getIconItemStack().getItem();
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public void displayAllReleventItems(List list) {
        this.list = list;

        addItem(ModItems.bloodInfusedRing);
        addItem(ModItems.bloodSoakedRing);
        addItem(ModItems.inertRing);
        addItem(ModItems.bloodSoakedPetal);
    }

    private void addItem(Item item) {
        item.getSubItems(item, this, list);
    }

    private void addBlock(Block block) {
        ItemStack stack = new ItemStack(block);
        block.getSubBlocks(stack.getItem(), this, list);
    }

}