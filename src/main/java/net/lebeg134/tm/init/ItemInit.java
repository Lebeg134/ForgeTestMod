package net.lebeg134.tm.init;

import net.lebeg134.tm.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;


public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item TEST_ITEM = new ItemBase("test_item", CreativeTabs.MISC);

}
