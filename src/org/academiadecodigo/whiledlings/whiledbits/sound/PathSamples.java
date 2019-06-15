package org.academiadecodigo.whiledlings.whiledbits.sound;

public enum PathSamples {
    PAD_0(SoundsGroup.SAMPLES.getPath() + "deathFx.wav"),
    PAD_1(SoundsGroup.SAMPLES.getPath() + "explosionFx.wav"),
    PAD_2(SoundsGroup.SAMPLES.getPath() + "gameOverFx.wav"),
    PAD_3(SoundsGroup.SAMPLES.getPath() + "grigriFx.wav"),
    PAD_4(SoundsGroup.SAMPLES.getPath() + "gunFx.wav"),
    PAD_5(SoundsGroup.SAMPLES.getPath() + "orbFx.wav"),
    PAD_6(SoundsGroup.SAMPLES.getPath() + "powerUpFx.wav"),
    PAD_7(SoundsGroup.SAMPLES.getPath() + "shinigFx.wav"),
    PAD_8(SoundsGroup.SAMPLES.getPath() + "sinFx.wav"),
    PAD_9(SoundsGroup.SAMPLES.getPath() + "teleportFx.wav");

    private String path;

    PathSamples(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
