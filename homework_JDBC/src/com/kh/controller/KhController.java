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

    public void reviseEmp(){
        String name = view.reviseEmp();
        int cho = view.whatReviseEmp();
        int result = 0;

        if(cho ==1){
            String reviseDept =view.whatReviseDept();
            result = service.reviseDept(name,reviseDept);
            view.printMsg(result>0? "완료":"실패");

        }else if(cho ==2){
            String reviseJob = view.whatReviseJob();
            result = service.reviseJob(name,reviseJob);
            view.printMsg(result>0? "완료":"실패");

        }else if (cho == 3) {
            String reviseName = view.whatReviseName();
            result = service.reviseName(name,reviseName);
            view.printMsg(result>0? "완료":"실패");

        }else{
            int reviseSalary = view.whatReviseSalary();
            result = service.reviseSalary(name,reviseSalary);
            view.printMsg(result>0? "완료":"실패");
        }

    }

    public void deleteEmp(){
        String name = view.deleteEmp();
        int result = service.deleteEmp(name);
        view.printMsg(result>0? "완료":"실패");
    }


}
