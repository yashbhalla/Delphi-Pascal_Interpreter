// Generated from /Users/yashbhalla/Documents/GitHub/Delphi-Pascal_Interpreter/src/delphi.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link delphiParser}.
 */
public interface delphiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link delphiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(delphiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(delphiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(delphiParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(delphiParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(delphiParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(delphiParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(delphiParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(delphiParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(delphiParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(delphiParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(delphiParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(delphiParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(delphiParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(delphiParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#methodList}.
	 * @param ctx the parse tree
	 */
	void enterMethodList(delphiParser.MethodListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#methodList}.
	 * @param ctx the parse tree
	 */
	void exitMethodList(delphiParser.MethodListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(delphiParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(delphiParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDestructorDeclaration(delphiParser.DestructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDestructorDeclaration(delphiParser.DestructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#objectInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiation(delphiParser.ObjectInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#objectInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiation(delphiParser.ObjectInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(delphiParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(delphiParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(delphiParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(delphiParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(delphiParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(delphiParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(delphiParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(delphiParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#procedureAndFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclaration(delphiParser.ProcedureAndFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#procedureAndFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclaration(delphiParser.ProcedureAndFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(delphiParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(delphiParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(delphiParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(delphiParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void enterActualParameterList(delphiParser.ActualParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void exitActualParameterList(delphiParser.ActualParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(delphiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(delphiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void enterStatementSequence(delphiParser.StatementSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void exitStatementSequence(delphiParser.StatementSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(delphiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(delphiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(delphiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(delphiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(delphiParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(delphiParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(delphiParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(delphiParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link delphiParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(delphiParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link delphiParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(delphiParser.TypeIdentifierContext ctx);
}