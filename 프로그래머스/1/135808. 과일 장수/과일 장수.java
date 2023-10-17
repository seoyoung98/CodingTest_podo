/*
	 * 사과 상태에 따라 1점부터 k점까지 점수로 분류 k점이 제일 높은 점수 한 상자에 사과 m개씩 가장 낮은 점수가 p인 경우 한
	 * 상자의 가격은 p*m 가능한 많은 사과를 팔았을 때 얻을 수 있는 최대 이익을 계산
	 * 
	 * 정렬해서 맨 마지막부터 빼내기 과일 장수가 얻을 수 있는 최대 이익을 return
	 * 
	 * 점수 비교도 해줘야함
	 */
import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
		Arrays.sort(score);
		int[] fruit_box = new int[m];
		int idx = 0;
		for(int i = score.length-1;i>=0;i--) {
			fruit_box[idx] = score[i];
			if(idx == m-1) {
				Arrays.sort(fruit_box);
				answer += Math.min(k, fruit_box[0])*m;
				idx = 0;
			}
			else {
				idx++;
			}
		}
		
		return answer;
    }
}