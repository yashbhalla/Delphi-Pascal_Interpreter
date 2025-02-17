/*grammar delphi;
 
 options { language = Java; }
 
 import pascal;
 
 // Parser Rules program: PROGRAM identifier SEMI (classDeclaration)* compoundStatement DOT EOF;
 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 classDeclaration: CLASS identifier (EXTENDS identifier)? classBlock;
 
 classBlock: BEGIN (PRIVATE fieldList?)? ( PUBLIC (fieldList | methodList)+ )? (PROTECTED (fieldList
 | methodList)*)? END;
 
 variableDeclaration: id = identifier COLON typeIdentifier;
 
 fieldList: (variableDeclaration SEMI)+;
 
 methodList: (methodDeclaration SEMI)+;
 
 methodDeclaration: (VIRTUAL | OVERRIDE)? ( procedureAndFunctionDeclaration | constructorDeclaration
 | destructorDeclaration );
 
 constructorDeclaration: CONSTRUCTOR identifier LPAREN formalParameterList? RPAREN SEMI ( INHERITED
 identifier LPAREN actualParameterList? RPAREN SEMI )? block;
 
 destructorDeclaration: DESTRUCTOR identifier SEMI (INHERITED DESTROY SEMI)? block;
 

 

 

 

 

 

 

 objectInstantiation: identifier ASSIGN NEW identifier LPAREN actualParameterList? RPAREN;
 

 

 

 

 

 

 

 

 methodCall: identifier DOT identifier LPAREN actualParameterList? RPAREN;
 
 fieldAccess: identifier DOT identifier;
 
 readStatement: READLN LPAREN identifier (COMMA identifier)* RPAREN;
 
 writeStatement: WRITELN LPAREN (STRING_LITERAL | expression) ( COMMA (STRING_LITERAL | expression)
 )* RPAREN;
 
 procedureAndFunctionDeclaration: 'procedure' identifier '(' formalParameterList? ')' ';' block |
 'function' identifier '(' formalParameterList? ')' ':' typeIdentifier ';' block;
 

 

 

 

 actualParameterList: expression (',' expression)*;
 
 statementSequence: statement (SEMI statement)*;
 
 block: (classDeclaration | statementSequence)+;
 
 statement: variableDeclaration | objectInstantiation | methodCall | readStatement | writeStatement
 | compoundStatement;
 
 compoundStatement: BEGIN statementSequence END;
 
 // Lexer Rules PROGRAM: [pP][rR][oO][gG][rR][aA][mM]; CLASS: [cC][lL][aA][sS][sS]; EXTENDS:
 [eE][xX][tT][eE][nN][dD][sS]; BEGIN: [bB][eE][gG][iI][nN]; END: [eE][nN][dD]; PUBLIC:
 [pP][uU][bB][lL][iI][cC]; PRIVATE: [pP][rR][iI][vV][aA][tT]; PROTECTED:
 [pP][rR][oO][tT][eE][cC][tT][eE][dD]; CONSTRUCTOR: [cC][oO][nN][sS][tT][rR][uU][cC][tT][oO][rR];
 DESTRUCTOR: [dD][eE][sS][tT][rR][uU][cC][tT][oO][rR]; NEW: [nN][eE][wW]; WRITELN:
 [wW][rR][iI][tT][eE][lL][nN]; READLN: [rR][eE][aA][dD][lL][nN]; VIRTUAL:
 [vV][iI][rR][tT][uU][aA][lL]; OVERRIDE: [oO][vV][eE][rR][rR][iI][dD][eE]; INHERITED:
 [iI][nN][hH][eE][rR][iI][tT][eE][dD]; DESTROY: [dD][eE][sS][tT][rR][oO][yY]; VAR: [vV][aA][rR];
 

 

 identifier: IDENTIFIER; IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*; typeIdentifier: IDENTIFIER;
 STRING_LITERAL: '\'' ( ~['\r\n] | '\'\'')* '\''; SEMI: ';'; COLON: ':'; LPAREN: '('; RPAREN: ')';
 ASSIGN: ':='; DOT: '.';
 
 WS: [ \t\r\n]+ -> skip;
 

 

 */
grammar delphi;

options {
	language = Java;
}

// Parser Rules
program:
	PROGRAM identifier SEMI (typeDeclaration)* (classDeclaration)* compoundStatement DOT EOF;

typeDeclaration: TYPE identifier EQUALS typeDefinition SEMI;

