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

import org.apache.tapestry5.beaneditor.Validate;

/**
 * @author $Author: $
 * @version $Revision: $
 */
public class Credential
{
    private String username;
    private String password;

    public String getUsername()
    {
        return username;
    }

    @Validate("required")
    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    @Validate("required")
    public void setPassword(String password)
    {
        this.password = password;
    }
}
