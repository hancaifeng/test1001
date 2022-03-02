package org.dao;

public class StudentVo {
    //学生信息
    Integer sid;
    String sname;
    String sclass_id;

    //班级信息
    Integer cid;
    String cclass;

    public StudentVo() {
    }

    public StudentVo(Integer sid, String sname, String sclass_id, Integer cid, String cclass) {
        this.sid = sid;
        this.sname = sname;
        this.sclass_id = sclass_id;
        this.cid = cid;
        this.cclass = cclass;
    }

    @Override
    public String toString() {
        return "StudentVo{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sclass_id='" + sclass_id + '\'' +
                ", cid=" + cid +
                ", cclass='" + cclass + '\'' +
                '}';
    }
}
