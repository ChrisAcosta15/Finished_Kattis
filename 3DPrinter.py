from math import log, ceil

n = int(input())
days = 1 + ceil(log(n, 2))
print(days)