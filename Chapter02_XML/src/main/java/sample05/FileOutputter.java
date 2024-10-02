package sample05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//결과를 파일로 출력
public class FileOutputter implements Outputter{
    private String filePath;
    private String fileName;

    public void setFilePath(String filePath) {
        this.filePath = filePath;
        System.out.println("setFilePath(String filePath)");
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        System.out.println("setFileName(String fileName)");
    }

    @Override
    public void output(String message) {
        System.out.println("output(String message)");

        try {
            FileWriter fileWriter = new FileWriter(filePath+fileName); //파일 객체 생성
            fileWriter.write(message); //파일 출력
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
