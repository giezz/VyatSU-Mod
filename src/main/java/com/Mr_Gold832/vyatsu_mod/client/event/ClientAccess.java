package com.Mr_Gold832.vyatsu_mod.client.event;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import java.util.List;

public class ClientAccess {
    private static final String BLUE = "\u00A79";
    private static final String WHITE = "\u00A7f";
    private static final String RED = "\u00A7c";

    public static void advancedItemToolTip(List<Component> components) {
        if(!Screen.hasShiftDown()) {
            components.add(Component.literal("Press " + BLUE + "SHIFT " + WHITE + "for more information"));
        }
        else {
            components.add(Component.literal
                    ("Studak is a your pass into new world! With it, you can: \n*Pass through the " + RED +"guard" + WHITE + "\n*Flex with your friends\n*3"));
        }
    }

}
