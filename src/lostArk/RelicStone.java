package lostArk;

import java.util.ArrayList;

public class RelicStone extends SimuStone {
    ArrayList<String> merit1 = new ArrayList<>();
    ArrayList<String> merit2 = new ArrayList<>();
    ArrayList<String> dMerit = new ArrayList<>();

    @Override
    void cutStone() {
        for (int i = 0; i < 30; i++) {
            super.cutStone();
        }
    }
}
