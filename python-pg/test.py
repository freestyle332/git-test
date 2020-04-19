left = {"q", "w", "e", "r", "t", "a", "s", "d", "f", "g", "z", "x", "c", "v", "b"}
right = {"y", "u", "i", "o", "p", "h", "j", "k", "l", "n", "m"}
word = "test"
set_word = set(word)
left_bool = bool(set_word.difference(left))
right_bool = bool(set_word.difference(right))
print(left_bool , right_bool)
print (set_word.difference(right))
print (set_word.difference(left))

condition = (3 > 1) and (1 < 1)

if not condition:
    print ('test')