def solution(n):
    bin_n = int(bin(n)[2:])
    print(bin_n)
    for i in range(n+1, 1000000):
        next_big = int(bin(i)[2:])
        if (str(next_big).count("1") == str(bin_n).count("1")):
            return i