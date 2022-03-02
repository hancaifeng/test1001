package org.dao;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public List<Map<Object,Object>> select();

    public List<StudentVo> selectVo();

    public List<StudentVo> selectVoZZ();
}
