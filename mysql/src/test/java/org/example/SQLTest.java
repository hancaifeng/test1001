package org.example;

import org.apache.ibatis.session.SqlSession;
import org.dao.Student;
import org.dao.StudentDao;
import org.dao.StudentVo;
import org.junit.Test;
import org.util.MybatisUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SQLTest {
    @Test
    public void testSelect(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<Map<Object, Object>> select = mapper.select();

        for(Map<Object, Object> map:select){
            Set<Object> objects = map.keySet();
            for(Object o:objects){
                System.out.print(o+"="+map.get(o) + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void testSelectVo(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<StudentVo> studentVos = mapper.selectVo();
        for(StudentVo s:studentVos){
            System.out.println(s);
        }
    }

    @Test
    public void testSelectVoZZ(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        List<StudentVo> studentVos = mapper.selectVoZZ();
        for(StudentVo s:studentVos){
            System.out.println(s);
        }
    }
}
