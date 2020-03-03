s = input()
s = s.split()

set_pieces = [1,1,2,2,2,8]
output_set = []

i = 0
for game_piece in set_pieces:
	output_set.append(str(game_piece - int(s[i])))
	i += 1

print(' '.join(output_set))