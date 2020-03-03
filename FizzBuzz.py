import sys

for line in sys.stdin:
	ar = line.split()
	x,y,n = int(ar[0]),int(ar[1]),int(ar[2])
	for i in range(1,n+1):
		if i % x == 0 and i % y == 0:
			print("FizzBuzz")
			continue
		elif i % x == 0:
			print("Fizz")
			continue
		elif i % y == 0:
			print("Buzz")
			continue
		print(i)