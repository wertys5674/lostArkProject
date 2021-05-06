package lostArk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HeroStone extends SimuStone{
    static char[] merit1 = new char[8];
    char[] merit2 = new char[8];
    char[] dmerit = new char[8];

    public static void setMerit1(char[] merit1) {
        HeroStone.merit1 = merit1;
    }

    public static char[] getMerit1() {
        return merit1;
    }
}