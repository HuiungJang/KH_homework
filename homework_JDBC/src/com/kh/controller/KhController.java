package com.kh.controller;

import com.kh.model.vo.Employee;
import com.kh.model.service.KhService;
import com.kh.view.KhView;

import java.util.List;

public class KhController {
    private KhView view = new KhView();
    private KhService service = new KhService();

    public void mainView(){
        view.mainView(this);
    }

    public void searchAll(){
        List<Employee> list = service.searchAll();

        view.searchAll(list);
    }

    public void searchEmp(){
        int cho = view.searchEmp();
        List<Employee> list = null;

        if( cho == 1){
            String dept = view.searchDept();
            list = service.searchDept(dept);
            view.searchAll(list);

        }else if(cho== 2){
            String job =view.searchJob();
            list = service.searchJob(job);
            view.searchAll(list);

        }else if(cho== 3){
            String name = view.searchName();
            list = service.searchName(name);
            view.searchAll(list);

        }else if(cho == 4) {
            int salary = view.searchSalary();
            int lessOrMore = view.conditionSalary();

            list = service.searchSalary(salary,lessOrMore);
            view.searchAll(list);

        }

    }

    public void insertEmp(){
        Employee e = new Employee();

        e= view.insertEmp();
        int result = service.insertEmp(e);

        view.printMsg( result>0? "완료" : "실패");
    }


}
