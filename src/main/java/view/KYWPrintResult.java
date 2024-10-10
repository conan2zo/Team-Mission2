package view;

import model.dto.EmployeeDTO;

import java.util.List;

public class KYWPrintResult {

    public void printMemberList(List<EmployeeDTO> employeeList) {

        System.out.println("요청하신 전체 메뉴 조회 결과 입니다.");

        for (EmployeeDTO menu : employeeList) {
            System.out.println(menu);
        }

        System.out.println("===============================");

    }
    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectList" :
                errorMessage = "직원 전체 조회에 실패하셨습니다...";
                break;
        }

        System.out.println(errorMessage);

    }

}
