n = int(input())
customer =  list(map(int, input().split()))
leader, employee = map(int,input().split())

cnt = 0
for i in range(n):
    customer[i] -= leader
    cnt += 1
    if customer[i] > 0:
        k = customer[i] // employee
        if customer[i] % employee == 0:
            cnt += k
        else:
            cnt = cnt + 1 + k
print(cnt)