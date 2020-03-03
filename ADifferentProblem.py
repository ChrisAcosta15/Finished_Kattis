import sys

for line in sys.stdin:
	ar = line.split()
	x,y = int(ar[0]),int(ar[1])
	value = x - y
	value = abs(value)
	print(value)