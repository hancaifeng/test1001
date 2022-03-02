package com.mould;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Mould extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if(path.equals("/add")){
            add(request, response);
        }else if(path.equals("/")){
            delete(request, response);
        }else if(path.equals("/update")){
            update(request, response);
        }else if(path.equals("/query")){
            query(request, response);
        }
    }

    private void query(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("查询了数据");
    }
    private void update(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("修改了数据");
    }
    private void delete(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("删除了数据");
    }
    private void add(HttpServletRequest request, HttpServletResponse response){
        System.out.println("添加了数据");
    }
}
