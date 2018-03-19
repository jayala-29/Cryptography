from decimal import Decimal

def repeated_squares(n, k, m):
  num_list = binarysum(k)
  product = 1
  prod_list = []
  twos = power_find(k)
  twos_nmod = []
  twos_mod = []
  print("BINARY SUM FOR: ", k)
  print (twos)
  print (num_list)
  curr = 2
  curr_m = n
  twos_nmod.append(n ** 2)
  print ("\nPOWERS OF 2:")
  while (curr < num_list[len(num_list) - 1]):
    twos_nmod.append('%.2E' % Decimal(((n ** curr) % m) ** 2))
    twos_mod.append((n ** curr) % m)
    print (curr)
    curr = curr * 2
  print("\n")
  print (n, "^k: ", twos_nmod)
  print (n, "^k", "(mod ", m, "): ", twos_mod)
  for num in num_list:
    prod_list.append((n ** num) % m)
    product = (product * (n ** num)) % m
  print ("\nPRODUCT LIST: ", prod_list)
  print ("PRODUCT RESULT: ", product)
  return
  
  
def binarysum(x):
    powers = []
    i = 1
    while i <= x:
        if i & x:
            powers.append(i)
        i <<= 1
    return powers
    
def power_find(n):
    result = []
    binary = bin(n)[:1:-1]
    for x in range(len(binary)):
        if int(binary[x]):
            result.append(x)
    return result
    
# for n^k(mod m)
# first parameter: n
# second parameter: k
# third parameter: m
print (repeated_squares(189, 3145, 9283))
