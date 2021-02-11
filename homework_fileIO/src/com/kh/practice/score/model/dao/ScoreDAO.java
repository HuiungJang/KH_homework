package com.kh.practice.score.model.dao;

import java.io.*;


public class ScoreDAO {

    public void saveScore(String name, int kor,int eng,int math,int sum,double avg) {
        File f = new File(".");
        String path = f.getAbsolutePath();

        // 아.. DataInputStream으로 데이터 불러왔는데.
        // DataOutputStream을 안쓰고 FileWriter를 쓰고 있었네...
        // 내시간...

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream
                (path + File.separator + "homework_fileIO"
                        + File.separator + "saveScore.txt", true))) {

            dos.writeUTF(name);
            dos.writeInt(kor);
            dos.writeInt(eng);
            dos.writeInt(math);
            dos.writeInt(sum);
            dos.writeDouble(avg);


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public DataInputStream readScore() throws FileNotFoundException {
        File f = new File(".");
        String path = f.getAbsolutePath();
        DataInputStream dis = new DataInputStream(new FileInputStream(path+File.separator+"homework_fileIO"
                +File.separator+"saveScore.txt"));

        return dis;
    }

}
