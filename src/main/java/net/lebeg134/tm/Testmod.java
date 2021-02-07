package net.lebeg134.tm;

import net.lebeg134.tm.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Testmod.MODID, name = Testmod.NAME, version = Testmod.VERSION)
public class Testmod {
    public static final String MODID = "tm";
    public static final String NAME = "TestMod";
    public static final String VERSION = "0.0.1";

    public static final String CLIENT = "lebeg134.mods.tm.proxy.ClientProxy";
    public static final String SERVER = "lebeg134.mods.tm.proxy.CommonProxy";

    @Instance
    public static Testmod Instance;

    @SidedProxy(clientSide = Testmod.CLIENT, serverSide = Testmod.SERVER)
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}