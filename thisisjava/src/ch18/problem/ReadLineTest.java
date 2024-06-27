package ch18.problem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest {

  public static void main(String[] args) throws IOException {
    File file = new File("C:/Users/User/git/JavaSalesforce/thisisjava/src/ch18/problem/PhoneDB.txt");
    if(file.exists())
    {
        BufferedReader inFile = new BufferedReader(new FileReader(file));
        String sLine = null;
        
        while( (sLine = inFile.readLine()) != null ) {
          //System.out.println(sLine); //읽어들인 문자열을 출력 합니다.

          String [] temp = sLine.split(",");
          System.out.println("이름 : " + temp[0]);
          System.out.println("핸드폰 : " + temp[1]);
          System.out.println("직장 : " + temp[2]);
          
        }
    }
    
  }

}
