
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;
import olc1.clase2.Evaluar;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class A_Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public A_Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public A_Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public A_Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\007\000\002\005\005" +
    "\000\002\005\005\000\002\005\005\000\002\005\005\000" +
    "\002\005\005\000\002\005\004\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\031\000\004\015\005\001\002\000\006\002\ufffe\015" +
    "\ufffe\001\002\000\004\011\012\001\002\000\006\002\000" +
    "\015\005\001\002\000\004\002\010\001\002\000\004\002" +
    "\001\001\002\000\006\002\uffff\015\uffff\001\002\000\010" +
    "\007\015\013\014\016\013\001\002\000\016\004\ufff6\005" +
    "\ufff6\006\ufff6\007\ufff6\012\ufff6\014\ufff6\001\002\000\010" +
    "\007\015\013\014\016\013\001\002\000\010\007\015\013" +
    "\014\016\013\001\002\000\014\004\021\005\017\006\023" +
    "\007\022\012\020\001\002\000\010\007\015\013\014\016" +
    "\013\001\002\000\004\010\027\001\002\000\010\007\015" +
    "\013\014\016\013\001\002\000\010\007\015\013\014\016" +
    "\013\001\002\000\010\007\015\013\014\016\013\001\002" +
    "\000\016\004\ufff9\005\ufff9\006\ufff9\007\ufff9\012\ufff9\014" +
    "\ufff9\001\002\000\016\004\ufffb\005\017\006\023\007\ufffb" +
    "\012\ufffb\014\ufffb\001\002\000\016\004\ufffc\005\017\006" +
    "\023\007\ufffc\012\ufffc\014\ufffc\001\002\000\006\002\ufffd" +
    "\015\ufffd\001\002\000\016\004\ufffa\005\ufffa\006\ufffa\007" +
    "\ufffa\012\ufffa\014\ufffa\001\002\000\016\004\ufff7\005\ufff7" +
    "\006\ufff7\007\ufff7\012\ufff7\014\ufff7\001\002\000\014\004" +
    "\021\005\017\006\023\007\022\014\033\001\002\000\016" +
    "\004\ufff8\005\ufff8\006\ufff8\007\ufff8\012\ufff8\014\ufff8\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\031\000\010\002\006\003\005\004\003\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\010\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\015\001\001\000\002\001\001\000\004\005\031" +
    "\001\001\000\004\005\030\001\001\000\002\001\001\000" +
    "\004\005\027\001\001\000\002\001\001\000\004\005\025" +
    "\001\001\000\004\005\024\001\001\000\004\005\023\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$A_Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$A_Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$A_Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




        //Podemos crear variables, listas, etc;
        // deben de ser staticas si se quieren usar fuera
        
        public static LinkedList<Evaluar> lista_evaluar;
        

        public void syntax_error(Symbol s)
        {
            System.err.println("Error en la Linea " + (s.right+1) +" Columna "+(s.left+1)+ ". Identificador "+s.value + " no reconocido. Se ha recuperado del error." );
        }

        public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
        {
            System.err.println("Error en la Linea " + (s.right+1)+ " Columna "+(s.left+1)+". Identificador " +s.value + " no reconocido.");
        }
        


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$A_Sintactico$actions {

  
  private final A_Sintactico parser;

  /** Constructor */
  CUP$A_Sintactico$actions(A_Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$A_Sintactico$do_action_part00000000(
    int                        CUP$A_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$A_Sintactico$parser,
    java.util.Stack            CUP$A_Sintactico$stack,
    int                        CUP$A_Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$A_Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$A_Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)).right;
		LinkedList<Evaluar> start_val = (LinkedList<Evaluar>)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$A_Sintactico$parser.done_parsing();
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= INSTRUCCIONES 
            {
              LinkedList<Evaluar> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).right;
		LinkedList<Evaluar> a = (LinkedList<Evaluar>)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.peek()).value;
		 lista_evaluar =a ;
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INSTRUCCIONES ::= INSTRUCCIONES INSTRUCCION 
            {
              LinkedList<Evaluar> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)).right;
		LinkedList<Evaluar> a = (LinkedList<Evaluar>)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).right;
		Evaluar b = (Evaluar)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.peek()).value;
		 RESULT = a; RESULT.add(b); 
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",1, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INSTRUCCIONES ::= INSTRUCCION 
            {
              LinkedList<Evaluar> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).right;
		Evaluar a = (Evaluar)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.peek()).value;
		 RESULT = new LinkedList<>(); RESULT.add(a);  
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",1, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INSTRUCCION ::= eval cora E corc pyc 
            {
              Evaluar RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).right;
		Integer a = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).value;
		 RESULT = new Evaluar(a, aleft, aright);
                                             /*System.out.println("El valor de la expresión es: "+a); */
                                            
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // E ::= E mas E 
            {
              Integer RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).right;
		Integer a = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).right;
		Integer b = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.peek()).value;
		 RESULT=a+b; 
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // E ::= E menos E 
            {
              Integer RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).right;
		Integer a = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).right;
		Integer b = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.peek()).value;
		 RESULT=a-b; 
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // E ::= E por E 
            {
              Integer RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).right;
		Integer a = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).right;
		Integer b = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.peek()).value;
		 RESULT=a*b; 
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // E ::= E div E 
            {
              Integer RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).right;
		Integer a = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).right;
		Integer b = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.peek()).value;
		 RESULT=a/b; 
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // E ::= para E parc 
            {
              Integer RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)).right;
		Integer a = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)).value;
		 RESULT=a; 
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // E ::= menos E 
            {
              Integer RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).right;
		Integer a = (Integer)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.peek()).value;
		 RESULT=a*(-1); 
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.elementAt(CUP$A_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // E ::= digito 
            {
              Integer RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$A_Sintactico$stack.peek()).value;
		 RESULT=new Integer(a); 
              CUP$A_Sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$A_Sintactico$stack.peek()), RESULT);
            }
          return CUP$A_Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$A_Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$A_Sintactico$do_action(
    int                        CUP$A_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$A_Sintactico$parser,
    java.util.Stack            CUP$A_Sintactico$stack,
    int                        CUP$A_Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$A_Sintactico$do_action_part00000000(
                               CUP$A_Sintactico$act_num,
                               CUP$A_Sintactico$parser,
                               CUP$A_Sintactico$stack,
                               CUP$A_Sintactico$top);
    }
}

}