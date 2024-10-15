package view;

import controller.YEJEmployeeController;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YEJEmployeeView {

    public void yejEmployee() {

        Scanner sc = new Scanner(System.in);
        YEJEmployeeController YEJEmpCon = new YEJEmployeeController();

        // 조회 등록 수정 삭제
        do {
            System.out.println("┌───────────────────────────────────────────────────────────┐");
            System.out.println("│               ★ 코난 회사 정보 관리 프로그램 ★         　     │");
            System.out.println("│                                                           │");
            System.out.println("│  1. 인원 전체 조회하기                                       │");
            System.out.println("│  2. 특정 조건으로 인원 조회하기                      　        │");
            System.out.println("│  3. 입사 처리       　                                      │");
            System.out.println("│  4. 발령 처리  　                                           │");
            System.out.println("│  5. 퇴사 처리   　                                          │");
            System.out.println("│  9. 종료하기     　                                         │");
            System.out.println("│                                                           │");
            System.out.println("└───────────────────────────────────────────────────────────┘");
            System.out.println("");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: YEJEmpCon.selEmpAllList();
                    break;
                case 2:
                    break;
                case 3: YEJEmpCon.joinCmpMem(inputEmpJoinMemInfo());
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    return;
                default:
                    System.out.println("┌───────────────────────────────────────────────────────────┐");
                    System.out.println("│            잘못 입력하였습니다. 다시 입력해 주세요.         　　　│");
                    System.out.println("└───────────────────────────────────────────────────────────┘");
                    System.out.println();
                    break;
            }

        } while (true);

    }

    private Map<String, Object> inputEmpJoinMemInfo() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("┌───────────────────────────────────────────────────────────┐");
        System.out.println("│     　 사원 등록을 시작합니다. 모두 입력해 주시기 바랍니다.  　    │");
        System.out.println("└───────────────────────────────────────────────────────────┘");
        System.out.println();

        System.out.print("사원번호 : ");
        String empId = sc.nextLine();
        System.out.print("사원명 : ");
        String empName = sc.nextLine();
        System.out.print("주민등록번호 : ");
        String empNo = sc.nextLine();
        System.out.print("이메일 : ");
        String email = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.print("부서코드 : ");
        String deptCode = sc.nextLine();
        System.out.print("직급코드 : ");
        String jobCode = sc.nextLine();
        System.out.print("급여등급 : ");
        String salLevel = sc.nextLine();
        System.out.print("급여 : ");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.print("보너스율 : ");
        double bonus = sc.nextDouble();
        sc.nextLine();
        System.out.print("관리자 사번 : ");
        String managerId = sc.nextLine();
        System.out.print("입사일(yyyy-MM-dd 형태로 입력) : ");
        Date hireDate = Date.valueOf(sc.nextLine());
        System.out.print("퇴사일(예정일)(yyyy-MM-dd 형태로 입력) : ");
        Date entDate = Date.valueOf(sc.nextLine());
        System.out.print("퇴직여부 (Y/N) : ");
        String entYn = sc.nextLine();

        Map<String, Object> joinMemInfo = new HashMap<>();
        joinMemInfo.put("empId", empId);
        joinMemInfo.put("empName", empName);
        joinMemInfo.put("empNo", empNo);
        joinMemInfo.put("email", email);
        joinMemInfo.put("phone", phone);
        joinMemInfo.put("deptCode", deptCode);
        joinMemInfo.put("jobCode", jobCode);
        joinMemInfo.put("salLevel", salLevel);
        joinMemInfo.put("salary", salary);
        joinMemInfo.put("bonus", bonus);
        joinMemInfo.put("managerId", managerId);
        joinMemInfo.put("hireDate", hireDate);
        joinMemInfo.put("entDate", entDate);
        joinMemInfo.put("entYn", entYn);

        return joinMemInfo;

    }

}
