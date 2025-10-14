package etc.fileio.buffered;

import etc.fileio.FileExample;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FileExample.ROOT_PATH + "/fout.txt"))) {
            // readLine() : 한 줄을 통재로 읽어서 Stringㅇ로 리턴해 줍니다.
            // 더이상 읽어들일 데이터가 없다면 null을 리턴.
            String str;
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
