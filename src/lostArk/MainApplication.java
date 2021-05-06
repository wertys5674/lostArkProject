package lostArk;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("==This is Stone Cutting Simulation Program==");

        while (true) {
            System.out.println("Press 'S' if you want to Start simulate.");
            System.out.println("Press 'Q' if you want to Exit this program");
            System.out.println("Press 'H' if you want to Help");

            System.out.print(">> ");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();

            if (str.equalsIgnoreCase("s")) {
                System.out.println("Which Stone do you want? Choose your number!");
                System.out.println("1.영웅 어빌리티스톤");
                System.out.println("2.전설 어빌리티스톤");
                System.out.println("3.유물 어빌리티스톤");
                System.out.print(">>");
                int pickStone = sc.nextInt();
                switch(pickStone){
                    case 1:
                        System.out.println("영웅 어빌리티스톤 세공을 시작합니다.");

                        break;
                    case 2:
                        System.out.println("전설 어빌리티스톤 세공을 시작합니다.");

                        break;
                    case 3:
                        System.out.println("유물 어빌리티스톤 세공을 시작합니다.");

                        break;
                    default:
                        System.out.println("1~3 사이의 숫자를 입력해주세요.");
                        break;
                }
            } else if (str.equalsIgnoreCase("Q")) {
                System.out.println("Exit Program...");
                break;
            } else if (str.equalsIgnoreCase("H")){
                Help.printHelp();
                continue;
            } else {
                System.out.println("잘못된 입력입니다. 처음부터 다시 해주세요.");
                continue;
            }
        }
    }
}



class Help{
    static void printHelp(){
        System.out.println("이 프로그램은 모의 어빌리티 스톤 세공 프로그램입니다.");
        System.out.println("각각의 돌은 무작위로 3가지의 능력을 부여 받으며 1,2번째는 좋은 효과를 3번째는 안 좋은 효과를 가지고 있습니다.");
        System.out.println("세번째 효과는 실패하되, 첫번째 두번째 효과를 최대한 많이 성공시켜 좋은 성능의 돌을 노려보세요.");
        System.out.println("시작 확률은 75프로이며, 성공과 실패시 다음 확률엔 10%씩 변화가 있습니다. 성공 : -10% 실패 : +10%");
        System.out.println("최대 확률은 75%이고, 최소 확률은 25%입니다.");
    }
}