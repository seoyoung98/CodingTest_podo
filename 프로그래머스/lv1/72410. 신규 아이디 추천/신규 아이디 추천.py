import re

def solution(new_id):
    # 1. 대문자 -> 소문자
    new_id = new_id.lower()
    # 2. 소문자, 숫자, -, _, . 를 제외한 모든 문자 제거
    pattern = r'[^a-zA-Z0-9-_.]'
    new_id = re.sub(pattern, '', new_id)
    # 3. .가 2개 이상이면 한개로 만들기
    while '..' in new_id:
        new_id = new_id.replace('..', '.')
    # 4. .가 처음이나 끝에 위치하면 제거
    if (new_id[0] =='.'):
        new_id = new_id[1:] if len(new_id) > 1 else '.'
    if (new_id[-1] =='.'):
        new_id = new_id[:-1]

    # while new_id[0] == '.' or new_id[-1] == '.':
    #     if (new_id[0] == '.'):
    #         new_id = new_id[1:]
    #     if (new_id[-1] == '.'):
    #         new_id = new_id[:-1]
    
    # 5. 빈 문자열이면 a를 대입
    if (len(new_id) == 0):
        new_id += 'a'
    # 6. 16자 이상이면 첫 15개를 제외한 나머지 문자 모두 제거
    # 제거한 후 .가 처음이나 끝에 위치한다면 제거
    if (len(new_id) >= 16):
        new_id = new_id[:15]
        if (new_id[-1] == '.'):
            new_id = new_id[:-1]
    # 7. 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복해서 붙인다.
    while len(new_id) < 3:
        new_id += new_id[-1]

    return new_id
