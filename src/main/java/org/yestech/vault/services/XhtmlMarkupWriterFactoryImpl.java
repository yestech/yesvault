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

package org.yestech.vault.services;

import org.apache.tapestry5.ContentType;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.dom.DefaultMarkupModel;
import org.apache.tapestry5.dom.EndTagStyle;
import org.apache.tapestry5.dom.MarkupModel;
import org.apache.tapestry5.internal.services.MarkupWriterImpl;
import org.apache.tapestry5.services.MarkupWriterFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author $Author: $
 * @version $Revision: $
 */
public class XhtmlMarkupWriterFactoryImpl
        implements MarkupWriterFactory
{

    private final String applicationCharset;

    private final MarkupModel xmlModel = new DefaultMarkupModel()
    {
        private final Set<String> DONT_ABRV = new HashSet<String>(Arrays.asList("script", "div", "span", "p", "textarea", "select"));

        @Override
        public EndTagStyle getEndTagStyle(String element)
        {
            boolean isDontAbr = DONT_ABRV.contains(element);
            return isDontAbr ? EndTagStyle.REQUIRE : EndTagStyle.ABBREVIATE;

        }

        @Override
        public boolean isXML()
        {
            return true;
        }
    };

    public XhtmlMarkupWriterFactoryImpl(String applicationCharset)
    {
        this.applicationCharset = applicationCharset;
    }

    public MarkupWriter newPartialMarkupWriter(ContentType contentType)
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public MarkupWriter newMarkupWriter(ContentType contentType)
    {
        return new MarkupWriterImpl(xmlModel, contentType.getParameter("charset"));
    }

    public MarkupWriter newMarkupWriter(String pageName)
    {
        return new MarkupWriterImpl(xmlModel, applicationCharset);
    }

}
