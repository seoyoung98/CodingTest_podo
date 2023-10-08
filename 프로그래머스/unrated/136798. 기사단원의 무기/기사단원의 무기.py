def count_num(n):
    count = 0
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            count += 2
    if((n ** 0.5) % 1 == 0):
        count -= 1
    return count


def solution(number, limit, power):
    answer = 0
    num_list = []
    for i in range(1, number+1):
        if (count_num(i) > limit):
            num_list.append(power)
        else:
            num_list.append(count_num(i))

    return sum(num_list)