package com.kh.view;

import com.kh.controller.KhController;
import com.kh.model.vo.Employee;

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
            System.out.println("5. 부서관리");
            System.out.println("6. 직책관리");
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
                    break;
                case 5:
                    break;
                case 6:
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
        System.out.println("이름 : ");
        String name = sc.nextLine();

        System.out.println("주민등록번호 ( - 포함): ");
        String empNo = sc.nextLine();

        System.out.println("이메일 : ");
        String email = sc.nextLine();

        System.out.println("핸드폰번호 : ");
        String phone = sc.nextLine();

        System.out.println("직책번호(J7) : ");
        String jobCode = sc.nextLine();

        System.out.println("급여등급 : ");
        String salLevel = sc.nextLine();

        System.out.println("급여 : ");
        int salary = sc.nextInt();

        System.out.println("보너스 : ");
        float bonus = sc.nextFloat();

        System.out.println("관리자 사번 : ");
        int managerId = sc.nextInt();

        Employee e = new Employee(name,empNo,email,phone,jobCode,salLevel,salary,bonus,managerId);

        return e;
    }

    public void printMsg(String msg){
        System.out.println(msg);
    }

}
