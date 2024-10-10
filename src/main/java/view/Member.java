package view;

import java.util.Scanner;

public class Member {

    public void selectMember() {

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("============= 멤버 선택 ==============");
            System.out.println("1. 김관훈");
            System.out.println("2. 정은미");
            System.out.println("3. 김용욱");
            System.out.println("=====================================");
            System.out.println("멤버를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    KKHEmployeeView.kkhEmployee();
                    break;
                case 2:
                    JEMEmployeeView.jemEmployee();
                    break;
                case 3:
                    KYWEmployeeView.kywEmployee();
                    break;
            }

        } while (true);

    }

}