typeDefinition:
	CLASS identifier (EXTENDS identifier)? classBlock;

classDeclaration:
	CLASS identifier (EXTENDS identifier)? classBlock;

classBlock:
	BEGIN (PRIVATE fieldList?)? (
		PUBLIC (fieldList | methodList)+
	)? (PROTECTED (fieldList | methodList)*)? END;

variableDeclaration: id = identifier COLON typeIdentifier;

fieldList: (variableDeclaration SEMI)+;

methodList: (methodDeclaration SEMI)+;

methodDeclaration:
	(VIRTUAL | OVERRIDE)? (
		procedureAndFunctionDeclaration
		| constructorDeclaration
		| destructorDeclaration
	);

constructorDeclaration:
	CONSTRUCTOR identifier LPAREN formalParameterList? RPAREN SEMI (
		INHERITED identifier LPAREN actualParameterList? RPAREN SEMI
	)? block;

destructorDeclaration:
	DESTRUCTOR identifier SEMI (INHERITED DESTROY SEMI)? block;

objectInstantiation:
	identifier ASSIGN NEW identifier LPAREN actualParameterList? RPAREN;

methodCall:
	identifier DOT identifier LPAREN actualParameterList? RPAREN;

fieldAccess: identifier DOT identifier;

readStatement:
	READLN LPAREN identifier (COMMA identifier)* RPAREN;

writeStatement:
	WRITELN LPAREN (expression) (COMMA expression)* RPAREN; // Corrected writeStatement

procedureAndFunctionDeclaration:
	'procedure' identifier '(' formalParameterList? ')' ';' block
	| 'function' identifier '(' formalParameterList? ')' ':' typeIdentifier ';' block;

formalParameterList: formalParameter (SEMI formalParameter)*;
formalParameter:
	identifier COLON typeIdentifier; // Corrected formalParameter

actualParameterList: expression (',' expression)*;

expression:
	identifier
	| STRING_LITERAL
	| INTEGER_LITERAL
	| REAL_LITERAL // Added real/float literal
	| LPAREN expression RPAREN
	| methodCall
	| fieldAccess
	| identifier LPAREN actualParameterList? RPAREN // Added for function calls in expressions
	| identifier DOT identifier; // Added for field access in expressions

statementSequence: statement (SEMI statement)*;

block: (statement | classDeclaration)*; // Corrected block rule

statement:
	variableDeclaration
	| objectInstantiation
	| methodCall
	| readStatement
	| writeStatement
	| compoundStatement;

compoundStatement: BEGIN statementSequence END;

// Lexer Rules
PROGRAM: [pP][rR][oO][gG][rR][aA][mM];
CLASS: [cC][lL][aA][sS][sS];
EXTENDS: [eE][xX][tT][eE][nN][dD][sS];
BEGIN: [bB][eE][gG][iI][nN];
END: [eE][nN][dD];
PUBLIC: [pP][uU][bB][lL][iI][cC];
PRIVATE: [pP][rR][iI][vV][aA][tT];
PROTECTED: [pP][rR][oO][tT][eE][cC][tT][eE][dD];
CONSTRUCTOR:
	[cC][oO][nN][sS][tT][rR][uU][cC][tT][oO][rR];
DESTRUCTOR: [dD][eE][sS][tT][rR][uU][cC][tT][oO][rR];
NEW: [nN][eE][wW];
WRITELN: [wW][rR][iI][tT][eE][lL][nN];
READLN: [rR][eE][aA][dD][lL][nN];
VIRTUAL: [vV][iI][rR][tT][uU][aA][lL];
OVERRIDE: [oO][vV][eE][rR][rR][iI][dD][eE];
INHERITED: [iI][nN][hH][eE][rR][iI][tT][eE][dD];
DESTROY: [dD][eE][sS][tT][rR][oO][yY];
VAR: [vV][aA][rR];
TYPE: [tT][yY][pP][eE];
EQUALS: '=';

identifier: IDENTIFIER;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
typeIdentifier: IDENTIFIER;
STRING_LITERAL: '\'' ( ~['\r\n] | '\'\'')* '\'';
INTEGER_LITERAL: [0-9]+;
REAL_LITERAL:
	[0-9]+ ('.' [0-9]+)? ([eE][+-]? [0-9]+)?; // Added real/float literal
SEMI: ';';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
ASSIGN: ':=';
DOT: '.';
COMMA: ',';

WS: [ \t\r\n]+ -> skip;