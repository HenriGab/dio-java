package Menus;

public enum MainMenu {
    MUSIC(1),
    PHONE(2),
    BROWSER(3),
    EXIT(0);

    private final int code;

    MainMenu(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static MainMenu fromCode(int code){
        for (MainMenu option : values()){
            if(option.getCode() == code){
                return option;
            }
        }
            return null;
    }

}
