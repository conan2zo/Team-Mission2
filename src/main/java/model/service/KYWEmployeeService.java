package model.service;

import model.dao.KKHMenuMapper;
import model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static common.Template.getSqlSession;

public class KYWEmployeeService {

    private KKHMenuMapper kkhMenuMapper;

    public List<EmployeeDTO> selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();

        kkhMenuMapper = sqlSession.getMapper(KKHMenuMapper.class);

        List<EmployeeDTO> memberDTO = kkhMenuMapper.selectAllEmployee();

        sqlSession.close();

        return memberDTO;
    }
}
