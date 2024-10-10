package controller;

import model.dto.EmployeeDTO;
import model.service.KKHEmployeeService;
import view.KKHPrintResult;

import java.util.List;

public class KKHEmployeeController {

    private final KKHEmployeeService kkhEmployeeService;
    private final KKHPrintResult kkhPrintResult;

    public KKHEmployeeController() {
        this.kkhEmployeeService = new KKHEmployeeService();
        this.kkhPrintResult = new KKHPrintResult();
    }

    public void selectAllEmployee() {

        List<EmployeeDTO> memberDTO = kkhEmployeeService.selectAllEmployee();

        if(memberDTO != null) {

            kkhPrintResult.printEmployeeList(memberDTO);
        } else {
            kkhPrintResult.printErrorMessage("employeeList");
          
            KKHPrintResult.printEmployeeList(memberDTO);
        } else {
            KKHPrintResult.printErrorMessage("");
        }

    }
}
