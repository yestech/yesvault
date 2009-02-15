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

import org.apache.tapestry5.annotations.ApplicationState;
import org.yestech.vault.objectmodel.IUser;

/**
 * @author $Author: $
 * @version $Revision: $
 */
public class NavigationTree
{

    @ApplicationState
    private IUser user;

    public boolean isAuthenticated()
    {
        return user != null && user.isAuthenticated();
    }
}
