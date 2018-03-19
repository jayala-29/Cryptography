def compute_mod(a, m):
  print ("COMPUTE", a, "MOD", m)
  print (a, "/", m, "=", int(a / m))
  print (a, "-", int(a / m), "*", m, "=", a - int(a / m) * m, "\n")

def gcd(a, b):
    while b:
        a, b = b, a%b
    return a

def jacobi_symbol(a, n):
  if (a == 1):
    return 1
  elif (gcd(a, n) != 1):
    return 0
  elif (a % 2 == 0):
    print("EVEN CASE")
    print("power of -1:", int((n * n - 1) / 8))
    print("(-1)^", int((n * n - 1) / 8), "* J(", int(a / 2), ",", n, ")\n")
    return ((-1) ** int((n * n - 1) / 8)) * jacobi_symbol(int(a / 2), n)
  else:
    print("ODD CASE")
    print("power of -1:", int((((a - 1) * (n - 1)) / 4)))
    print("(-1)^", int((((a - 1) * (n - 1)) / 4)), "* J(", n % a, ",", a, ")\n")
    compute_mod(n, a)
    return ((-1) ** int((((a - 1) * (n - 1)) / 4))) * jacobi_symbol(n % a, a)
    
print (int(jacobi_symbol(19748, 214901)))
