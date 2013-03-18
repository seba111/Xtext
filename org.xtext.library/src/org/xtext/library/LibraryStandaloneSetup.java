
package org.xtext.library;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LibraryStandaloneSetup extends LibraryStandaloneSetupGenerated{

	public static void doSetup() {
		new LibraryStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

