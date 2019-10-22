#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct 18 14:21:08 2019

@author: dylanszejnblum
"""

def repeticiones_consecutivas(l):
    listaTulpas = []
    repe = 0
    posicione = l[0]
    for num in l:
        if num == l[0]:
            repe+=1 ## a ver la repe
        else:
            listaTulpas.append((posicione , repe))
            posicione = num
            repe = 1
        return listaTulpas
def empaquetar(l , n):
    l_nueva = l.replace(" ", "")
    resu = [l_nueva[letra:letra+n] for letra in range(0,len(l_nueva),n)]
    ## Demasiado negro , arreglarlo despues
    return resu

def invertir(l):
    return l[::-1]

def invertir_inplace(L):
    return L 

def multiplicar(s):
    return s*50
def _map(f,l):
    result = []
    for element in l:
        result.append(f(element))
    return result


def es_par(x):
    if(x%2 == 0):
        return True
    else:
        return False
def _filter(f,l):
    resu = []
    for i in l:
        if f(i) == True:
            resu.append(i)
    return resu