package org.academiadecodigo.whiledlings.whiledbits.pads;

import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public enum PathDrums {

    PAD_0(SoundsGroup.DRUMS.getPath() + "0.wav"),
    PAD_1(SoundsGroup.DRUMS.getPath() + "1.wav"),
    PAD_2(SoundsGroup.DRUMS.getPath() + "2.wav"),
    PAD_3(SoundsGroup.DRUMS.getPath() + "3.wav"),
    PAD_4(SoundsGroup.DRUMS.getPath() + "4.wav"),
    PAD_5(SoundsGroup.DRUMS.getPath() + "5.wav"),
    PAD_6(SoundsGroup.DRUMS.getPath() + "6.wav"),
    PAD_7(SoundsGroup.DRUMS.getPath() + "7.wav"),
    PAD_8(SoundsGroup.DRUMS.getPath() + "8.wav"),
    PAD_9(SoundsGroup.DRUMS.getPath() + "9.wav");

    private String path;

    PathDrums(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
