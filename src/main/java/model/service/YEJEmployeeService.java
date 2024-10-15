package model.service;

import model.dao.YEJMenuMapper;
import model.dto.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static common.Template.getSqlSession;

public class YEJEmployeeService {

    private YEJMenuMapper yejMenuMapper;

    public boolean joinMemInfo(EmployeeDTO joinEmpDTO) {
        SqlSession sqlSession = getSqlSession();
        yejMenuMapper = sqlSession.getMapper(YEJMenuMapper.class);

        int result = yejMenuMapper.joinMemInfo(joinEmpDTO);

//        if (result > 0) {
//            System.out.println();
//            System.out.println("┌───────────────────────────────────────────────────────────┐");
//            System.out.println("│　　　　　　　　　　　　사원 등록에 성공하였습니다.  　　　　　　　　　　　│");
//            System.out.println("└───────────────────────────────────────────────────────────┘");
//            System.out.println();
//            sqlSession.commit();
//        } else {
//            System.out.println();
//            System.out.println("┌───────────────────────────────────────────────────────────┐");
//            System.out.println("│　　　　　　　　　　　　사원 등록에 실패하였습니다.  　　　　　　　　　　　│");
//            System.out.println("└───────────────────────────────────────────────────────────┘");
//            System.out.println();
//            sqlSession.rollback();
//        }

        return result > 0 ? true : false;

    }

    public List<EmployeeDTO> selEmpAllList() {

        SqlSession sqlSession = getSqlSession();

        yejMenuMapper = sqlSession.getMapper(YEJMenuMapper.class);

        List<EmployeeDTO> empAllList = yejMenuMapper.selEmpAllList();

        sqlSession.close();

        return empAllList;
    }

}
