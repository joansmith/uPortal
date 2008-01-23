/**
 * Copyright 2007 The JA-SIG Collaborative.  All rights reserved.
 * See license distributed with this file and
 * available online at http://www.uportal.org/license.html
 */
package org.jasig.portal.channels.portlet;

import org.jasig.portal.PortalException;
import org.jasig.portal.portlet.om.IPortletWindow;

/**
 * Indicates that the portlet container failed to load the specified portlet.
 * 
 * @author Eric Dalquist
 * @version $Revision$
 */
public class PortletActionFailureException extends PortalException {
    private static final long serialVersionUID = 1L;
    
    private final IPortletWindow portletWindow; 

    public PortletActionFailureException(String msg, IPortletWindow portletWindow, Throwable cause) {
        super(msg, cause, true, true);
        this.portletWindow = portletWindow;
    }

    /**
     * @return the portletWindow
     */
    public IPortletWindow getPortletWindow() {
        return portletWindow;
    }
}