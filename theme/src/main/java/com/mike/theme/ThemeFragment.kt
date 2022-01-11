package com.mike.theme

import android.content.Context
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * MSample
 *
 * <p>Description: </p>
 * <br>
 *
 * <p>Copyright: Copyright (c) 2022</p>
 *
 * @author caizeming.czm@alibaba-inc.com
 * @version 1.0
 * 2022/1/11 2:12 下午
 */
class ThemeFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val contextThemeWrapper: Context = ContextThemeWrapper(activity, R.style.ViewTheme_Light)
        val localInflater = inflater.cloneInContext(contextThemeWrapper)
        return localInflater.inflate(R.layout.theme_fragment, container, false)
    }
}