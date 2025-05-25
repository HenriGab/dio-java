package Menus;

public enum MusicMenu {
    CHOOSE_MUSIC(1),
    PLAY(2),
    PAUSE(3),
    EXIT(0);

    private final int code;


    MusicMenu(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static MusicMenu fromCode(int code) {
        for (MusicMenu option : values()) {
            if (option.getCode() == code) {
                return option;
            }
        }
        return null;
    }
}



