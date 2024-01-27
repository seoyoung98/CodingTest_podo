import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            array[i] = num;
        }

        Arrays.sort(array);

        for(int arr : array){
            System.out.println(arr);
        }

    }
}