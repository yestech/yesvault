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
public interface IUser
{
    boolean isAuthenticated();

    void setAuthenticated(boolean authenticated);
}
