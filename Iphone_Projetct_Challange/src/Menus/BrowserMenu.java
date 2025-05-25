package Menus;

public enum BrowserMenu {
    SHOW_PAGE(1),
    NEW_TAB(2),
    REFRESH(3),
    EXIT(0);

    private final int code;

    BrowserMenu(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static BrowserMenu fromCode(int code) {
        for (BrowserMenu option : values()) {
            if (option.getCode() == code) return option;
        }
        return null;
    }
}
