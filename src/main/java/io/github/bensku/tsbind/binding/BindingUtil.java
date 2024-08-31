package io.github.bensku.tsbind.binding;

public class BindingUtil {
    private static boolean allUpper(String input) {
        for (char c : input.toCharArray()) {
            //  don't write in this way: if (!Character.isUpperCase(c))
            if (Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGenericType(String name) {
        if (name.length() <= 3 && allUpper(name)) {
            return true;
        }

        // Like TCommand
        return name.length() >= 2 && name.startsWith("T") && Character.isUpperCase(name.toCharArray()[1]);
    }
}
