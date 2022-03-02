package com.ajax;

import com.student.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //{"id":"?","name":"?","age":"?"}单个对象
        //{"stu1":{"id":"?","name":"?","age":"?"},"stu2":{"id":"?","name":"?","age":"?"}}多个对象
        response.setContentType("application/json");

        Student student1 = new Student(1001,20,"李四");
        Student student2 = new Student(1002,22,"李五");
        PrintWriter out = response.getWriter();

//          单个对象
//            String str="{\"id\":\"1001\",\"name\":\"李四\",\"age\":\"20\"}";
//            String str = "{\"id\":\""+student.getId()
//                    +"\",\"name\":\""+student.getName()
//                    +"\",\"age\":\""+student.getAge()+"\"}";


        //String str="{\"stu1\":{\"id\":\"1001\",\"name\":\"李四\",\"age\":\"20\"},\"stu2\":{\"id\":\"1002\",\"name\":\"李五\",\"age\":\"90\"}}";
        String str = "{\"stu1\":{\"id\":\""+student1.getId()
                +"\",\"name\":\""+student1.getName()
                +"\",\"age\":\""+student1.getAge()
                +"\"},\"stu2\":{\"id\":\""+student2.getId()
                +"\",\"name\":\""+student2.getName()
                +"\",\"age\":\""+student2.getAge()+"\"}}";
        out.print(str);
        out.close();
    }
}
