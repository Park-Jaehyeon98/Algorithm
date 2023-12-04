def solution(left, right):
    answer = 0
    cnt = 1
    for j in range(left, right+1):
        for i in range(1, j//2 + 1):
            if j % i == 0:
                cnt += 1
        if cnt % 2 == 0:
            answer += j
            print(j)
        else:
            answer -= j
        cnt = 1
    return answer