##############################################
# Jed-Algorithm Test 1                       #
# O(|etable[0]| + ... + |etable[n]|)         #
# table network implementation               #
##############################################

# alphabet := table of strings
# etable := encrypted table of ints
# ktable := two dimensional table of ints, key
def alg(alphabet, etable, ktable):
  dmessage = ""
  for eletter in etable:
    counter = 0
    dletter = ""
    ithtable = int(eletter)
    while (True):
      print (ithtable, counter, ktable[ithtable][counter])
      if (ktable[ithtable][counter] == 2):
        break
      dletter += str(ktable[ithtable][counter])
      if (ktable[ithtable][counter] == 1):
        ithtable = counter
        counter = 0
      else:
        counter += 1
    dmessage += str(alphabet[int(dletter, 2) % len(alphabet)])
  return dmessage

# should print out the message "b"
print (alg(["a","b","c"], [0], [[0,1,0,0], [0,0,0,1,0,0], [0,1,0,1], [0,2]]))
