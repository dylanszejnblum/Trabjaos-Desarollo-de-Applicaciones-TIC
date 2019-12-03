#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Nov 14 07:58:57 2019

@author: dylanszejnblum
"""
from ListaEnlazadaTest import * 
l2 = [1,3,4,5,7]
def ordenar(l):
   nume = len(l) -1
   for i in range(len(l) // 2):
       if i < nume:
           swap(l,nume,i)
        
   return l 

    


def swap(L,i1,i2): 
    tmp = L[i1]
    L[i1] = L[i2]
    L[i2] = tmp

def organizar(dic):
    lDias = []
    for i in range(1 , 31):
        lDias.append(i)
    for amigo , dias in dic.items():
       for dia in dias: 
          for n_dia in lDias:
              if dia == n_dia:
                  lDias.remove(dia)
    return lDias
    
def duplicar(self , elem):
     actual = self.prim
     nodo = Nodo(elem)
     while actual:
         nodo = Nodo(elem, actual.next)
         if actual == nodo:
             if nodo == self.utl:  
                 self.ult = nodo
                 actual.next = nodo
                 self.len += 1
             else: 
                 actual.next = nodo
                 actual = nodo.next
                 self.len += 1
         else:
            actual = actual.next