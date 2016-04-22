import java.io.IOException;

public class FindSum {

    private  final int[][] triangle ;


    public FindSum() throws IOException {

        triangle = ReadFile.stringToIntArray(ReadFile.read("input.txt"));

    }

    private  int[][] copy(int[][] arr) {

        int [][] copy = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                copy[i][j] = arr[i][j];
            }
        }

        return copy;
    }

    public  int sumCalc(int [][] triangle) throws IOException {

        int [][] new_triangle = copy(triangle);

        for (int i = triangle.length - 2; i >= 0 ; i--) {

            for (int j = 0; j < i + 1; j++) {

                new_triangle[i][j] += Math.max(new_triangle[i + 1][j], new_triangle[i + 1][j + 1]);
            }

        }

        return new_triangle[0][0];

    }

    public static void main(String[] args) {



        try {

            FindSum findSum = new FindSum();
            System.out.println(findSum.sumCalc(findSum.triangle));

        }

        catch (IOException e) {
            e.printStackTrace();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}
