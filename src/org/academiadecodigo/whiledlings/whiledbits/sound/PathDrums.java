package org.academiadecodigo.whiledlings.whiledbits.sound;

import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public enum PathDrums {

    PAD_0(SoundsGroup.DRUMS.getPath() + "beats/beat1.wav"),
    PAD_1(SoundsGroup.DRUMS.getPath() + "beats/beat2.wav"),
    PAD_2(SoundsGroup.DRUMS.getPath() + "beats/beat3.wav"),
    PAD_3(SoundsGroup.DRUMS.getPath() + "beats/beat4.wav"),
    PAD_4(SoundsGroup.DRUMS.getPath() + "beats/beat5.wav"),
    PAD_5(SoundsGroup.DRUMS.getPath() + "beats/beat6.wav"),
    PAD_6(SoundsGroup.DRUMS.getPath() + "beats/beat7.wav"),
    PAD_7(SoundsGroup.DRUMS.getPath() + "beats/beat8.wav"),
    PAD_8(SoundsGroup.DRUMS.getPath() + "beats/beat9.wav"),
    PAD_9(SoundsGroup.DRUMS.getPath() + "beats/beat10.wav");

    private String path;

    PathDrums(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
