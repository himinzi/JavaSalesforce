package ch18.problem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteLineTest {

  public static void main(String[] args) throws IOException {
    File file = new File("C:/Users/User/git/JavaSalesforce/thisisjava/src/ch18/problem/PhoneDB.txt");
    FileWriter fw = new FileWriter(file, true);
    
    
    String contentToBeSaved = null;
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("저장할 텍스트 내용을 입력하세요: ");
    contentToBeSaved = scanner.nextLine();
    
    BufferedWriter bufferedWriter = new BufferedWriter(fw);
    bufferedWriter.write("\n" + contentToBeSaved);
    bufferedWriter.close();
    
    System.out.println("저장이 완료되었습니다.");
    
  }

}
