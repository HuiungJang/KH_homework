package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDao;

public class FileController {

    FileDao fd = new FileDao();

    public boolean checkName(String file){

    }

    public void fileSave(String file, StringBuilder sb ){
        String s = String.valueOf(sb);
        fd.fileSave(file,s);
    }

    public StringBuilder fileOpen(String file){

    }

    public void fileEdit(String file,StringBuilder sb){

    }
}
