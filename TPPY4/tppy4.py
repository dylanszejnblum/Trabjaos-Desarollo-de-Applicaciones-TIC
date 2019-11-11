#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Nov  2 13:01:23 2019

@author: dylanszejnblum
"""

def tuplas_a_diccionario(l):
    dic = dict()
    for elem in l:
        if not elem[0] in  dic:
            dic[elem[0]] = [elem[1]]
        else:
            dic[elem[0]].append(elem[1])
        
    return dic
               
            

def cantidad_apariciones_palabra(s):
    listaPalabras =[]
    dic = dict()
    st = s.lower()
    listaPal = st.split()
    for palabra in listaPal:
        if palabra not in listaPalabras:
            listaPalabras.append(palabra)
    for palabrita in range(0,len(listaPalabras)):
        ##print(listaPal.count(listaPalabras[palabrita]))
       ## dic[str(palabrita)] = listaPal.count(listaPalabras.index(palabrita))
       dic[listaPalabras[palabrita]] = listaPal.count(listaPalabras[palabrita])
    return dic
def cadena_mas_larga(s):
       dic = dict()
       se = s.lower()
       oracion = se.split()
       for word in oracion:
           for letter in word:
               current_word = dic.get(letter,"")
               if len(word) >= len(current_word):
                   dic[letter] = word
       return dic
               

def duracion_playlist(dic1,dic2):
   dic = dict()
   for playlist , songs in dic2.items():
       l =[]
       for song , duration in dic1.items():
           if song in songs:
               l.append(duration)
           dic[playlist] = sum(l)           
   return dic

          