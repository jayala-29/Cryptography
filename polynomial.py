def repeat(x,n):
  power = x
  for i in range(0,n-1):
    x *= power
  return x
  
def compute(arr,x):
  result = 0
  for num in arr:
    if num > 0:
      result += repeat(x, num)
    elif num < 0:
      result -= repeat(x, -num)
    else:
      result += 1
  return result
  
print compute([6,-4,3,-1,0],-2)

# computes (-2)^6 - (-2)^4 + (-2)^3 - (-2) + 1 
