package com.kh.view;

import com.kh.controller.KhController;
import com.kh.model.vo.Department;
import com.kh.model.vo.Employee;
import com.kh.model.vo.Job;

import java.util.List;
import java.util.Scanner;

public class KhView {
    private Scanner sc= new Scanner(System.in);
    private KhController kc;

    public void mainView(KhController c){
        kc = c;
        while(true) {
            System.out.println("메뉴");
            System.out.println("1. 전체사원 조회");
            System.out.println("2. 사원조회(부서, 직책, 이름, 급여)");
            System.out.println("3. 사원등록");
            System.out.println("4. 사원수정(직책,부서,급여,전화번호,이메일)");
            System.out.println("5. 사원 삭제");
            System.out.println("6. 부서관리");
            System.out.println("7. 직책관리");
            System.out.print("선택 : ");
            int cho = sc.nextInt();
            sc.nextLine();

            switch (cho) {
                case 1:
                    c.searchAll();
                    break;
                case 2:
                    c.searchEmp();
                    break;
                case 3:
                    c.insertEmp();
                    break;
                case 4:
                    c.reviseEmp();
                    break;
                case 5:
                    c.deleteEmp();
                    break;
                case 6:
                    c.manageDept();
                    break;
                case 7:
                    c.manageJob();
                    break;
            }
        }
    }

    public void searchAll(List<Employee> e){
        System.out.println("결과");

        for(Employee list:  e){
            System.out.println(list);
        }
    }

    public int searchEmp(){
        System.out.println("사원찾기");
        System.out.println("1. 부서로 찾기");
        System.out.println("2. 직책으로 찾기");
        System.out.println("3. 이름으로 찾기");
        System.out.println("4. 급여로 찾기");
        System.out.println("번호 : ");
        int cho = sc.nextInt();
        sc.nextLine();

        return  cho;
    }

    public String searchDept(){
        System.out.println("부서 : ");
        return sc.nextLine();
    }

    public String searchJob(){
        System.out.println("직업 : ");
        return sc.nextLine();
    }

    public String searchName(){
        System.out.println("이름 : ");
        return sc.nextLine();
    }

    public int searchSalary(){
        System.out.println("급여 : ");
        int salary = sc.nextInt();
        sc.nextLine();

        return salary;
    }

    public int conditionSalary(){
        System.out.println("1. 입력한 급여보다 많은 사람찾기");
        System.out.println("2. 입력한 급여보다 적은 사람찾기");
        System.out.println("입력 : ");
        int lessOrMore = sc.nextInt();
        sc.nextLine();

        return lessOrMore;
    }

    public Employee insertEmp(){

        System.out.println("직원명 : ");
        String name = sc.nextLine();

        System.out.println("주민등록번호 ( - 포함): ");
        String empNo = sc.nextLine();

        System.out.println("이메일 : ");
        String email = sc.nextLine();

        System.out.println("핸드폰번호 : ");
        String phone = sc.nextLine();

        System.out.println("부서코드: ");
        String deptCode = sc.nextLine();

        System.out.println("직급코드 : ");
        String jobCode = sc.nextLine();

        System.out.println("급여등급 : ");
        String salLevel = sc.nextLine();

        System.out.println("급여 : ");
        int salary = sc.nextInt();

        System.out.println("보너스율 : ");
        float bonus = sc.nextFloat();

        System.out.println("관리자 사번 : ");
        String managerId = sc.nextLine();

        Employee e = new Employee(name,empNo,email,phone,deptCode,jobCode,salLevel,salary,bonus,managerId);

        return e;
    }

    public String reviseEmp(){
        System.out.println("수정할 사원명:");
        String name = sc.nextLine();
        return name;
    }

    public int whatReviseEmp(){
        System.out.println("1.부서");
        System.out.println("2.직책");
        System.out.println("3.이름");
        System.out.println("4.급여");
        System.out.print("어떤거 수정? : ");
        int cho = sc.nextInt();
        sc.nextLine();

        return cho;
    }

