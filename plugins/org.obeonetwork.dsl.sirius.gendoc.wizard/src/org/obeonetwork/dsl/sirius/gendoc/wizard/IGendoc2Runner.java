/*****************************************************************************
 * Copyright (c) 2011 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Barthelemy HABA (Atos Origin) barthelemy.haba@atosorigin.com - 
 *
 *****************************************************************************/
//CHECKSTYLE:OFF
package org.obeonetwork.dsl.sirius.gendoc.wizard;

import java.util.List;
import java.util.regex.Pattern;

/**
 * the loader of the template for document generation. to use it, put an extension to
 * :"org.topcased.gendoc2.wizard.runner", and reference your own IGendoc2Runner This class comes from
 * :pserver:cvs.gforge.enseeiht.fr:/cvsroot/topcased-gendoc
 * ,plugins/gendoc2/org.topcased.gendoc2.wizard,org.topcased.gendoc2.wizard.
 */
public interface IGendoc2Runner {

	/**
	 * @return give all the possible extension of model to treat
	 */
	Pattern getPattern();

	/**
	 * @return all format of document possible to be generated by this runner
	 */
	List<IGendoc2Template> getGendoc2Templates();

	/**
	 * @return the label associated to this runner. use for display
	 */
	String getLabel();
}
