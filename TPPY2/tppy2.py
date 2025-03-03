#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""

@author: dylanszejnblum
"""

vocales = ['a' , 'e' , 'i' , 'o', 'u']
vocalistico = 'aeiou'
vocalesNegras = ['a' , 'e' , 'i' , 'o', 'u' , ' ' , '.']
def primos(n):
   priList = []
   for i in range (2 , n+1):
       if calcPrimo(abs(i)) == True:
           priList.append(i)
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
    n &= (2 << 8-1)-1  
    formatStr = '{:0'+str(8)+'b}' 
    ret = formatStr.format(int(n)) 
    return ret 


             
def ReversoString(s):
    return s[::-1] 
def capicuba(s):
    palabra = s.replace(' ', '') ##Tene en cuenta los espacios , cuidadito wazowski
    sDadaVuelta = ReversoString(palabra)
    print(sDadaVuelta ,palabra)
    if palabra.lower() == sDadaVuelta.lower():
        return True
    else:
        return False


## Hago un foreach , donde busco la letra en vocales y en el caso de las
## Consonantes niego la condicion 
def findConsonantes(s):
    palabra = [each for each in s.lower() if not each in vocales] 
    resultado = ''.join(map(str,palabra))
    return resultado  

def findVocales(s):
    palabra = [each for each in s.lower() if each in vocalesNegras] 
    resultado = ''.join(map(str,palabra))
    return resultado  
def cambiarVocal(s):
        palabra = ''
        stringo = s.lower()
        for letra in stringo:
            if letra in vocalistico:
                i = vocalistico.index(letra) + 1
                if (i >= 5):
                    i = 0
                palabra += vocalistico[i]
            else:
                palabra += letra
        return palabra
                
          ## return result+=i
            
               
    ##return palabraCortada
def operate_string(case , w):
    if case == 1:
        return findConsonantes(w)
    elif case == 2:
        return findVocales(w)
    elif case == 3:
        return cambiarVocal(w)
    elif case == 4:
       return capicuba(w)
    else:
       return "order not found”"
   
    


   