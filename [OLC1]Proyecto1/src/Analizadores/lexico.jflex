package Analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;

import Proyecto1.Index;


%%
%{

    Index i = new Index();
    
    String comment = "";

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

%state COMENTARIO_VARIASL

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

COSO_N = "~"


CONJUNTO = "CONJ"


//DIGITO = [+|-]?[0-9]+  
DIGITO = [0-9]+(.[0-9]+)*
LETRA = [A-Za-zñÑ]+
ID  = {LETRA}("~"|{LETRA}|{DIGITO}|"_")*

CADENA = ([\"][^\"\n]*[\"\n]) | ([\'][^\"\n]*[\'\n])

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

COMENTARIO_LINEA = "//" {InputCharacter}* {LineTerminator}?


SPACE   = [ \t\r\n\f] | [\ \r\t\f\t]
ENTER   = [ \n]


%%
<YYINITIAL> {LLAVE_A}            {  return new Symbol(Simbolos.LLAVE_A, yyline, yycolumn,yytext());}
<YYINITIAL> {LLAVE_C}            {  return new Symbol(Simbolos.LLAVE_C, yyline, yycolumn,yytext());}
<YYINITIAL> {MENOR}              { yybegin(COMENTARIO_VARIASL); comment+="<";}
<YYINITIAL> {MAYOR}              {  return new Symbol(Simbolos.MAYOR, yyline, yycolumn,yytext());}
<YYINITIAL> {PUNTO}              {  return new Symbol(Simbolos.PUNTO, yyline, yycolumn,yytext());}
<YYINITIAL> {COMA}               {  return new Symbol(Simbolos.COMA, yyline, yycolumn,yytext());}
<YYINITIAL> {PUNTOYCOMA}         {  return new Symbol(Simbolos.PUNTOYCOMA, yyline, yycolumn,yytext());}
<YYINITIAL> {DOSPUNTOS}          {  return new Symbol(Simbolos.DOSPUNTOS, yyline, yycolumn,yytext());}
<YYINITIAL> {ADMI_C}             {  return new Symbol(Simbolos.ADMI_C, yyline, yycolumn,yytext());}
<YYINITIAL> {INTE_C}             {  return new Symbol(Simbolos.INTE_C, yyline, yycolumn,yytext());}
<YYINITIAL> {MAS}                {  return new Symbol(Simbolos.MAS, yyline, yycolumn,yytext());}
<YYINITIAL> {MENOS}              {  return new Symbol(Simbolos.MENOS, yyline, yycolumn,yytext());}
<YYINITIAL> {POR}                {  return new Symbol(Simbolos.POR, yyline, yycolumn,yytext());}
<YYINITIAL> {DIV}                {  return new Symbol(Simbolos.DIV, yyline, yycolumn,yytext());}
<YYINITIAL> {CONTRADIV}          {  return new Symbol(Simbolos.CONTRADIV, yyline, yycolumn,yytext());}
<YYINITIAL> {OR}                 {  return new Symbol(Simbolos.OR, yyline, yycolumn,yytext());}
<YYINITIAL> "%%"                 {  return new Symbol(Simbolos.DPORCIENTO, yyline, yycolumn,yytext());}
<YYINITIAL> {COSO_N}             {  return new Symbol(Simbolos.COSO_N, yyline, yycolumn,yytext());}


<YYINITIAL> {CONJUNTO}              {  return new Symbol(Simbolos.CONJUNTO, yyline, yycolumn,yytext());}

<YYINITIAL> {DIGITO}                  {  return new Symbol(Simbolos.DIGITO, yyline, yycolumn,yytext());}
<YYINITIAL> {ID}                      {  return new Symbol(Simbolos.ID, yyline, yycolumn,yytext());}

<YYINITIAL> {COMENTARIO_LINEA}        { /*Comentario unilinea*/  }

<COMENTARIO_VARIASL> {
        [\!] { comment += yytext(); }
        [^\!>] { comment+=yytext();}
        [!>] { yybegin(YYINITIAL); comment+=">"; comment="";}
}

<YYINITIAL> {CADENA}                  {  return new Symbol(Simbolos.CADENA, yyline, yycolumn,yytext());}


<YYINITIAL> {ENTER}              { /*Saltos de linea, ignorados*/}
<YYINITIAL> {SPACE}              { /*Espacios en blanco, ignorados*/ }


 .                      { System.out.println("Error Lexico: \'"+yytext()+"\' Linea "+yyline+" Columna "+yycolumn);}
 /*. {System.out.println("Error lexico: "+yytext()+" linea: "+yyline+" columna: "+yycolumn);
    Tabla_error eLexico = new Tabla_error(yytext(),yyline,yycolumn,"Error Lexico","El simbolo no pertenece al lenguaje.");
    TablaEl.add(eLexico);
   }
*/

