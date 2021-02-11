package com.kh.practice.score.view;

import com.kh.practice.score.controller.ScoreController;

import java.io.*;
import java.util.Scanner;

public class ScoreMenu {
    private Scanner sc = new Scanner(System.in);
    private ScoreController scr = new ScoreController();

    public void mainMenu() throws FileNotFoundException {
        while(true){
            System.out.println("1. 성적저장");
            System.out.println("2. 성적출력");
            System.out.println("9. 끝내기");
            System.out.print("메뉴번호 : ");
            int cho = sc.nextInt();
            sc.nextLine();

            switch (cho){
                case 1:
                    saveScore();
                    break;
                case 2:
                    readScore();
                    break;
                case 9:
                    return;
            }
        }

    }

    public void saveScore(){
        int num = 0;

        while(true) {
            System.out.println(num+1 + "번째 학생 정보 기록");
            System.out.print("이름 : ");
            String name = sc.nextLine();

            System.out.print("국어 점수 : ");
            int kor = sc.nextInt();
            sc.nextLine();

            System.out.print("영어 점수 : ");
            int eng = sc.nextInt();
            sc.nextLine();

            System.out.print("수학 점수 : ");
            int math = sc.nextInt();
            sc.nextLine();

            int sum = kor + eng + math;
            double avg = (double) (sum) / 3;

            scr.saveScore(name, kor, eng, math, sum, avg);
            num++;

            System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
            char stop = sc.nextLine().toUpperCase().charAt(0);
            if(stop == 'N'){
                return;
            }

        }
    }

    public void readScore()  {
        File f = new File(".");
        String path = f.getAbsolutePath();

        int count = 0;
        int sumAll = 0;
        double avgAll = 0;
        double sumAvg = 0;
        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

        try(DataInputStream dis = scr.readScore()) {

            while(true){
                String name = dis.readUTF();
                int kor = dis.readInt();
                int eng = dis.readInt();
                int math = dis.readInt();
                int sum = dis.readInt();
                double avg = dis.readDouble();
                System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg);
                ++count; // 읽은회수 증가
                sumAll += sum;
                sumAvg += avg; // 평균 누적
                avgAll = sumAvg/count; // 전체평균

            }
        }catch(EOFException e){
            System.out.println("읽은회수 \t 전체 합계 \t전체 평균");
            System.out.println(count+"\t\t "+sumAll+"\t\t\t"+avgAll);
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

}
