def solution(n, words):
    answer = []
    speak_list = []
    speak_list.append(words[0])
    for i in range(1,len(words)):
        student = (i % n) + 1
        test = i // n + 1
         # 앞에서 말했는지 확인하고 밑에 확인하기
        if words[i] in speak_list: # 앞에서 나오면 리턴하기 
            answer.append(student)
            answer.append(test)
            break
        else: # 앞에서 말했으면 확인하기
            speak_list.append(words[i])
            if words[i-1][-1] != words[i][0]: # 끝말이 이어지지 않으면
                answer.append(student)
                answer.append(test)
                break
    if len(answer) == 0:
        return [0,0]
    else:
        return answer