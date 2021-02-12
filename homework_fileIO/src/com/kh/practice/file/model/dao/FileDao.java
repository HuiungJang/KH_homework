package com.kh.practice.file.model.dao;

import java.io.*;

public class FileDao {

    public boolean checkName(String File){
        File f = new File(".");
        String path = f.getAbsolutePath();
        File filePath = new File(path+"/homework_fileIO");

        String[] list = filePath.list();

        for(String check : list){
            if(check.contains(File)){
                return true;
            }
        }
        return false;
    }

    public void fileSave(String file, String s){
        File filePath = new File(".");
        String path = filePath.getAbsolutePath();

        try(FileWriter w = new FileWriter(path+File.separator+"homework_fileIO"+File.separator+file,true)){
            w.write(s);


        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public StringBuilder fileOpen(String file){
        File filePath = new File(".");
        String path = filePath.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        String s = "";

        try(BufferedReader br = new BufferedReader(
                new FileReader(path+File.separator
                        +"homework_fileIO"+File.separator+file))){

            try {
                while(true) {
                    if( (s=br.readLine()) != null ) {
                        sb.append(s+"\n");
                    }else
                        break;
                }
            }catch(FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        catch(IOException e ){
            e.printStackTrace();
        }

        return sb;
    }

    public void fileEdit(String file,String s){
        fileSave(file,s);
        // 파일내용 추가하는 것이기때문에
        // 굳이 새로 만들필요없이
        // 이미 만들어둔 메소드 호출해서 해결한다.
    }

}
