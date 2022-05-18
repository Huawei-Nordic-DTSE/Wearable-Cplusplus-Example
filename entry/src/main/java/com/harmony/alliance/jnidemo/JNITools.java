package com.harmony.alliance.jnidemo;

public class JNITools {
    static {
        System.loadLibrary("hello");
    }
    public static native int addNumber(int a, int b);
    public static native int subNumber(int a, int b);
    public static native int mulNumber(int a, int b);
    public static native int divNumber(int a, int b);

}
