grammar delphi;

options {
	language = Java;
}

import pascal;

// Parser Rules
program: classDeclaration+ EOF;

// Enhanced class declaration with inheritance
classDeclaration:
	CLASS identifier (EXTENDS identifier)? classBlock;

// Enhanced class block with proper encapsulation
classBlock:
	BEGIN (PRIVATE fieldList?)? (
		PUBLIC (fieldList | methodList)+
	)? (PROTECTED (fieldList | methodList)*)? END;

// Enhanced variable declaration with type checking
variableDeclaration: id = identifier COLON typeIdentifier;

// Enhanced field list
fieldList: (variableDeclaration SEMI)+;

// Enhanced method list
methodList: (methodDeclaration SEMI)+;

// Enhanced method declaration
methodDeclaration:
	(VIRTUAL | OVERRIDE)? (
		procedureAndFunctionDeclaration
		| constructorDeclaration
		| destructorDeclaration
	);

// Enhanced constructor declaration
constructorDeclaration:
	CONSTRUCTOR identifier LPAREN formalParameterList? RPAREN SEMI (
		INHERITED identifier LPAREN actualParameterList? RPAREN SEMI
	)? block;

// Enhanced destructor declaration
destructorDeclaration:
	DESTRUCTOR identifier SEMI (INHERITED DESTROY SEMI)? block;

// Enhanced object instantiation with constructor calls
objectInstantiation:
	identifier ASSIGN NEW identifier LPAREN actualParameterList? RPAREN;

// Enhanced method call
methodCall:
	identifier DOT identifier LPAREN actualParameterList? RPAREN;

// Enhanced field access
fieldAccess: identifier DOT identifier;

// IO specific rules
readStatement:
	READLN LPAREN identifier (COMMA identifier)* RPAREN;

writeStatement:
	WRITELN LPAREN (STRING_LITERAL | expression) (
		COMMA (STRING_LITERAL | expression)
	)* RPAREN;

// Additional Lexer Rules
CLASS: 'CLASS';
EXTENDS: 'EXTENDS';
VIRTUAL: 'VIRTUAL';
OVERRIDE: 'OVERRIDE';
CONSTRUCTOR: 'CONSTRUCTOR';
DESTRUCTOR: 'DESTRUCTOR';
INHERITED: 'INHERITED';
DESTROY: 'DESTROY';
NEW: 'NEW';
READLN: 'READLN';
WRITELN: 'WRITELN';
PUBLIC: 'PUBLIC';
PRIVATE: 'PRIVATE';
PROTECTED: 'PROTECTED';

identifier: IDENTIFIER;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
typeIdentifier: IDENTIFIER;
STRING_LITERAL: '"' .*? '"';
SEMI: ';';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
ASSIGN: ':=';
DOT: '.';

WS: [ \t\r\n]+ -> skip;