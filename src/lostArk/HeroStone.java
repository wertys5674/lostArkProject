package lostArk;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HeroStone extends SimuStone {
    ArrayList<String> merit1 = new ArrayList<>();
    ArrayList<String> merit2 = new ArrayList<>();
    ArrayList<String> dmerit = new ArrayList<>();

    @Override
    void cutStone() {
        for (int i = 0; i < 24; i++) {
            super.cutStone();
        }
    }
}