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

package org.yestech.vault.objectmodel;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author $Author: $
 * @version $Revision: $
 */
public interface IItem extends Serializable
{
    String getUserName();

    void setUserName(String userName);

    String getPassword();

    void setPassword(String password);

    String getIdentifier();

    void setIdentifier(String identifier);

    String getNote();

    void setNote(String note);

    String getUrl();

    void setUrl(String url);

    UUID getKey();

    void setKey(UUID key);
}
