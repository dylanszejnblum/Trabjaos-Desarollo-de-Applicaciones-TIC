#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Nov 11 19:34:53 2019

@author: dylanszejnblum
"""

class Nodo:
    def __init__(self,v=None, next=None):
        self.v = v
        self.next = next
        
    def __str__(self):
        print(self)
        return (self.v)
        
    def ver_siguientes(self):
        while self:
            print(self)
            self=self.next
            
class ListaEnlazada:
    def __init__(self):
        self.prim=None
        self.ult=None
        self.len=0
    def esta_vacia(self):
        return self.prim is None
    def __len__(self):
        if self.esta_vacia():
            return 0
        inicio = self.prim
        contador = 0
        while inicio is not None:
            contador += 1
            inicio = inicio.next
        return contador
    def __iter__(self):
        actual = self.prim
        while actual is not None:
            yield actual.v
            actual = actual.next
    def __str__(self):
        lista = []
        inicio = self.prim
        for i in range(self.len):
            lista.append(inicio.v)
            inicio = inicio.next
        return repr(lista)
    def pop(self , index = None):
        nodo_anterior=None
        if index is None:
            index = self.len -1
        if not (0 <= index < self.len):
            raise IndexError("Index out of range")
        if index == 0:
            dato = self.prim.v
            self.prim = self.prim.next
        else:
            nodo_anterior = self.prim
            nodo_actual = nodo_anterior.next
            for pos in range (1 , index):
                nodo_anterior = nodo_actual
                nodo_actual = nodo_anterior.next
            dato = nodo_actual.v
            nodo_anterior.next = nodo_actual.next
        if index==self.len-1:
            self.ult=nodo_anterior
        self.len -=1    
        return dato
    def remove(self, elem):
        if self.len == 0:
            raise ValueError("vacio kpo")
        elif self.prim.v == elem:
            self.prim = self.prim.next
        else:
            nodo_anterior = self.prim
            nodo_actual = nodo_anterior.next
            
            while nodo_actual != None and nodo_actual.v != elem:
                nodo_anterior = nodo_actual
                nodo_actual = nodo_anterior.next
            if nodo_actual == None:
                raise ValueError('el valor')
            else:
                nodo_anterior.next = nodo_actual.next
            self.len -=1
            if self.ult.v==elem:
                self.ult=nodo_anterior
  
    def insert(self,index,elem):
        if elem is None:
            raise TypeError("Y ESTE")
        if index < 0 or index > self.len:
            raise IndexError('List index out of range')
        if index == self.len:
           self.append(elem)
           return
        
        if index == 0:
            if self.prim is None:
                n = Nodo(elem)
                self.prim = n
                self.ult = n
                n.next = None
                self.len += 1
                return
            else:
                n = Nodo(elem)
                aux = self.prim
                self.prim = n
                self.prim.next = aux
                self.len += 1
                return
        if index is None:
            raise TypeError("tt")
        else:
            anterior=self.prim
            actual= anterior.next
            for thing in range(1,index):
                anterior = actual
                actual = actual.next
       
            n = Nodo(elem)
            n.next = actual 
            anterior.next = n  
            
            self.len += 1
            return
    def index(self,elem):
        if self.len==0:
            return
        v_actual = self.prim
        for pos in range (0,self.len):
            if v_actual.v == elem:
                return pos
            else:
                if v_actual!=self.ult:
                    v_actual = v_actual.next
                else: 
                    return
        return
    def append(self , elem):
        nodo_nuevo = Nodo(elem)
        if self.len == 0:
            self.len = 1
            self.ult = nodo_nuevo
            self.prim = nodo_nuevo
            return
        self.ult.next = nodo_nuevo
        self.ult = nodo_nuevo
        self.len += 1
        return 
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
            
                 self.len += 1
            
     actual = actual.next
    
    def _filter(self,f):
        listaFinal=ListaEnlazada()
        for l in self:
             if f(l) == True:
                 listaFinal.append(l)
        return listaFinal.__str__()
            
    
    def extend(self ,lista2):
     varAuxiliar=lista2.prim
     for i in range(lista2.len):
         if (self.len>0):
             self.ult.next=varAuxiliar
             self.ult=varAuxiliar
         else:
            self.prim=varAuxiliar
            self.ult=varAuxiliar
         varAuxiliar=varAuxiliar.next
         self.len+=1
         
  
         
         
    def es_par(x):
        if(x%2 == 0):
            return True
        else:
            return False
    def invertir_lista(self):
        anterior = None 
        actual = self.prim
        sig = actual.next
        while actual:
            actual.next = anterior
            
            anterior = actual
            actual = sig
            if sig:
                sig = sig.next
                
            self.prim = anterior
lesto1=ListaEnlazada()
lesto1.append('pepe')
lesto1.append('tito')
lesto1.append('tinchovich')
lesto1.append('picantovich')
lesto1.append('ake')
lesto1.append('da') 

lestovich=ListaEnlazada()
lestovich.append(1)
lestovich.append(2)
lestovich.append(3)
lestovich.append(4)
lestovich.append(5)
lestovich.append(6) 

lista=ListaEnlazada()
lista.append('dylan')
lista.append('dyla')
lista.append('dyl')
lista.append('dy')
lista.append('dyl')
lista.append('d')    
nodo = Nodo('1')