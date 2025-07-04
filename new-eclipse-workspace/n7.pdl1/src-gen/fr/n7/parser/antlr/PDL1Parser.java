/*
 * generated by Xtext 2.38.0
 */
package fr.n7.parser.antlr;

import com.google.inject.Inject;
import fr.n7.parser.antlr.internal.InternalPDL1Parser;
import fr.n7.services.PDL1GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PDL1Parser extends AbstractAntlrParser {

	@Inject
	private PDL1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPDL1Parser createParser(XtextTokenStream stream) {
		return new InternalPDL1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Process";
	}

	public PDL1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PDL1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
