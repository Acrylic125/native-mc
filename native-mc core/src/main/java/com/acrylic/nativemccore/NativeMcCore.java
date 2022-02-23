package com.acrylic.nativemccore;

import com.acrylic.nativemc1_18.NativeMCManagerImpl;
import org.bukkit.plugin.java.JavaPlugin;

public final class NativeMcCore extends JavaPlugin {

    @Override
    public void onEnable() {
        NativeMC.setNativeFactory(new NativeMCManagerImpl());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
