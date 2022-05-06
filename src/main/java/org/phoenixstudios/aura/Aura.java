package org.phoenixstudios.aura;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Aura implements ClientModInitializer {

    private static Aura INSTANCE;

    @Override
    public void onInitializeClient() {
        if(INSTANCE == null)
            INSTANCE = this;
    }

    public static Aura get() {
        return INSTANCE;
    }
}
