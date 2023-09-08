// Generated from SimpleLang.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;
/**
 * This class provides an empty implementation of {@link SimpleLangListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */

public class VarListener extends SimpleLangBaseListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */


	LinkedList<String> decl = new LinkedList<String>();
	private boolean varerror = false;
	@Override public void enterParse(SimpleLangParser.ParseContext ctx) { 
		decl.push("@parse");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParse(SimpleLangParser.ParseContext ctx) { 
		//System.out.println(decl);
		if (varerror){
			System.out.println("VAR ERROR");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstDecl(SimpleLangParser.ConstDeclContext ctx) { 
		for(int i = 0; i < ctx.Ident().size(); i++){
			if( !decl.contains(ctx.Ident(i).getText())){
				decl.push(ctx.Ident(i).getText());
			}else{
				varerror = true;
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstDecl(SimpleLangParser.ConstDeclContext ctx) {

	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumDecl(SimpleLangParser.EnumDeclContext ctx) { 
		//save enum id to outer scope
		if( !decl.contains(ctx.Ident(0).getText())){
			decl.push(ctx.Ident(0).getText());
		}else{
			varerror = true;
		}
		// decl.push("@enum");
		Deque<String> local = new ArrayDeque<String>();
		for(int i = 1; i < ctx.Ident().size(); i++){
			if( !local.contains(ctx.Ident(i).getText())){
				local.push(ctx.Ident(i).getText());
			}else{
				varerror = true;
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumDecl(SimpleLangParser.EnumDeclContext ctx) { 
		// System.out.println(decl);
		
		// while (!decl.pop().equals("@enum")){

		// }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVarDecl(SimpleLangParser.VarDeclContext ctx) {

		for(int i = 0; i < ctx.Ident().size(); i++){
			int idx = decl.indexOf("@method");
			if (idx == -1){
				idx = decl.indexOf("@class");
				if (idx == -1){
					idx = 0;
				}
			}
			boolean undeclared = true;
			for (int j = idx; j >=0; j --){
				if(decl.get(j).equals(ctx.Ident(i).getText())){
					undeclared = false;
					break;
				}
			}
			

			if(undeclared){
				decl.push(ctx.Ident(i).getText());
			}else{
				varerror = true;
			}
		}
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVarDecl(SimpleLangParser.VarDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassDecl(SimpleLangParser.ClassDeclContext ctx) { 
		if( !decl.contains(ctx.Ident(0).getText())){
			decl.push(ctx.Ident(0).getText());
		}else{
			varerror = true;
		}
		decl.push("@class");
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassDecl(SimpleLangParser.ClassDeclContext ctx) { 
		//System.out.println(decl);

		while(!decl.pop().equals("@class")){

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx) { 
		if( !decl.contains(ctx.Ident().getText())){
			decl.push(ctx.Ident().getText());
		}else{
			varerror = true;
		}
		decl.push("@interface");
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx) { 
		//System.out.println(decl);

		while (!decl.pop().equals("@interface")){

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx) { 
		if( !decl.contains(ctx.Ident().getText())){
			decl.push(ctx.Ident().getText());
		}else{
			varerror = true;
		}
		decl.push("@intmethod");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx) { 
		//System.out.println(decl);

		while (!decl.pop().equals("@intmethod")){

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodDecl(SimpleLangParser.MethodDeclContext ctx) { 
		if( !decl.contains(ctx.Ident().getText())){
			decl.push(ctx.Ident().getText());
		}else{
			varerror = true;
		}
		decl.push("@method");
		//handle input decl, var decl when entering
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodDecl(SimpleLangParser.MethodDeclContext ctx) { 
		//System.out.println(decl);

		while (!decl.pop().equals("@method")){

		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFormPars(SimpleLangParser.FormParsContext ctx) { 
		//part of method scope
		for(int i = 0; i < ctx.Ident().size(); i++){
			int idx = decl.indexOf("@method");
			boolean undeclared = true;
			if (idx != -1){
				for (int j = idx; j >=0; j --){
					if(decl.get(j).equals(ctx.Ident(i).getText())){
						undeclared = false;
						break;
					}
				}
			}

			if(undeclared){
				decl.push(ctx.Ident(i).getText());
			}else{
				varerror = true;
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFormPars(SimpleLangParser.FormParsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType(SimpleLangParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType(SimpleLangParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(SimpleLangParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(SimpleLangParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDesignatorStatement(SimpleLangParser.DesignatorStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDesignatorStatement(SimpleLangParser.DesignatorStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActPars(SimpleLangParser.ActParsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActPars(SimpleLangParser.ActParsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondition(SimpleLangParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondition(SimpleLangParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondTerm(SimpleLangParser.CondTermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondTerm(SimpleLangParser.CondTermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondFact(SimpleLangParser.CondFactContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondFact(SimpleLangParser.CondFactContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(SimpleLangParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(SimpleLangParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTerm(SimpleLangParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTerm(SimpleLangParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFactor(SimpleLangParser.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFactor(SimpleLangParser.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDesignator(SimpleLangParser.DesignatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDesignator(SimpleLangParser.DesignatorContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}