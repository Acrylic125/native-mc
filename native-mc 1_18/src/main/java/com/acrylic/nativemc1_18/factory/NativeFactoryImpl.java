package com.acrylic.nativemc1_18.factory;

import com.acrylic.nativemcuniversal.factory.EntityFactory;
import com.acrylic.nativemcuniversal.factory.NativeFactory;

public class NativeFactoryImpl implements NativeFactory {

    private final EntityFactory entityFactory = new EntityFactoryImpl();

    @Override
    public EntityFactory entity() {
        return this.entityFactory;
    }
}
