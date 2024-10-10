package view;

import model.dto.EmployeeDTO;

import java.util.List;

public class KKHPrintResult {

    public void printEmployeeList(List<EmployeeDTO> memberDTO) {
        System.out.println("요청하신 전체 직원 조회입니다.");

        for(EmployeeDTO member : memberDTO) {
            System.out.println(member);
        }

        System.out.println("=================================================");
    }


    public void printErrorMessage(String errorCode);

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "memberList" :
                errorCode = "메뉴 전체 조회에 실패하였습니다.";
                break;
        }
    }

}
