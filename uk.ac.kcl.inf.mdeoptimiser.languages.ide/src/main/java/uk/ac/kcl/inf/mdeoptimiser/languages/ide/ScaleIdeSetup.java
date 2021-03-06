/*
 * generated by Xtext 2.16.0
 */
package uk.ac.kcl.inf.mdeoptimiser.languages.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.inf.mdeoptimiser.languages.ScaleRuntimeModule;
import uk.ac.kcl.inf.mdeoptimiser.languages.ScaleStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ScaleIdeSetup extends ScaleStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ScaleRuntimeModule(), new ScaleIdeModule()));
	}
	
}
