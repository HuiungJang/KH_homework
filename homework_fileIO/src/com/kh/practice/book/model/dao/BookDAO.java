package com.kh.practice.book.model.dao;

import com.kh.practice.book.model.vo.Book;

import java.io.*;
import java.io.Serializable;

public class BookDAO implements Serializable {

    private static final long serialVersionUID = 8533692947228967898L;
    private Book[] bArr = new Book[10];

    public void fileSave(Book[] bArr) {
        File f = new File(".");
        String path = f.getAbsolutePath();

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(path + File.separator + "homework_fileIO"
                        + File.separator + "book.txt"))) {

            for(int i =0; i< bArr.length; i++) {
                if (bArr[i] != null) {
                    oos.writeObject(bArr[i]);
                    // 객체배열에 저장.
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Book[] fileRead() {
        File f = new File(".");
        String path = f.getAbsolutePath();

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(path + File.separator + "homework_fileIO" +
                        File.separator + "book.txt"))) {

            for(int i =0; i<bArr.length; i++) {
                bArr[i] = (Book) ois.readObject();
                // 객체배열에서 가져옴 Object로 가져오니 형변환
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(EOFException e){

        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return bArr;
    }
}
