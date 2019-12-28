import random as r 

def enigmaenc(m):
  key = []
  em = []
  for c in m:
    rn = r.randint(-1000, 1000)
    key.append(rn)
    em.append(chr((((ord(c) % 97) + (rn % 26)) % 26)+ 97))
  return (em, key)

def enigmadec(m, k):
  dm = []
  rs = ""
  for i in range(len(m)):
    dm.append((chr((((ord(m[i]) % 97) - (k[i] % 26)) % 26)+ 97)))
  return rs.join(dm)

print (enigmaenc("hello"))
print (enigmadec("bscqx", [46,14,43,5,35]))
