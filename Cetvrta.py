x = set()
y = set()
for i in range(3):
	q = [int(n) for n in input().split()]
	if q[0] in x:
		x.remove(q[0])
	else:
		x.add(q[0])
	if q[1] in y:
		y.remove(q[1])
	else:
		y.add(q[1])

print(x.pop(), y.pop())