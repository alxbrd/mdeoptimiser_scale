/*
 * generated by Xtext 2.18.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.inf.mdeoptimiser.languages.parser.antlr.internal.InternalMeerkatParser;
import uk.ac.kcl.inf.mdeoptimiser.languages.services.MeerkatGrammarAccess;

public class MeerkatParser extends AbstractAntlrParser {

	@Inject
	private MeerkatGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMeerkatParser createParser(XtextTokenStream stream) {
		return new InternalMeerkatParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Analyser";
	}

	public MeerkatGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MeerkatGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
