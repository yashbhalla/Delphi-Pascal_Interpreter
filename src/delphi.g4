grammar delphi;

options {
	language = Java;
}

import pascal;

// Constructor and destructor
constructorDeclaration:
	'constructor' identifier '(' formalParameterList? ')' ';' block;

destructorDeclaration: 'destructor' identifier ';' block;

// Class block
classBlock: ('private' fieldList)? 'public' (
		fieldList
		| methodList
	)+;

classDeclaration: 'class' identifier classBlock;

variableDeclaration: identifier ':' typeIdentifier;

// Field list
fieldList: (variableDeclaration ';')+;

// Method list
methodList: (methodDeclaration ';')+;

// Method declaration
methodDeclaration:
	procedureAndFunctionDeclaration
	| constructorDeclaration
	| destructorDeclaration;

// Object instantiation
objectInstantiation:
	identifier ':=' 'new' identifier '(' actualParameterList? ')';

// Extend the existing block rule to include object instantiation and statements.
block:
	compoundStatement
	| 'begin' (variableDeclaration | objectInstantiation)* statementSequence 'end';