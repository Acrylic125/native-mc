package com.acrylic.nativemcuniversal.factory;

/**
 * NativeFactory is an abstract factory that holds references
 * to the other factories.
 */
public interface NativeFactory {

    EntityFactory entity();

}
