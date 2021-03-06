/******************************************************************************
 * Copyright (c) 2005-2007 BEA Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Konstantin Komissarchik
 ******************************************************************************/

package org.eclipse.wst.common.project.facet.core.tests.support;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

/**
 * @author <a href="mailto:kosta@bea.com">Konstantin Komissarchik</a>
 */

public final class Facet1InstallDelegate

    implements IDelegate
    
{
    public void execute( final IProject project, 
                         final IProjectFacetVersion fv, 
                         final Object config, 
                         final IProgressMonitor monitor ) 
    
        throws CoreException
        
    {
        final IFile file = project.getFile( "facet1.txt" );
        TestUtils.writeToFile( file, fv.getVersionString() );
    }
    
}
