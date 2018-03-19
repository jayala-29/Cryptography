def check_dup(ls):
  ls = sorted(ls)
  for i in range(len(ls) - 1):
    if (ls[i] == ls[i+1]):
      return True
  return False

def find_prim_root(m):
  i = 2
  num_list = []
  while(True):
    print("\nCHECK IF", i, "IS A PRIMITIVE ROOT")
    for num in range(1, m):
      print(i, "^", num, "mod", m, "=", (i ** num) % m)
      num_list.append((i ** num) % m)
      if (num == m - 1):
        if check_dup(num_list) == False:
          return i
    num_list = []
    i = i + 1
    
# parameter is the # you want the primitive root of
print (find_prim_root(19))
