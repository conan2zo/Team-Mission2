package view;

import model.dto.EmployeeDTO;

import java.util.List;

public class JEMPrintResult {


    public void printMemberList(List<EmployeeDTO> memberList) {
        System.out.println("요청하신 전체 직원 조회 결과입니다.");

        for (EmployeeDTO member : memberList){
            System.out.println("member = " + member);
        }

        System.out.println("================================================");
    }


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectList" :
                errorMessage = "전체 직원 조회하기에 실패하셨습니다...";
                break;
        }
    }
}