    public String whatReviseDept(){
        System.out.print("부서코드 어떤걸로? :");
        String dept = sc.nextLine();
        return dept;
    }
    public String whatReviseJob(){
        System.out.print("직책코드 어떤걸로? :");
        String job = sc.nextLine();
        return job;
    }
    public String whatReviseName(){
        System.out.print("이름 뭘로? :");
        String name = sc.nextLine();
        return name;
    }
    public int whatReviseSalary(){
        System.out.print("급여 얼마로? :");
        int salary = sc.nextInt();
        return salary;
    }

    public String deleteEmp(){
        System.out.println("누구삭제?");
        String name = sc.nextLine();

        return name;
    }

    public int manageDept(){
        System.out.println("1. 부서등록");
        System.out.println("2. 부서수정");
        System.out.println("3. 부서삭제");
        System.out.println("선택 : ");
        int cho = sc.nextInt();

        return cho;
    }

    public Department enrollDept(){
        System.out.println("등록할 부서코드 : ");
        String deptCode = sc.nextLine();
        System.out.println("등록할 부서명 : ");
        String deptTitle=sc.nextLine();
        System.out.println("등록할 지역코드 : ");
        String locationId =sc.nextLine();

        Department dp = new Department(deptCode,deptTitle,locationId);
        return dp;
    }

    public String deleteDept(){
        System.out.println("삭제할 부서코드 :");
        return sc.nextLine();
    }

    public int reviseDept(){
        System.out.println("1. 부서코드  ");
        System.out.println("2. 부서명  ");
        System.out.println("3. 지역코드  ");
        System.out.println("어떤거 수정?");

        return  sc.nextInt();
    }

    public String[] whatDeptCode(){
        System.out.println("어떤부서코드? : ");
        String originDeptCode = sc.nextLine();

        System.out.println("어떤걸로? : ");
        String reviseDeptCode = sc.nextLine();

        String[] deptCode= {originDeptCode,reviseDeptCode};

        return deptCode;
    }
    public String[] whatDeptTitle(){
        System.out.println("어떤부서명? : ");
        String originDeptTitle = sc.nextLine();

        System.out.println("어떤걸로? : ");
        String reviseDeptTitle = sc.nextLine();

        String[] deptTitle= {originDeptTitle,reviseDeptTitle};

        return deptTitle;
    }
    public String[] whatLocationCode(){
        System.out.println("어떤지역코드? : ");
        String originLocationCode = sc.nextLine();

        System.out.println("어떤걸로? : ");
        String reviseLocationCode = sc.nextLine();

        String[] locationCode= {originLocationCode,reviseLocationCode};

        return locationCode;
    }




    public int manageJob(){
        System.out.println("1. 직책등록");
        System.out.println("2. 직책수정");
        System.out.println("3. 직책삭제");
        System.out.println("선택 : ");
        int cho = sc.nextInt();

        return cho;
    }
    public Job enrollJob(){
        System.out.println("등록할 직책코드 : ");
        String jobCode = sc.nextLine();
        System.out.println("등록할 직책명 : ");
        String jobName=sc.nextLine();

        Job j = new Job(jobCode,jobName);
        return j;
    }

    public String deleteJob(){
        System.out.println("삭제할 직책코드 :");
        return sc.nextLine();
    }
    public int reviseJob(){
        System.out.println("1. 직책코드 : ");
        System.out.println("2. 직책명 : ");
        System.out.println("어떤거 수정?");

        return  sc.nextInt();
    }

    public String[] whatJobCode(){
        System.out.println("어떤 직책코드? : ");
        String originJobCode = sc.nextLine();

        System.out.println("어떤걸로? : ");
        String reviseJobCode = sc.nextLine();

        String[] jobCode= {originJobCode,reviseJobCode};

        return jobCode;
    }
    public String[] whatJobTitle(){
        System.out.println("어떤 직책명? : ");
        String originJobTitle = sc.nextLine();

        System.out.println("어떤걸로? : ");
        String reviseJobTitle = sc.nextLine();

        String[] jobTitle= {originJobTitle,reviseJobTitle};

        return jobTitle;
    }


    public void printMsg(String msg){
        System.out.println(msg);
    }

}
