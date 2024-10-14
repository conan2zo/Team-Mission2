package view;

import model.dto.EmployeeDTO;

import java.util.List;

public class YEJPrintResult {
    public static void printEmpList(List<EmployeeDTO> empList) {
        for (EmployeeDTO emp : empList) {
            System.out.println(emp);
        }
    }
}
