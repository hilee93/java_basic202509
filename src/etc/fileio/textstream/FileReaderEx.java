package etc.fileio.textstream;

import etc.fileio.FileExample;

import java.io.File;
import java.io.FileReader;

public class FileReaderEx {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader(FileExample.ROOT_PATH + "/merong.txt")) {
//            fr.read(); 한 글자씩 읽어 들이기
            char[] arr = new char[100];
            int result = fr.read(arr);
            System.out.println("문자의 개수: " + result);

            for(int i = 0; i < arr.length; i++){
                System.out.print((char)arr[i]);
                if(arr[i]==0) break;
            }
            System.out.println(" ");
            for (char c : arr) {
                System.out.print(c);
                if(c == 0) break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
