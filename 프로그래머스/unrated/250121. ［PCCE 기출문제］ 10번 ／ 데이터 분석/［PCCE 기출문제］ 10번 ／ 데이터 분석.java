import java.util.*;
class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();
        int standard_ext = 0;
        switch (ext){
            case "code":
                standard_ext = 0; break;
            case "date":
                standard_ext = 1; break;
            case "maximum":
                standard_ext = 2; break;
            case "remain":
                standard_ext = 3; break;
            default:
                break;
        }
        int standard_sort = 0;
        switch (sort_by){
            case "code":
                standard_sort = 0; break;
            case "date":
                standard_sort = 1; break;
            case "maximum":
                standard_sort = 2; break;
            case "remain":
                standard_sort = 3; break;
            default:
                break;
        }
        final int sort_stand = standard_sort;
        // data select
        for(int i = 0; i < data.length; i++){
            if(data[i][standard_ext] < val_ext) {
                answer.add(data[i]);
            }
        }

        // data sort
        // *lambda, Comparator 사용시 final 이나 effectively final여야한다!
        answer.sort((o1, o2) -> o1[sort_stand] - o2[sort_stand]);

        return answer;
    }
}