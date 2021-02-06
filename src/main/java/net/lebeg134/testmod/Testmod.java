package net.lebeg134.testmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.Instance;
import org.apache.logging.log4j.Logger;

@Mod(modid = Testmod.MODID, name = Testmod.NAME, version = Testmod.VERSION)
public class Testmod {
    public static final String MODID = "testmod";
    public static final String NAME = "TestMod";
    public static final String VERSION = "0.0.1";

    @Instance
    public static Testmod Instance;




    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
