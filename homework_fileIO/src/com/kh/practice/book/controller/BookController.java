package com.kh.practice.book.controller;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

import java.io.File;
import java.io.IOException;

public class BookController {

    private BookDAO bd = new BookDAO();

    public void makeFile(){
        File f = new File(".");
        String path = f.getAbsolutePath();

        File createFile = new File(path+File.separator
        +"homework_fileIO"+File.separator+"book.txt");

        if( !createFile.exists()){
            try {
                createFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void fileSave(Book[] bArr){
        bd.fileSave(bArr);
    }

    public Book[] fileRead(){
        return bd.fileRead();
    }


}
