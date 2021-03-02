package com.acme.dbo.txlog;

/**
 * Facade
 * @author kjghdkfjghdkfjhg
 * @since 1.0
 */
public class Facade {
    /**
     * message != null
     */
    static int var = 1; //static, global
    public static final int MY_CONST = 2;

    static {
        System.out.println("static block");
    }
    //@Contract(!null -> !null)
    public static void log(/* @NotNull */ int message) {
        int i; // stack, auto, local
        if (message <= 0) throw new IllegalArgumentException();
        //--implementation как?--
        printToConsole(message);
    }

    public static void log(byte message) {
        printToConsole(message);
    }

    private static void printToConsole(int message) {
        System.out.println("primitive: " + message);
    }
}
// single-line
