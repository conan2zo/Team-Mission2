package view;

import model.dto.EmployeeDTO;

import java.util.List;

public class YEJPrintResult {
    public static void printEmpList(List<EmployeeDTO> empList) {
        System.out.println();
        System.out.println("┌───────────────────────────────────────────────────────────┐");
        System.out.println("│                     전체 사원 조회 결과                      │");
        System.out.println("└───────────────────────────────────────────────────────────┘");
        System.out.println();
        for (EmployeeDTO emp : empList) {
            System.out.println(emp);
        }
        System.out.println();
        System.out.println("─────────────────────────────────────────────────────────────");
        System.out.println();
    }

    public static void printErrorMessage(String errorMessage) {
        String errorMsg = "";

        switch (errorMessage) {
            case "selAllList":
                errorMsg = "|                  사원 조회에 실패하였습니다.        　         |";
                break;
            case "joinMemInfo":
//              errorMsg = "┌───────────────────────────────────────────────────────────┐";
                errorMsg = "|                  사원 등록에 실패하였습니다.        　         |";
                break;
        }

        System.out.println();
        System.out.println("┌───────────────────────────────────────────────────────────┐");
        System.out.println(errorMsg);
        System.out.println("└───────────────────────────────────────────────────────────┘");
        System.out.println();
    }

    public static void printSuccessMessage(String successMessage) {
        String successMsg = "";

        switch (successMessage) {
            case "joinMemInfo":
//              errorMsg = "┌───────────────────────────────────────────────────────────┐";
                successMsg = "|                  사원 등록에 성공하였습니다.        　         |";
                break;
        }

        System.out.println();
        System.out.println("┌───────────────────────────────────────────────────────────┐");
        System.out.println(successMsg);
        System.out.println("└───────────────────────────────────────────────────────────┘");
        System.out.println();
    }
}
