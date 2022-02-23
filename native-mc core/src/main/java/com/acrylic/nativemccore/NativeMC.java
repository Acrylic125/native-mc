package com.acrylic.nativemccore;

import com.acrylic.nativemcuniversal.factory.NativeFactory;
import org.jetbrains.annotations.NotNull;

public final class NativeMC {

    private static NativeFactory nativeFactory;

    static void setNativeFactory(@NotNull final NativeFactory nativeFactory) {
        NativeMC.nativeFactory = nativeFactory;
    }

    public static NativeFactory use() {
        return nativeFactory;
    }

}
