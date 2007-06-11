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

package org.eclipse.wst.common.project.facet.core;

import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;

/**
 * Describes the runtime changed event to the RUNTIME_CHANGED event handlers.
 * 
 * @author <a href="mailto:kosta@bea.com">Konstantin Komissarchik</a>
 * @deprecated use the IFacetedProjectListener class from the facet.core.events package instead
 *   of the event handler extension point
 */

public interface IRuntimeChangedEvent
{
    /**
     * Returns the runtime previously associated with the project.
     * 
     * @return the runtime previously associated with the project, or
     *   <code>null</code>
     */
    
    IRuntime getOldRuntime();
    
    /**
     * Returns the runtime that's now associated with the project.
     * 
     * @return the runtime that's now associated with the project, or
     *   <code>null</code>
     */
    
    IRuntime getNewRuntime();
    
}