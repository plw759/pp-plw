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

public class NameUseListener extends SimpleLangBaseListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public class Scope{
		String type;
		String name;
		List<Scope> decl = new ArrayList<Scope>();
		Scope parent = null;
		int args = 0;
		public Scope(String type, String name){
			this.type = type;
			this.name = name;
			this.decl = new ArrayList<Scope>();
		}
		public Scope(String type, String name, Scope parent){
			this.type = type;
			this.name = name;
			this.decl = new ArrayList<Scope>();
			this.parent = parent;
			for (Scope s : parent.decl){
				this.decl.add(s);
			}
		}
		public Scope(String type, String name, Scope parent, int args){
			this.type = type;
			this.name = name;
			this.decl = new ArrayList<Scope>();
			this.parent = parent;
			for (Scope s : parent.decl){
				this.decl.add(s);
			}
			this.args = args;
			
		}
		void printscope(){
			List<String> temp = new ArrayList<String>();
			for (Scope scope : this.decl){
				temp.add(scope.type + " " + scope.name);
			}
			System.out.println(this.type+this.name+" : "+temp);
		}

		Scope inscope(String name){
			for (Scope s : this.decl){
				if (name.equals(s.name)){
					return s;
				}
			}
			return null;
		}
	}
	private boolean nameuseerror = false;
	Scope currentScope = null;
	@Override public void enterParse(SimpleLangParser.ParseContext ctx) { 
		currentScope = new Scope("project",ctx.Ident().getText());
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParse(SimpleLangParser.ParseContext ctx) { 
		// currentScope.printscope();
		if (nameuseerror){
			System.out.println("NAME USE ERROR");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstDecl(SimpleLangParser.ConstDeclContext ctx) { 
		String type = ctx.type().Ident().getText();

		for(int i =0; i < ctx.Ident().size(); i++){

			//maybe make a separate attribute and constructor for const?
			currentScope.decl.add(new Scope(type,ctx.Ident(i).getText(),currentScope));
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstDecl(SimpleLangParser.ConstDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumDecl(SimpleLangParser.EnumDeclContext ctx) { 
		String name = ctx.Ident(0).getText();
		Scope child = new Scope("enum", name, currentScope);
		currentScope.decl.add(child);
		currentScope = child;

		for(int i =1; i < ctx.Ident().size(); i++){

			currentScope.decl.add(new Scope("enum",ctx.Ident(i).getText(),currentScope));
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumDecl(SimpleLangParser.EnumDeclContext ctx) { 
		// currentScope.printscope();
		currentScope = currentScope.parent;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVarDecl(SimpleLangParser.VarDeclContext ctx) { 
		String type = ctx.type().Ident().getText();

		for(int i =0; i < ctx.Ident().size(); i++){
			Scope s = new Scope(type,ctx.Ident(i).getText(),currentScope);
			if (Character.isUpperCase(type.charAt(0))){
				//if not a primitive; enum class or interface
				Scope inherit = s.inscope(type);
				if (inherit != null){
					for (Scope x : inherit.decl){
						if (!s.decl.contains(x)){
							s.decl.add(x);
						}
					}
				}else{
					nameuseerror = true;
					break;
				}
			}
			currentScope.decl.add(s);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVarDecl(SimpleLangParser.VarDeclContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassDecl(SimpleLangParser.ClassDeclContext ctx) { 
		// no inheritance from other classes yet
		String name = ctx.Ident(0).getText();
		Scope child = new Scope("class",name,currentScope);
		currentScope.decl.add(child);
		currentScope  = child;
		currentScope.decl.add(child);

		
		//check for extends ident? and implements ident, *
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassDecl(SimpleLangParser.ClassDeclContext ctx) { 
		// currentScope.printscope();
		currentScope = currentScope.parent;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx) { 
		String name = ctx.Ident().getText();
		Scope child = new Scope("interface",name,currentScope);
		currentScope.decl.add(child);
		currentScope  = child;

		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx) { 
		// currentScope.printscope();
		currentScope = currentScope.parent;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx) { 
		String name = ctx.Ident().getText();
		//if we want return types
		// String type = "void";
		// if (ctx.type() != null){
		// 	type = ctx.type().getText();
		// }
		int args = 0;
		if (ctx.formPars() != null){
			args = ctx.formPars().Ident().size();
		}
		Scope child = new Scope("intmethod",name,currentScope,args);
		currentScope.decl.add(child);
		currentScope  = child;
		currentScope.decl.add(child);

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx) { 
		// currentScope.printscope();
		currentScope = currentScope.parent;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMethodDecl(SimpleLangParser.MethodDeclContext ctx) { 
		String name = ctx.Ident().getText();
		//if we want return types
		// String type = "void";
		// if (ctx.type() != null){
		// 	type = ctx.type().getText();
		// }
		int args = 0;
		if (ctx.formPars() != null){
			args = ctx.formPars().Ident().size();
		}
		Scope child = new Scope("method",name,currentScope,args);
		currentScope.decl.add(child);
		currentScope  = child;
		currentScope.decl.add(child);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMethodDecl(SimpleLangParser.MethodDeclContext ctx) {
		// currentScope.printscope();
		currentScope = currentScope.parent;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFormPars(SimpleLangParser.FormParsContext ctx) { 

		for(int i =0; i < ctx.Ident().size(); i++){

			currentScope.decl.add(new Scope(ctx.type(i).Ident().getText(),ctx.Ident(i).getText(),currentScope));
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
	@Override public void enterStatement(SimpleLangParser.StatementContext ctx) { 

	}
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
	@Override public void enterDesignatorStatement(SimpleLangParser.DesignatorStatementContext ctx) { 

	}
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
	@Override public void enterDesignator(SimpleLangParser.DesignatorContext ctx) { 
		//filter out predetermined methods
		if (ctx.Ident().size() == 1){
			if ("ord".equals(ctx.Ident(0).getText())
			|| "chr".equals(ctx.Ident(0).getText())
			|| "len".equals(ctx.Ident(0).getText())){

				return;

			}
		}
				//do actual checks in scope for each ident
		String name=null;
		Scope temp= currentScope;
		// for . operator, we need to check scopes of each class
		for(int i = 0; i < ctx.Ident().size(); i++){
			// temp.printscope();

			name = ctx.Ident(i).getText();
			Scope prev = null;
			if(i==0 && name.equals("this")){

			}
			else{
				//prev = temp;
				temp = temp.inscope(name);
			}
			if (temp == null){
				//prev.printscope();
				nameuseerror = true;
				//System.out.println(name + " not found in current scope");
				break;
			}
		}
	}
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