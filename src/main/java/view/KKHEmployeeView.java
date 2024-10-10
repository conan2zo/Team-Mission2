package view;

import controller.KKHEmployeeController;

import java.util.Scanner;

public class KKHEmployeeView {

    public void kkhEmployee() {
        Scanner sc = new Scanner(System.in);
        KKHEmployeeController kkhEmployeeController = new KKHEmployeeController();

        do {

            System.out.println("===============주식회사 HiMeDia==================");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 나이순 회원조회");
            System.out.println("3. 직원 입사");
            System.out.println("4. 직원 정보 수정");
            System.out.println("5. 직원 퇴사");
            System.out.print("번호를 입력해주세요 : ");
            int no = sc.nextInt();
            System.out.println("=================================================");

            switch (no) {
                case 1 :
                    kkhEmployeeController.selectAllEmployee();
                    break;
            }

        } while (true);

    }
}
