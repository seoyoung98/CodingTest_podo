import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] array;

    public static void main(String[] args) throws IOException {
        // 이분 탐색 문제
        // 이분 탐색을 하기 위해서는 반드시 정렬이 되어있어야 한다.
        // 중간 인덱스를 찾고 값이 중간 값보다 작다면 왼쪽 부분, 값이 중간 값보다 크다면 오른쪽 탐색

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 읽은 줄이 array의 개수
        int n = Integer.parseInt(br.readLine());
        array = new int[n];

        // java에서 입력 스트림에서 한 줄을 읽고, 공백을 구분자로 사용하여 문자열을 토큰으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++){
            // StringTokenizer 객체 st에서 다음 토큰을 가져와서 정수로 변환한 후, 배열 array의 해당 인덱스에 저장
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        // 이제 위의 array 안에 다음 수들이 존재하는지 알아내면 된다.
        // 일단 개수를 입력 받으면
        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

//        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            // 찾는다.
            // 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
            if(serachNumber(Integer.parseInt(st.nextToken())) >= 0) {
//                sb.append(1).append('\n');
                System.out.println(1);
            }
            else {
//                sb.append(0).append('\n');
                System.out.println(0);
            }
        }
//        System.out.println(sb);

    }

    public static int serachNumber(int key){
        int left = 0; // 왼쪽 끝 인덱스
        int right = array.length - 1; // 오른쪽 끝 인덱스

        while(left <= right){
            int mid = (left + right) / 2; // 중간 위치를 구한다.

            // key 값이 중간 위치의 값보다 작을 경우
            if(key < array[mid]){
                right = mid - 1; // 끝 인덱스가 중간 값보다 바로 작은 수 당첨
            }
            else if(key > array[mid]){
                left = mid + 1;
            }

            else {
                return mid;
            }
        }

        // 찾는 수가 없을 경우
        return -1;
    }


}