Universidad de San Carlos de Guatemala 

Facultad de Ingeniería 

Escuela de Ciencias y Sistemas Organización de Lenguajes y Compiladores 1 

Primer Semestre 2022 


Tutores Académicos 

  Emely Yecenia Garcia Monge 

  Jose Eduardo Moran Reyes 

  Moisés Gonzalez Fuentes 

  Jose Fernando Guerra Muñoz 

  
   ExpAnalyzer 

    Proyecto 1 



-------------------------
        Gramatica
-------------------------

S -> S A
    | A
A -> {B}
B -> B C
    | C
C -> definirconjuntos
    | definirexpresionregular
    | dobleporciento
definirconjuntos -> CONJUNTO DOSPUNTOS ID MENOS MAYOR notacionconjuntos PUNTOYCOMA
notacionconjuntos -> E
                    | F
E -> E COMA LETRA
    | E COSO_N LETRA
    | LETRA
F -> F COMA DIGITO
    | F COSO_N DIGITO
    | DIGITO
definirexpresionregular -> ID MENOS MAYOR er PUNTOYCOMA
er -> er H
    | H
H -> PUNTO
    | MAS
    | POR
    | OR
    | INTE_C
    | I
I -> { J }
    | CADENA
J -> LETRA
    | DIGITO
    | ID
dobleporciento -> DPORCIENTO DPORCIENTO expresionregularaevaluar
                | expresionregularaevaluar
expresionregularaevaluar -> ID DOSPUNTOS CADENA PUNTOYCOMA
