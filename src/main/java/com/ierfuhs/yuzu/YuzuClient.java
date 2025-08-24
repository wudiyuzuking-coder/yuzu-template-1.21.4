package com.ierfuhs.yuzu;

import net.fabricmc.api.ClientModInitializer;

public class YuzuClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
        {
            System.out.println("Yuzu Client Initialized");
        }
}
