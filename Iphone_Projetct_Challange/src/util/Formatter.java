package util;

public class Formatter {

    // Converte um ENUM_NAME para "Enum name"
    public static String formatEnumName(Enum<?> e) {
        String name = e.name().toLowerCase().replace('_', ' ');
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }
}
