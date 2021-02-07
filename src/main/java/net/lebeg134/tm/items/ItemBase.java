package net.lebeg134.tm.items;

import net.lebeg134.tm.Testmod;
import net.lebeg134.tm.init.ItemInit;
import net.lebeg134.tm.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name, CreativeTabs tab)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Testmod.proxy.registerModel(this, 0);
    }
}
