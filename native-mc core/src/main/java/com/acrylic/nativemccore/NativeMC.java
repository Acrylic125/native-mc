package com.acrylic.nativemccore;

import com.acrylic.nativemcuniversal.NativeMCManager;
import com.acrylic.nativemcuniversal.factory.EntityFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Uses a NativeMCManager singleton to reference to the {@link NativeMCManager} class.
 *
 * The NativeMCManager instance is generated upon launch and is based on the
 * server version.
 *
 * There should only ever be one instance that gets globally referenced.
 */
public final class NativeMC {

    private static NativeMCManager nativeMCManager;

    // Set by NativeMcCore. Do not make it public!
    static void setNativeFactory(@NotNull final NativeMCManager nativeMCManager) {
        NativeMC.nativeMCManager = nativeMCManager;
    }

    public static NativeMCManager use() {
        return nativeMCManager;
    }

    /**
     * Shorthand methods
     *
     * Makes code shorter without the use of the {@link #use()} method.
     */

    public static EntityFactory useEntity() {
        return nativeMCManager.useEntity();
    }

}
