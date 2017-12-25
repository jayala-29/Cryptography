def ecaesar(dmessage, shift):
  emessage = ""
  alphabet = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
  dmessage = dmessage.lower()
  for dletter in dmessage:
    if (dletter == " "):
      emessage += " "
    else:
      for i in range(0, 26):
        if (dletter == alphabet[i]):
          emessage += alphabet[(i + shift) % 26]
          break
  return emessage
  
def dcaesar(emessage, shift):
  dmessage = ""
  alphabet = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
  emessage = emessage.lower()
  for eletter in emessage:
    if (eletter == " "):
      dmessage += " "
      continue
    else:
      for i in range(0, 26):
        if (eletter == alphabet[i]):
          dmessage += alphabet[(i - shift) % 26]
          break
  return dmessage
  
print (ecaesar("This is a secret message", 3))
print (dcaesar(ecaesar("this is a secret message", 3), 3))
