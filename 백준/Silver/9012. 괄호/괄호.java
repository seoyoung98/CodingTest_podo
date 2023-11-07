import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        start:for(int i = 0; i < n; i++){
            int cnt = 0;
            String s = sc.nextLine();
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(c == '('){
                    cnt++;
                }else if(c == ')'){
                    if(cnt <= 0){
                        System.out.println("NO");continue start;
                    }
                    cnt--;
                }
            }
            if(cnt == 0){
                System.out.println("YES");
            }else System.out.println("NO");
        }

    }
}