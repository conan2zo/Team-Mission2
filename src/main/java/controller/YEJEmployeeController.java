package controller;

import model.dto.EmployeeDTO;
import model.service.YEJEmployeeService;
import view.YEJPrintResult;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public class YEJEmployeeController {

    private final YEJEmployeeService yejempsrv;
    private final YEJPrintResult prtRst;

    public YEJEmployeeController() {
        this.yejempsrv = new YEJEmployeeService();
        this.prtRst = new YEJPrintResult();
    }

    public void selEmpAllList() {

        List<EmployeeDTO> empList = yejempsrv.selEmpAllList();

        // 정상 조회
        if (empList != null) {
            prtRst.printEmpList(empList);
        } else {
            prtRst.printErrorMessage("selAllList");
//            System.out.println("에러~~~");
        }

    }

    public void joinCmpMem(Map<String, Object> joinMemInfo) {

        String empId = joinMemInfo.get("empId").toString();
        String empName = joinMemInfo.get("empName").toString();
        String empNo = joinMemInfo.get("empNo").toString();
        String email = joinMemInfo.get("email").toString();
        String phone = joinMemInfo.get("phone").toString();
        String deptCode = joinMemInfo.get("deptCode").toString();
        String jobCode = joinMemInfo.get("jobCode").toString();
        String salLevel = joinMemInfo.get("salLevel").toString();
        int salary = Integer.parseInt(joinMemInfo.get("salary").toString());
        double bonus = Double.parseDouble(joinMemInfo.get("bonus").toString());
        String managerId = joinMemInfo.get("managerId").toString();
        Date hireDate = Date.valueOf(joinMemInfo.get("hireDate").toString());
        Date entDate = Date.valueOf(joinMemInfo.get("entDate").toString());
        String entYn = joinMemInfo.get("entYn").toString();



        EmployeeDTO empDTO = new EmployeeDTO();
        empDTO.setEmpId(empId);
        empDTO.setEmpName(empName);
        empDTO.setEmpNo(empNo);
        empDTO.setEmail(email);
        empDTO.setPhone(phone);
        empDTO.setDeptCode(deptCode);
        empDTO.setJobCode(jobCode);
        empDTO.setSalLevel(salLevel);
        empDTO.setSalary(salary);
        empDTO.setBonus(bonus);
        empDTO.setManagerId(managerId);
        empDTO.setHireDate(hireDate);
        empDTO.setEntDate(entDate);
        empDTO.setEntYn(entYn);

        if (yejempsrv.joinMemInfo(empDTO)) {
            YEJPrintResult.printSuccessMessage("joinMemInfo");
        } else {
            prtRst.printErrorMessage("joinMemInfo");
        }

    }
}