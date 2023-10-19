package codingtest;

public class Sosu {
        public static boolean bin(int n) {
                int b = 0;
                for(int i = 2; i <= (int)Math.pow(n, 0.5); i++) {
                        if(n % i == 0) {
                                b++;
                                break;
                        }
                }
                if(b == 0) return true;
                else return false;
                
        }
        public static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
            if(r == 0) {
                print(arr, visited, n);
                return;
            } 

            for(int i=start; i<n; i++) {
                visited[i] = true;
                combination(arr, visited, i + 1, n, r - 1);
                visited[i] = false;
            }
        }
        
        public static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
        
        public static int solution(int[] nums) {
                int answer = 0;
                for(int i = 0; i < nums.length; i++) {
                        combination(nums, , i, answer, answer);
                }

                return answer;
        }

        public static void main(String[] args) {
                int[] nums = {1,2,3,4};
                System.out.println(solution(nums));
        }
}
