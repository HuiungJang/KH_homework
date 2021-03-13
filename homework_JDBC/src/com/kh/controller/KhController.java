package com.kh.controller;

import com.kh.model.service.KhService;
import com.kh.model.vo.Department;
import com.kh.model.vo.Employee;
import com.kh.model.vo.Job;
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

    public void manageDept(){
       int cho = view.manageDept();
        Department dp = new Department();

       if(cho == 1){
           // 사원등록
           dp = view.enrollDept();
           int result = service.manageEnrollDept(dp);
           view.printMsg(result>0? "성공":"실패");

       }else if(cho ==2){
           // 사원수정
            int revise = view.reviseDept();
            if(revise == 1) {
                // 부서코드 수정
               String[] deptCode=  view.whatDeptCode();
               int result = service.manageReviseDeptCode(deptCode);
                view.printMsg(result>0? "성공":"실패");

            }else if(revise ==2){
                // 부서명 수정
                String[] deptTitle = view.whatDeptTitle();
                int result = service.manageReviseDeptTitle(deptTitle);
                view.printMsg(result>0? "성공":"실패");

            }else{
                // 지역코드 수정
                String[] locationCode = view.whatLocationCode();
                int result = service.manageReviseLocationCode(locationCode);
                view.printMsg(result>0? "성공":"실패");
            }
       }else{
           // 부서 삭제
            String delete = view.deleteDept();
            int result =service.manageDeleteDept(delete);
            view.printMsg(result>0? "성공":"실패");
       }

    }

    public void manageJob(){
        int cho = view.manageJob();
        Job j = new Job();
        if(cho == 1){
            j =view.enrollJob();
            int result = service.manageEnrollJob(j);
            view.printMsg(result>0? "성공":"실패");

    }   else if(cho ==2){
            int revise = view.reviseJob();
            if(revise == 1){
                // 직책 코드 수정
                String[] jobCode=  view.whatJobCode();
                int result = service.manageReviseJobCode(jobCode);
                view.printMsg(result>0? "성공":"실패");

            }else{
                // 직책명 수정
                String[] JobTitle = view.whatJobTitle();
                int result = service.manageReviseJobTitle(JobTitle);
                view.printMsg(result>0? "성공":"실패");
            }

        }else{
            // 직책 삭제
            String delete =  view.deleteJob();
            int result =service.manageDeleteJob(delete);
            view.printMsg(result>0? "성공":"실패");
        }
    }


}
