package controller;

import model.dto.EmployeeDTO;
import model.service.JEMMemberService;
import view.JEMPrintResult;

import java.util.List;

public class JEMEmployeeController {

    private final JEMMemberService jemMemberService;
    private final JEMPrintResult jemPrintResult;

    public JEMEmployeeController() {
        this.jemMemberService = new JEMMemberService();
        this.jemPrintResult = new JEMPrintResult();
    }

    public void selectAllMember() {

        List<EmployeeDTO> memberList = jemMemberService.selectAllMember();

        if(memberList != null){
            jemPrintResult.printMemberList(memberList);
        } else {
            jemPrintResult.printErrorMessage("selectList");
        }

    }
}
