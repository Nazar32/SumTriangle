import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {


    public static String read(String path) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        String result = "";

        while (fileReader.ready()) {

            result += fileReader.readLine() + '\n';

        }

        return result;
    }


    public static int[][] stringToIntArray(String s) {

        String[] arr = s.split("\n");
        int[][] result = new int[arr.length][arr[arr.length - 1].length()];


        for (int i = arr.length - 1; i >= 0; i--) {

            String[] row = arr[i].split(" ");

            for (int j = 0; j < row.length; j++) {

                result[i][j] = Integer.parseInt(row[j]);
            }

        }
        return  result;

    }




}
