package view;

import java.util.Scanner;

public class Member {

    public void selectMember() {

        Scanner sc = new Scanner(System.in);
        KKHEmployeeView kkhEmployeeView = new KKHEmployeeView();
        JEMEmployeeView jemEmployeeView = new JEMEmployeeView();
        KYWEmployeeView kywEmployeeView = new KYWEmployeeView();

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
                    kkhEmployeeView.kkhEmployee();
                    break;
                case 2:
                    jemEmployeeView.jemEmployee();
                    break;
                case 3:
                    kywEmployeeView.kywEmployee();
                    break;
            }

        } while (true);

    }

}
