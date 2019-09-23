def convert_timestamp_to_seg(h,m,s):
    return abs(h*3600)+abs(m*60)+abs(s)

def convert_seg_to_timestamp(s):
    #Uso divmod para conseguir el cociente y el resto , lo hago dos veces 
    minu, seg = divmod(abs(s), 60) 
    hora, minu = divmod(minu, 60) 
    return (hora, minu, seg) 

def triangular_numbers(n):
    nt = []
   # Originalmente tenia dos for , pero me acorde de lo que anotaste en el pizarron
    for i in range (1 , n +1): 
        nt.append((i ** 2 + i)//2)
    return nt
        
def even_numbers_between(n , p):
    enum = []
    #Averiguo si el reso es cero y lo agrego a la lista
    for i in range (n , p+1):
        if (i % 2) == 0:
            enum.append(i)
 
    return enum

def factorial(n):
    fac = 1
    for i in range(1 , n+1):
        fac = fac * i
    return fac