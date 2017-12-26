##############################################
# Jed-Algorithm Test 1                       #
# O(|ktable[0]| + ... + |ktable[n]|)         #
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



##############################################
# Jed-Algorithm Test 2                       #
# O(|etable[0]| + ... + |etable[n]|)         #
# table network implementation               #
##############################################
# alphabet := table of strings
# etable := encrypted table of ints, entry is at most |ktable| - 1
# ktable := two dimensional table of ints, key
def jedalg2(alphabet, etable, ktable):
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

# should print out the message "abba"
print (jedalg2(["a","b","c"], [4, 0, 0, 4], [[0,1,0,0], [0,0,0,1,0,0], [0,1,0,1], [0,2], [0,0,1]]))



##############################################
# Jed-Algorithm Test 3                       #
# O(|etable[0]| + ... + |etable[n]|)         #
# table network implementation               #
##############################################
# mod etable with alphabet to prevent OOB errors
def jedalg3(alphabet, etable, ktable):
  dmessage = ""
  for eletter in etable:
    counter = 0
    dletter = ""
    ithtable = int(eletter) % len(alphabet)
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

# should print out the message "abba"
print (jedalg3(["a","b","c"], [3, 0, 0, 3], [[0,1,0,0], [0,0,0,1,0,0], [0,1,0,1], [0,2]]))
