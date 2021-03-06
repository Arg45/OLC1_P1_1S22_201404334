package Analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;

import Proyecto1.Index;


%%
%{

    Index i = new Index();
/*
    
    public static LinkedList<Token> ListaTokens = new LinkedList<Token>();

    public static LinkedList<Tabla_error> ListaErroresLexicos = new LinkedList<Tabla_error>();


    public LinkedList<Tabla_error> getlistaErroresLexicos() {
        return A_Lexico.ListaErroresLexicos;
    }
    public LinkedList<Token> getlistaTokens() {
        return A_Lexico.ListaTokens;
    }
*/

%}

%cupsym Simbolos
%class A_Lexico
%cup
%public
%unicode
%line
%column
%char
%ignorecase

%full

%state 



LLAVE_A = "{"
LLAVE_C = "}"
COMILLASIM = "\'"
COMILLADOB = "\""
MENOR = "<"
MAYOR = ">"
PUNTO = "."
COMA = ","
PUNTOYCOMA = ";"
DOSPUNTOS = ":"
ADMI_C = "!"
INTE_C = "?"
MAS = "+"
MENOS = "-"
POR = "*"
DIV = "/"
CONTRADIV = "\\"
OR = "|"
PORCIENTO = "%"

COSO_N = "~"


IGUAL = "="
CORH_A = "["
CORH_C = "]"
PAR_A = "("
PAR_C = ")"



CONJUNTO = "CONJ"

DPORCIENTO = PORCIENTO PORCIENTO
//DIGITO = [+|-]?[0-9]+  
DIGITO = [0-9]+(.[0-9]+)*
LETRA = [A-Za-zñÑ]+
NOTA_CONJ = COSO_N LETRA
ID  = {LETRA}("~"|{LETRA}|{DIGITO}|"_")*

//CADENA = (" \" " [^\"] " \" ")
CADENA = ([\"][^\"\n]*[\"]) | ([\'][^\"\n]*[\'])

LineTerminator  = \r|\n|\r\n
InputCharacter = [^\r\n]

//COMENTARIO_LINEA = "//" [^\r\n]
COMENTARIO_LINEA = "//" "/"* {InputCharacter}* ENTER
//({LineTerminator}|{ENTER})*
COMENTARIO_VARIASL = ("<!" [^/] "!>")

SPACE   = [ \t\r\n\f] | [\ \r\t\f\t]
ENTER   = [ \n]


%%
<YYINITIAL> {LLAVE_A}            { System.out.println("Reconocio "+yytext()); i.txt_salida.setText(yytext()); return new Symbol(Simbolos.LLAVE_A, yyline, yycolumn,yytext());}
<YYINITIAL> {LLAVE_C}            { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.LLAVE_C, yyline, yycolumn,yytext());}
<YYINITIAL> {COMILLASIM}         { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.COMILLASIM, yyline, yycolumn,yytext());}
<YYINITIAL> {COMILLADOB}         { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.COMILLADOB, yyline, yycolumn,yytext());}
<YYINITIAL> {MENOR}              { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.MENOR, yyline, yycolumn,yytext());}
<YYINITIAL> {MAYOR}              { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.MAYOR, yyline, yycolumn,yytext());}
<YYINITIAL> {PUNTO}              { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.PUNTO, yyline, yycolumn,yytext());}
<YYINITIAL> {COMA}               { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.COMA, yyline, yycolumn,yytext());}
<YYINITIAL> {PUNTOYCOMA}         { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.PUNTOYCOMA, yyline, yycolumn,yytext());}
<YYINITIAL> {DOSPUNTOS}          { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.DOSPUNTOS, yyline, yycolumn,yytext());}
<YYINITIAL> {ADMI_C}             { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.ADMI_C, yyline, yycolumn,yytext());}
<YYINITIAL> {INTE_C}             { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.INTE_C, yyline, yycolumn,yytext());}
<YYINITIAL> {MAS}                { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.MAS, yyline, yycolumn,yytext());}
<YYINITIAL> {MENOS}              { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.MENOS, yyline, yycolumn,yytext());}
<YYINITIAL> {POR}                { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.POR, yyline, yycolumn,yytext());}
<YYINITIAL> {DIV}                { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.DIV, yyline, yycolumn,yytext());}
<YYINITIAL> {CONTRADIV}          { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.CONTRADIV, yyline, yycolumn,yytext());}
<YYINITIAL> {OR}                 { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.OR, yyline, yycolumn,yytext());}
<YYINITIAL> {DPORCIENTO}         { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.DPORCIENTO, yyline, yycolumn,yytext());}
<YYINITIAL> {COSO_N}             { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.COSO_N, yyline, yycolumn,yytext());}
<YYINITIAL> {IGUAL}              { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.IGUAL, yyline, yycolumn,yytext());}
<YYINITIAL> {CORH_A}             { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.CORH_A, yyline, yycolumn,yytext());}
<YYINITIAL> {CORH_C}             { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.CORH_C, yyline, yycolumn,yytext());}
<YYINITIAL> {PAR_A}              { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.PAR_A, yyline, yycolumn,yytext());}
<YYINITIAL> {PAR_C}              { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.PAR_C, yyline, yycolumn,yytext());}


<YYINITIAL> {CONJUNTO}              { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.CONJUNTO, yyline, yycolumn,yytext());}

<YYINITIAL> {DIGITO}                  { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.DIGITO, yyline, yycolumn,yytext());}
<YYINITIAL> {ID}                      { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.ID, yyline, yycolumn,yytext());}

<YYINITIAL> {COMENTARIO_LINEA}        { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.COMENTARIO_LINEA, yyline, yycolumn,yytext());}
<YYINITIAL> {COMENTARIO_VARIASL}      { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.COMENTARIO_VARIASL, yyline, yycolumn,yytext());}

<YYINITIAL> {CADENA}                  { System.out.println("Reconocio "+yytext()); return new Symbol(Simbolos.CADENA, yyline, yycolumn,yytext());}


<YYINITIAL> {ENTER}              { /*Saltos de linea, ignorados*/}
<YYINITIAL> {SPACE}              { /*Espacios en blanco, ignorados*/ }

 .                      { System.out.println("Error Lexico: \'"+yytext()+"\' Linea "+yyline+" Columna "+yycolumn);}
 /*. {System.out.println("Error lexico: "+yytext()+" linea: "+yyline+" columna: "+yycolumn);
    Tabla_error eLexico = new Tabla_error(yytext(),yyline,yycolumn,"Error Lexico","El simbolo no pertenece al lenguaje.");
    TablaEl.add(eLexico);
   }
*/
