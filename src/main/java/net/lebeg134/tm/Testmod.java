package net.lebeg134.tm;

import net.lebeg134.tm.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Testmod.MODID, name = Testmod.NAME, version = Testmod.VERSION)
public class Testmod {
    public static final String MODID = "tm";
    public static final String NAME = "TestMod";
    public static final String VERSION = "0.0.1";

    public static final String CLIENT = "net.lebeg134.tm.proxy.ClientProxy";
    public static final String SERVER = "net.lebeg134.tm.proxy.CommonProxy";

    @Mod.Instance(MODID)
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

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
