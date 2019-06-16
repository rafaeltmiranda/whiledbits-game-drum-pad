package org.academiadecodigo.whiledlings.whiledbits.gfx;

import org.academiadecodigo.whiledlings.whiledbits.Game;

public enum GfxPadsPicsGlow {
    YELLOW(Game.resourcesPathImages + "buttons/pads/padYellowGlow.png"),
    BLUE(Game.resourcesPathImages + "buttons/pads/padBlueGlow.png"),
    PINK(Game.resourcesPathImages + "buttons/pads/padPinkGlow.png");

    private String path;

    GfxPadsPicsGlow(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
