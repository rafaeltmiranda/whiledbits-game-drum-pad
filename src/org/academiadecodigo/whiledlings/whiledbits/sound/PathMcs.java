package org.academiadecodigo.whiledlings.whiledbits.sound;

public enum PathMcs {
    PAD_0(SoundsGroup.MCS.getPath() + "Faustino/batata.wav"),
    PAD_1(SoundsGroup.MCS.getPath() + "Faustino/okFx.wav"),
    PAD_2(SoundsGroup.MCS.getPath() + "Faustino/SapatoFx.wav"),
    PAD_3(SoundsGroup.MCS.getPath() + "Seringas/boyFx.wav"),
    PAD_4(SoundsGroup.MCS.getPath() + "Seringas/spinerFx.wav"),
    PAD_5(SoundsGroup.MCS.getPath() + "Mariana/grigriMar.wav"),
    PAD_6(SoundsGroup.MCS.getPath() + "Mariana/grigriMar.wav"),
    PAD_7(SoundsGroup.MCS.getPath() + "Mariana/grigriMar.wav"),
    PAD_8(SoundsGroup.MCS.getPath() + "Mariana/grigriMar.wav"),
    PAD_9(SoundsGroup.MCS.getPath() + "Mariana/grigriMar.wav");

    private String path;

    PathMcs(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
