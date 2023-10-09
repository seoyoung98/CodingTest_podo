def solution(babbling):
    answer = 0
    words = ["aya", "ye", "woo", "ma"]

    for i in range(len(babbling)):
        for j in range(len(words)):
            if (words[j] in babbling[i]) and (words[j] * 2 not in babbling[i]):
                babbling[i] = babbling[i].replace(words[j], " ")
                # 해당 단어가 1개만 있으면 없애주기
        babbling[i] = babbling[i].replace(" ", "")
        if (babbling[i] == ""):
            answer += 1

    return answer