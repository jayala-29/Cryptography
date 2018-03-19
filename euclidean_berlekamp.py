length = 0
gcd = 0
aArray = [None] * 100
pArray = [None] * 100
qArray = [None] * 100

def getGCD(a, b):
  print (a, "= (", b, "*", int(a / b), ") +", a % b)
  aArray[length] = (a / b)
  length = length + 1
  if ((a % b) != 0):
    getGCD(b, a % b)
  else:
    print ("GCD:", b, "\n")
    gcd = b
  
def addToPArray(a):
  pArray[0] = 0
  pArray[1] = 1
  for i in range(length):
    pArray[i+2] = aArray[i] * pArray[i+1] + pArray[i]
    print("p", i, "= (", aArray[i], "*", pArray[i+1], ") +", pArray[i], "=", pArray[i+2])
    if (i == (length - 1)):
      print("\n")
      
def addToQArray(a):
  qArray[0] = 1
  qArray[1] = 0
  for i in range(length):
    qArray[i+2] = aArray[i] * qArray[i+1] + qArray[i]
    print("q", i, "= (", aArray[i], "*", qArray[i+1], ") +", qArray[i], "=", qArray[i+2])
    if (i == (length - 1)):
      print("\n")

def euclidean_berlekamp(a, b):
  k = -1
  print ("EUCLIDEAN ALGORITHM RESULT:\n")
  length = self.length + 1
  getGCD(a, b)
  for i in range(length):
    print("a", i, "=", aArray[i])
  print ("BERLEKAMP ALGORITHM RESULT:\n")
  addToPArray (aArray[0])
  addToQArray (aArray[0])
  for i in range(length):
    k = -1 * k
    
  print ("Linear Combination: (", b, "*", pArray[length], ") - (", a, "*", qArray[length], ") =", (k * gcd))
  
print (euclidean_berlekamp(4576, 615))
