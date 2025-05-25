package Menus;

public enum PhoneMenu {
    CALL(1),
    ANSWER(2),
    VOICEMAIL(3),
    EXIT(0);

    private final int code;

    PhoneMenu(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PhoneMenu fromCode(int code) {
        for (PhoneMenu option : values()) {
            if (option.getCode() == code) return option;
        }
        return null;
    }
}
