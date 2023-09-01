grammar SimpleLang;

parse
  : PROJECT Ident (constDecl | enumDecl | varDecl | classDecl | interfaceDecl )* '{' (methodDecl)* '}'
  ;

constDecl
  : CONST type Ident Assignop (NumConst | BooleanConst | CharConst) (Comma Ident Assignop (NumConst | CharConst | BooleanConst))* ';'
  ;

enumDecl
  : ENUM Ident '{' Ident (Assignop NumConst)? (Comma Ident (Assignop NumConst)?)*  '}'
  ;

varDecl
  : type Ident ('[' ']')* (Comma Ident ('[' ']')*)* ';'
  ;

classDecl 
  : CLASS Ident ('extends' Ident)? ('implements' Ident (Comma Ident)*)? '{'  (varDecl)* ('{'(methodDecl)* '}')? '}'
  ;

interfaceDecl
  : INTERFACE Ident '{'(interfaceMethodDecl)* '}'
  ;

interfaceMethodDecl
  : (type | VOID) Ident '(' (formPars)? ')' ';'
  ;

methodDecl
  : (type | VOID) Ident '(' (formPars)? ')' (varDecl)* '{' (statement)* '}'
  ;

formPars
  : type Ident ('[' ']')* (Comma type Ident ('[' ']')*)*
  ;

type
  : Ident
  ;

statement :  designatorStatement ';'
  | IF '(' condition ')' statement ('else' statement)?
  | FOR '(' (designatorStatement)?  ';' (condition)? ';' (designatorStatement)? ')' statement
  | BREAK ';'
  | CONTINUE ';'
  | RETURN (expr)? ';'
  | READ '(' designator ')' ';'
  | PRINT '(' expr (Comma NumConst)? ')' ';'
  | '{' (statement)* '}'
  ;

designatorStatement
  : designator (Assignop expr | '(' actPars? ')' | Plusplus | Minusminus)
  ;

actPars
  : expr (Comma expr)*
  ;

condition
  : condTerm (Logicalor condTerm)*
  ;

condTerm
  : condFact (Logicaland condFact)*
  ;

condFact
  : expr (Relop expr)?
  ;

expr
  : ('-')? term (Addop term)*
  ;

term
  : factor (Mulop factor)*
  ;

factor
  : designator ('(' actPars? ')')?
  | NumConst
  | CharConst
  | BooleanConst
  | 'new' type ('[' expr ']')?
  | '(' expr ')'
  ;

designator
  : Ident ('.' Ident | '[' expr ']')*
  ;

/*operators: +, -, *, /, %, ==, !=, >, >=, <, <=, &&, ||, =, ++, --, ;,
comma, ., (, ), [, ], {, } */

Comma 
  : ','
  ;

Plusplus
  : '++'
  ;

Minusminus
  : '--'
  ;

Logicalor
  : '||'
  ;

Logicaland
  : '&&'
  ;

Assignop
  : '='
  ;

Relop
  : '==' | '!=' | '>' | '>=' | '<' | '<='
  ;

Addop
  : '+' | '-'
  ;

Mulop
  : '*' | '/' | '%'
  ;

NumConst
  : [1-9][0-9]* | [0] 
  ;

BooleanConst 
  : 'true' | 'false'
  ;

CharConst
  : '\'' ~[\t\r\n] '\''
  ;

/* protected keywords
keywords: project, break, class, interface, enum, else, const, if,
new, print, read, return, void, for, extends, continue */
PROJECT
  : 'project'
  ;

BREAK
  : 'break'
  ;

CLASS
  : 'class'
  ;

INTERFACE
  : 'interface'
  ;

ENUM 
  : 'enum'
  ;

ELSE 
  : 'else'
  ;

CONST 
  : 'const'
  ;

IF 
  : 'if'
  ;

NEW
  : 'new'
  ;

PRINT
  : 'print'
  ;

READ 
  : 'read'
  ;

RETURN 
  : 'return'
  ;

FOR 
  : 'for'
  ;

EXTENDS 
  : 'extends'
  ;

CONTINUE
  : 'continue'
  ;

VOID
  : 'void'
  ;
  
Ident
  : [a-zA-Z_][a-zA-Z_0-9]*
  ;

SPACE
  : [ \t\r\n]+ -> skip
  ;

Comment
  : '//' ~[\r\n]* -> skip
  ;

OTHER
  : .
  ;