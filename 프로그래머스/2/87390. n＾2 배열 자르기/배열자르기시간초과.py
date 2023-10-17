'''
2차원 행렬을 만들어서 풀었더니 시간초과 미쳤다!!
'''
def matrix(n, left, right):

    # 요거슨 되긴 한디 시간초과가 뜬다.
    # 1x1 매트릭스 생성
    matrix = [[0 for row in range(n)] for col in range(n)]

    # n * n
    for i in range(1, n + 1):
        for row in range(i):
            for col in range(i):
                max_num = max(row, col)
                matrix[row][col] = max_num + 1

    new_list = []
    for i in range(n):
        for j in range(n):
            new_list.append(matrix[i][j])
    return new_list[left:right + 1]
