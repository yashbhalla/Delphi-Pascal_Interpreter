grammar delphi;

options {
	language = Java;
}

program:
	PROGRAM identifier SEMI (typeSection)? (variablesSection)? compoundStatement DOT EOF;

programHeading:
	PROGRAM identifier (LPAREN identifierList RPAREN)? SEMI
	| UNIT identifier SEMI;

typeSection: TYPE (typeDeclaration SEMI)+;
typeDeclaration: identifier EQUAL typeDefinition;
typeDefinition:
	CLASS identifier (EXTENDS identifier)? classBlock;

classDeclaration:
	CLASS identifier (EXTENDS identifier)? classBlock SEMI;

classBlock:
	BEGIN (PRIVATE fieldList?)? (
		PUBLIC (fieldList | methodList)+
	)? (PROTECTED (fieldList | methodList)*)? END;

variablesSection: VAR (variableDeclaration SEMI)+;
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
	WRITELN LPAREN (expression) (COMMA expression)* RPAREN;

procedureAndFunctionDeclaration:
	'procedure' identifier '(' formalParameterList? ')' ';' block
	| 'function' identifier '(' formalParameterList? ')' ':' typeIdentifier ';' block;

formalParameterList: formalParameter (SEMI formalParameter)*;
formalParameter: identifier COLON typeIdentifier;
actualParameterList: expression (',' expression)*;

expression:
	simpleExpression (relationalOperator simpleExpression)?;

simpleExpression: term (additiveOperator term)*;

term: factor (multiplicativeOperator factor)*;

factor:
	identifier
	| number
	| STRING_LITERAL
	| LPAREN expression RPAREN
	| NOT factor;

compoundStatement: BEGIN statementSequence END;
statementSequence: statement (SEMI statement)*;

statement:
	assignmentStatement
	| procedureStatement
	| ifStatement
	| whileStatement
	| readStatement
	| writeStatement
	| objectInstantiation
	| methodCall
	| compoundStatement
	| empty_statement;

empty_statement:;

assignmentStatement: identifier ASSIGN expression;

procedureStatement:
	identifier (LPAREN actualParameterList? RPAREN)?;

ifStatement: IF expression THEN statement (ELSE statement)?;

whileStatement: WHILE expression DO statement;

writeParameter: STRING_LITERAL | expression;

identifierList: identifier (COMMA identifier)*;

typeIdentifier:
	identifier
	| (CHAR | BOOLEAN | INTEGER | REAL | STRING);

identifier: IDENTIFIER;

number: INTEGER_CONST | REAL_CONST;

relationalOperator: EQUAL | NOT_EQUAL | LT | LE | GE | GT | IN;

additiveOperator: PLUS | MINUS | OR;

multiplicativeOperator: STAR | SLASH | DIV | MOD | AND;

block: BEGIN statementSequence END;

// Lexer Rules
PROGRAM: [pP][rR][oO][gG][rR][aA][mM];
UNIT: [uU][nN][iI][tT];
BEGIN: [bB][eE][gG][iI][nN];
END: [eE][nN][dD];
VAR: [vV][aA][rR];
TYPE: [tT][yY][pP][eE];
CLASS: [cC][lL][aA][sS][sS];
EXTENDS: [eE][xX][tT][eE][nN][dD][sS];
PUBLIC: [pP][uU][bB][lL][iI][cC];
PRIVATE: [pP][rR][iI][vV][aA][tT];
PROTECTED: [pP][rR][oO][tT][eE][cC][tT][eE][dD];
CONSTRUCTOR:
	[cC][oO][nN][sS][tT][rR][uU][cC][tT][oO][rR];
DESTRUCTOR: [dD][eE][sS][tT][rR][uU][cC][tT][oO][rR];
VIRTUAL: [vV][iI][rR][tT][uU][aA][lL];
OVERRIDE: [oO][vV][eE][rR][rR][iI][dD][eE];
INHERITED: [iI][nN][hH][eE][rR][iI][tT][eE][dD];
DESTROY: [dD][eE][sS][tT][rR][oO][yY];
NEW: [nN][eE][wW];
IF: [iI][fF];
THEN: [tT][hH][eE][nN];
ELSE: [eE][lL][sS][eE];
WHILE: [wW][hH][iI][lL][eE];
DO: [dD][oO];
READ: [rR][eE][aA][dD];
READLN: [rR][eE][aA][dD][lL][nN];
WRITE: [wW][rR][iI][tT][eE];
WRITELN: [wW][rR][iI][tT][eE][lL][nN];
OR: [oO][rR];
AND: [aA][nN][dD];
NOT: [nN][oO][tT];
DIV: [dD][iI][vV];
MOD: [mM][oO][dD];
IN: [iI][nN];
CHAR: [cC][hH][aA][rR];
BOOLEAN: [bB][oO][oO][lL][eE][aA][nN];
INTEGER: [iI][nN][tT][eE][gG][eE][rR];
REAL: [rR][eE][aA][lL];
STRING: [sS][tT][rR][iI][nN][gG];

DOT: '.';
COMMA: ',';
SEMI: ';';
COLON: ':';
ASSIGN: ':=';
EQUAL: '=';
NOT_EQUAL: '<>';
LT: '<';
LE: '<=';
GE: '>=';
GT: '>';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
LPAREN: '(';
RPAREN: ')';

IDENTIFIER: [A-Za-z][A-Za-z0-9_]*;
INTEGER_CONST: [0-9]+;
REAL_CONST: [0-9]+ ('.' [0-9]+)? ([eE][+-]? [0-9]+)?;
STRING_LITERAL: '\'' ('\'\'' | ~'\'')* '\'';

WS: [ \t\r\n]+ -> skip;
COMMENT: '{' .*? '}' -> skip;