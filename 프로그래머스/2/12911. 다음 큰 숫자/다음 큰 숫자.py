def solution(n):
    binary_n = int(bin(n)[2:])
    b_count = str(binary_n).count("1")
    i = 1
    while True:
        next = int(bin(n+i)[2:])
        if str(next).count("1") == b_count:
            return n+i
        i += 1

# def solution(n):
#     bin_n = int(bin(n)[2:])
#     print(bin_n)
#     for i in range(n+1, 1000000):
#         next_big = int(bin(i)[2:])
#         if (str(next_big).count("1") == str(bin_n).count("1")):
#             return i