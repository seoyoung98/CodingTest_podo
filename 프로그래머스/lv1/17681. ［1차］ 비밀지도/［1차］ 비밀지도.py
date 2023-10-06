'''
비상금 숨겨놓는 장소 => 비밀지도
비밀 지도 암호 해독하기
한 변의 길이가 n인 정사각형 배열 형태, 각 칸은 공백, 벽(#) 두 종류
전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 
어느 하나라도 벽인 곳은 전체 지도에서도 벽 |
두 지도 모두에서 공백인 부분은 전체 지도에서도 공백 & 
0, 1 => 1
1, 1 => 1
0, 0 => 0

1 => 벽
0 => 공백 

'''
    
def solution(n, arr1, arr2):
    answer = []
    arr1_list = []
    arr2_list = []
    for i in range(n):
        value = bin(arr1[i])[2:]
        if(len(value) < n):
            value = "0"*(n-len(value)) + value
        arr1_list.append(value) # string
        
    for i in range(n):
        value = bin(arr2[i])[2:] # 2진법으로 변환 
        if(len(value) < n):
            value = "0"*(n-len(value)) + value
        arr2_list.append(value) # string
    
    
    for i in range(n): # 0,1,2,3,4
        word = ""
        for j in range(len(arr1_list[i])):
            for k in range(len(arr2_list[i])):
                if(j == k):
                    if(arr1_list[i][j] == "0" and arr2_list[i][j] == "0"):
                        word += " "
                    elif(arr1_list[i][j] == "1" or arr2_list[i][j] == "1"):
                        word += "#"
        answer.append(word)
        
    return answer