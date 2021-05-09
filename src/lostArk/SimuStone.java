package lostArk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimuStone {
    Scanner scanner;
    int size;
    int count;

    final ArrayList<String> firstLine;
    final ArrayList<String> secondLine;
    final ArrayList<String> thirdLine;

    int success = 75;
    int rand;

    SimuStone(int size, Scanner scanner) {
        this.size = size;
        this.count = size * 3;

        firstLine = new ArrayList<>();
        secondLine = new ArrayList<>();
        thirdLine = new ArrayList<>();

        this.scanner = scanner;
    }

    void play() {
        while (count > 0) {
            System.out.print("성공확률 : " + success + "% 숫자를 입력하세요. >>");
            String s = scanner.next();
            int pick = Integer.parseInt(s);
            validateSize(chooseLine(pick));
            chooseLine(pick).add(getSF());
            count --;
        }

        System.out.println("돌깎기가 완료되었습니다.");
        System.out.println("firstLine" + firstLine);
        System.out.println("SecondLine" + secondLine);
        System.out.println("ThirdLine" + thirdLine);
    }   //돌깎기 시작.

    String getSF() {
        rand = (int) (Math.random() * 100 + 1);
        if (success >= rand) {
            success -= 10;
            if (success < 25) {
                success += 10;
            }
            System.out.println("Success!");
            return "S";
        } else {
            success += 10;
            if (success > 75) {
                success -= 10;
            }
            System.out.println("Fail!");
            return "F";
        }
    }

    List chooseLine(int choose) {
        if (choose == 1)
            return firstLine;
        if (choose == 2)
            return secondLine;
        if (choose == 3)
            return thirdLine;

        throw new IllegalArgumentException("1~3의 입력값이 필요합니다.");
    }

//    void mark(int pick,String mark){
//        chooseLine(pick).add(getSF());
//    }

    void validateSize(List line) {
        if (line.size() > size - 1)
            throw new IllegalArgumentException(line.toString());
    }
}

