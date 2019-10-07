vocales = ['a' , 'e' , 'i' , 'o', 'u']
def primos(n):
   priList = []
   if  calcPrimo(abs(n)) != True:
       return False
   elif n < 0 :
       return priList
       
   else:
        for i in range (0 , n):
            if calcPrimo(i) == True:
                priList.append(i)
                
   priList.appabsend(n)
                
   return (priList)
        


#Asumo que un numero es primo d e por si , y a partir de aho chequeo
def calcPrimo(a):
    x = True
    for i in range(2, a):
       if a%i == 0: 
           x = False
           break
    if x:
        return True
    else:
       return False


# Paso el string a int que estaba en base 2 a un int decimal
def bin_to_dec(s):
    try:
        return (int(s, 2))
    except ValueError:
        return -1
  


def dec_to_bin(n):
        if n>=0:
                numeBinario = bin(n).split("0b")[1]
                while len(numeBinario)<8 :
                        numeBinario = '0'+numeBinario
                return numeBinario
        else:
                numeBinario = -1*n
                return bin(n-pow(2,8)).split("0b")[1]

def ReversoString(s):
    return s[::-1] 
def capicuba(s):
    
    sDadaVuelta = ReversoString(s).lower()
    if s == sDadaVuelta:
        return True
    else:
        return False


def findConsonantes(s):
      palabraCortada = list(s).lower()
      return list(set(palabraCortada).difference(set(vocales)))
def findVocales(s):
    palabraCortada = list(s).lower()
    return list(set(palabraCortada)&set(vocales))
def cambiarVocal(s):
    palabraCortada = list(s).lower()
    for vocal in palabraCortada: 
        if vocal in vocales:
            try:
                palabraCortada.replace(vocal ,vocales[vocal+1] )
            except ValueError:
                pass
    return palabraCortada
def operate_string(case , w):
    switch = {
      1: findConsonantes(w)
   }
    return switch.get(case, "Num iNVALIDO")



