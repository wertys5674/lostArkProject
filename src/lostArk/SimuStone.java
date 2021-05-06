package lostArk;

import java.util.ArrayList;

public class SimuStone {
    int sucPer = 75;
    int percentage = (int) (Math.random() * 100 + 1);

    void cutStone() {
        if (percentage <= sucPer) {
            this.success();
            sucPer -= 10;
            if (sucPer < 25) {
                sucPer += 10;
            }
        } else {
            this.failure();
            sucPer += 10;
            if (sucPer > 75) {
                sucPer -= 10;
            }
        }
    }

    public void success(ArrayList<String> arrList) {
        // 해당 돌의 Arraylist N 에서 S 로 바꿔주고
        arrList.add("S");
    }

    public void failure(ArrayList<String> arrList) {
        // 해당 돌의 Arraylist F로 바꿔준다.
        arrList.add("F");
    }
}
