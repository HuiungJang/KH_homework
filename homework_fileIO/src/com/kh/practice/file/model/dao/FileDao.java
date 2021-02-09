package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDao {

    public boolean checkName(String File){

    }

    public void fileSave(String file, String s){
        File filePath = new File(".");
        String path = filePath.getAbsolutePath();

        try(FileWriter w = new FileWriter(path+File.separator+file,true)){
            w.write(s);


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public StringBuilder fileOpen(String file){

    }

    public void fileEdit(String file,String s){

    }
}
