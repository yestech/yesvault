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

package org.yestech.vault.components;

import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PersistentLocale;

import java.util.Locale;

/**
 * @author $Author: $
 * @version $Revision: $
 */
public class DefaultLayout
{
    private static final String ENGLISH_LANG = "en";
    private static final String PERSIAN_LANG = "fa";
    private static final Locale ENGLISH_LOCAL = new Locale(ENGLISH_LANG);
    private static final Locale PERSIAN_LOCAL = new Locale(PERSIAN_LANG);

    @SuppressWarnings({"UnusedDeclaration"})
    @Inject
    private PersistentLocale localeService;

//    @Environmental
//    private RenderSupport pageRenderSupport;
//
//    @Inject
//    @Path("context:/style/main.css")
//    private Asset mainStylesheet;
//
//    @Inject
//    @Path("context:/style/ltr.css")
//    private Asset ltrStylesheet;
//
//    @Inject
//    @Path("context:/style/rtl.css")
//    private Asset rtlStylesheet;
//
    @Parameter(required = true)
    private String currentPage;

//    @BeginRender
//    void beginRender()
//    {
//        pageRenderSupport.addStylesheetLink(mainStylesheet, null);
//
//        if (localeService.get() == null || localeService.get().getLanguage().equalsIgnoreCase(ENGLISH_LANG))
//        {
//            pageRenderSupport.addStylesheetLink(ltrStylesheet, null);
//        }
//        else
//        {
//            pageRenderSupport.addStylesheetLink(rtlStylesheet, null);
//        }
//    }

//    @OnEvent(value = "action", component = "locale")
//    void changeLocale()
//    {
//        String lang = localeService.get() != null ? localeService.get().getLanguage() : ENGLISH_LANG;
//        if (PERSIAN_LANG.equalsIgnoreCase(lang))
//        {
//            localeService.set(ENGLISH_LOCAL);
//        }
//        else
//        {
//            localeService.set(PERSIAN_LOCAL);
//        }
//    }

//    @OnEvent(value = "action")
//    String changePage(String page)
//    {
//        return page;
//    }

    public void setCurrentPage(String currentPage)
    {
        this.currentPage = currentPage;
    }

    public String getCurrentPage()
    {
        return currentPage;
    }
}
