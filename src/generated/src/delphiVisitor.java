// Generated from src/delphi.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link delphiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface delphiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link delphiParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(delphiParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(delphiParser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#typeSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSection(delphiParser.TypeSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(delphiParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(delphiParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(delphiParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(delphiParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#variablesSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesSection(delphiParser.VariablesSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(delphiParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(delphiParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#methodList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodList(delphiParser.MethodListContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(delphiParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(delphiParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#destructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructorDeclaration(delphiParser.DestructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#objectInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstantiation(delphiParser.ObjectInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(delphiParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(delphiParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(delphiParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(delphiParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#procedureAndFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclaration(delphiParser.ProcedureAndFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(delphiParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(delphiParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#actualParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameterList(delphiParser.ActualParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(delphiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(delphiParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(delphiParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(delphiParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(delphiParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#statementSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSequence(delphiParser.StatementSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(delphiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#empty_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(delphiParser.Empty_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(delphiParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(delphiParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(delphiParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(delphiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#writeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteParameter(delphiParser.WriteParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(delphiParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(delphiParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(delphiParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(delphiParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(delphiParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(delphiParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(delphiParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link delphiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(delphiParser.BlockContext ctx);
}