package model.service;

import model.dao.KKHMenuMapper;
import model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static common.Template.getSqlSession;

public class KKHEmployeeService {

    private KKHMenuMapper kkhMemberMapper;

    public List<EmployeeDTO> selectAllEmployee() {
        SqlSession sqlSession = getSqlSession();

        kkhMemberMapper = sqlSession.getMapper(KKHMenuMapper.class);

        List<EmployeeDTO> memberDTO = kkhMemberMapper.selectAllEmployee();

        sqlSession.close();

        return memberDTO;
    }
}
