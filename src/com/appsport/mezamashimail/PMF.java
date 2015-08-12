package com.appsport.mezamashimail;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

/*
 * PMFクラス
 * PersistenceManagerFactoryを利用したデータストアを操作するためのクラス
 */
public final class PMF {
    private static final PersistenceManagerFactory pmfInstance = JDOHelper
            .getPersistenceManagerFactory("transactions-optional");

    private PMF() { /* 何もしない */ }

    public static PersistenceManagerFactory get() {
        return pmfInstance;
    }
}