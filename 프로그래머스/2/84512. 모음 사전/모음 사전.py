from itertools import product


def solution(word):
    word_list = ['A', 'E', 'I', 'O', 'U']

    word_word_list = []

    # 1글자
    for w in word_list:
        word_word_list.append(w)

    # 2 글자
    for i in product(word_list, repeat=2):
        word_word_list.append(''.join(i))

    # 3 글자
    for i in product(word_list, repeat=3):
        word_word_list.append(''.join(i))

    # 4 글자
    for i in product(word_list, repeat=4):
        word_word_list.append(''.join(i))

    # 5 글자
    for i in product(word_list, repeat=5):
        word_word_list.append(''.join(i))

    word_word_list.sort()

    return word_word_list.index(word)+1