package model.service;

import model.dao.JEMMenuMapper;
import model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static common.Template.getSqlSession;

public class JEMMemberService {

    private JEMMenuMapper jemMenuMapper;

    public List<EmployeeDTO> selectAllMember() {
        SqlSession sqlSession = getSqlSession();

        jemMenuMapper = sqlSession.getMapper(JEMMenuMapper.class);

        List<EmployeeDTO> memberList = jemMenuMapper.selectAllMember();

        sqlSession.close();

        return memberList;
    }
}
