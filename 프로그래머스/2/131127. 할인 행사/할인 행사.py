def solution(want, number, discount):
    answer = 0
    count = 0
    for i in range(len(discount)):
        use_num = number[:]
        if discount[i] in want:
            for j in range(i, len(discount)):
                if discount[j] in want:
                    index = want.index(discount[j])
                    # print("index ==> " + str(index))
                    if use_num[index] >= 1:
                        # print("여기여기 => ", use_num[index])
                        use_num[index] -= 1
                        count += 1
                    else:
                        # print("여기에 왔다고 ? " + discount[j])
                        break
                elif discount[j] not in want:
                    break    
            # print("count => " + str(count))
            # print("===================")
        if count == 10:
            answer += 1
        count = 0
    
    return answer