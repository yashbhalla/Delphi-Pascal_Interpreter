grammar delphi;

options {
	language = Java;
}

import pascal;

// Parser Rules
program:
	PROGRAM identifier SEMI (classDeclaration)* compoundStatement DOT EOF;

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
	WRITELN LPAREN (STRING_LITERAL | expression) (
		COMMA (STRING_LITERAL | expression)
	)* RPAREN;

procedureAndFunctionDeclaration:
	'procedure' identifier '(' formalParameterList? ')' ';' block
	| 'function' identifier '(' formalParameterList? ')' ':' typeIdentifier ';' block;

actualParameterList: expression (',' expression)*;

statementSequence: statement (SEMI statement)*;

block: (classDeclaration | statementSequence)+;

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

/*
 VIRTUAL: 'virtual'; OVERRIDE: 'override'; INHERITED: 'inherited'; DESTROY: 'destroy'; VAR: 'var';
 */

identifier: IDENTIFIER;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
typeIdentifier: IDENTIFIER;
STRING_LITERAL: '\'' ( ~['\r\n] | '\'\'')* '\'';
SEMI: ';';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
ASSIGN: ':=';
DOT: '.';

WS: [ \t\r\n]+ -> skip;

/*grammar delphi;
 
 options { language = Java; }
 
 import pascal;
 
 // Parser Rules program: 'program' identifier SEMI classDeclaration+ '.' EOF; program: PROGRAM
 identifier SEMI block DOT EOF;
 
 // Enhanced class declaration with inheritance classDeclaration: CLASS identifier (EXTENDS
 identifier)? classBlock;
 
 // Enhanced class block with proper encapsulation classBlock: BEGIN (PRIVATE fieldList?)? ( PUBLIC
 (fieldList | methodList)+ )? (PROTECTED (fieldList | methodList)*)? END;
 
 // Enhanced variable declaration with type checking variableDeclaration: id = identifier COLON
 typeIdentifier;
 
 // Enhanced field list fieldList: (variableDeclaration SEMI)+;
 
 // Enhanced method list methodList: (methodDeclaration SEMI)+;
 
 // Enhanced method declaration methodDeclaration: (VIRTUAL | OVERRIDE)? (
 procedureAndFunctionDeclaration | constructorDeclaration | destructorDeclaration );
 
 // Enhanced constructor declaration constructorDeclaration: CONSTRUCTOR identifier LPAREN
 formalParameterList? RPAREN SEMI ( INHERITED identifier LPAREN actualParameterList? RPAREN SEMI )?
 block;
 
 // Enhanced destructor declaration destructorDeclaration: DESTRUCTOR identifier SEMI (INHERITED
 DESTROY SEMI)? block;
 
 // Enhanced object instantiation with constructor calls objectInstantiation: identifier ASSIGN NEW
 identifier LPAREN actualParameterList? RPAREN;
 
 // Enhanced method call methodCall: identifier DOT identifier LPAREN actualParameterList? RPAREN;
 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 // Enhanced field access fieldAccess: identifier DOT identifier;
 
 // IO specific rules readStatement: READLN LPAREN identifier (COMMA identifier)* RPAREN;
 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 writeStatement: WRITELN LPAREN (STRING_LITERAL | expression) ( COMMA (STRING_LITERAL | expression)
 )* RPAREN;
 
 procedureAndFunctionDeclaration: 'procedure' identifier '(' formalParameterList? ')' ';' block |
 'function' identifier '(' formalParameterList? ')' ':' typeIdentifier ';' block;
 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 actualParameterList: expression (',' expression)*;
 
 statementSequence: statement (';' statement)*; block: (classDeclaration | statementSequence)+;
 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 statement: variableDeclaration | objectInstantiation | methodCall | readStatement | writeStatement
 | compoundStatement;
 
 compoundStatement: BEGIN statementSequence END;
 
 // Additional Lexer Rules CLASS: 'CLASS'; EXTENDS: 'EXTENDS'; VIRTUAL: 'VIRTUAL'; OVERRIDE:
 'OVERRIDE'; CONSTRUCTOR: 'CONSTRUCTOR'; DESTRUCTOR: 'DESTRUCTOR'; INHERITED: 'INHERITED'; DESTROY:
 'DESTROY'; NEW: 'NEW'; READLN: 'READLN'; WRITELN: 'WRITELN'; PUBLIC: 'PUBLIC'; PRIVATE: 'PRIVATE';
 PROTECTED: 'PROTECTED';
 
 identifier: IDENTIFIER; IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*; typeIdentifier: IDENTIFIER;
 STRING_LITERAL: '\'' .*? '\'';
 
 SEMI: ';'; COLON: ':'; LPAREN: '('; RPAREN: ')'; ASSIGN: ':='; DOT: '.'; WS: [ \t\r\n]+ -> skip;
 PROGRAM: 'program'; BEGIN: 'begin'; END: 'end'; VAR: 'var';
 */