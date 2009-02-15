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
package org.yestech.vault.objectmodel;

/**
 * @author $Author: $
 * @version $Revision: $
 */
public class User implements IUser
{
    private boolean authenticated;

    public boolean isAuthenticated()
    {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated)
    {
        this.authenticated = authenticated;
    }
}
