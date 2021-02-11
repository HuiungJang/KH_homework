package com.kh.practice.score.controller;

import com.kh.practice.score.model.dao.ScoreDAO;

import java.io.DataInputStream;
import java.io.FileNotFoundException;

public class ScoreController {
    private ScoreDAO sd = new ScoreDAO();

    public void saveScore(String name, int kor,int eng,int math,int sum,double avg){
        sd.saveScore(name,kor,eng,math,sum,avg);
    }

    public DataInputStream readScore() throws FileNotFoundException {

        return sd.readScore(); // ScoreDAO에서 경로 받아서 리턴.
    }


}
