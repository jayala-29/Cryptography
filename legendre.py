def legendre(a, p):
  if (p % a == 0):
    return 0
  return (a ** int(((p - 1) / 2))) % p
  
print (legendre(9, 97))
