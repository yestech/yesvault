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

/*
 *
 * Original Author:  Artie Copeland
 * Last Modified Date: $DateTime: $
 */
package org.yestech.vault.components;

import org.yestech.vault.objectmodel.Credential;

/**
 * @author $Author: $
 * @version $Revision: $
 */
public class Login
{
    private Credential credential;

    public Credential getCredential()
    {
        return credential;
    }

    public void setCredential(Credential credential)
    {
        this.credential = credential;
    }
}
