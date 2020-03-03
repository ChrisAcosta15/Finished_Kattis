people = input()
people = int(people)
rollsInput = input().split(' ')
rolls = []
sortedrolls = []
for i in rollsInput:
	i = int(i)
	rolls.append(i)
	sortedrolls.append(i)

sortedrolls.sort()
temp = 0
for i in range(len(sortedrolls) - 1):
	if sortedrolls[i] != sortedrolls[i+1]:
		temp = sortedrolls[i+1]

if temp == 0:
	print("none")
else:
	for i in range(len(rolls)):
		if rolls[i] == temp:
			print(i+1)