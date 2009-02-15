/*
 * YES Technology - http://yestech.org
 *
 * Licensed using GPL Available - http://opensource.org/licenses/gpl-license.php
 *
 * File name:           $RCSfile: $
 * Revision:            $Revision: $
 * Last revised by:     $Author: $
 * Last revision date:  $Date: $
 *
 * Original Author:     Arthur Copeland
 *
 */

package org.yestech.vault.pages;

import org.apache.tapestry5.annotations.Property;
import org.yestech.vault.objectmodel.Credential;

/**
 * Welcome Page
 */
public class Index
{
    @Property
    private Credential credential;

//    public Credential getCredentials()
//    {
//        return credentials;
//    }
//
//    public void setCredentials(Credential credentials)
//    {
//        this.credentials = credentials;
//    }
}
