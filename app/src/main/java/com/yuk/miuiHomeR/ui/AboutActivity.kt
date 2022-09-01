package com.yuk.miuiHomeR.ui

import androidx.fragment.app.Fragment
import com.yuk.miuiHomeR.R
import com.yuk.miuiHomeR.ui.base.BaseAppCompatActivity
import com.yuk.miuiHomeR.ui.base.SubFragment

class AboutActivity : BaseAppCompatActivity() {

    override fun initFragment(): Fragment {
        return AboutFragment()
    }

    class AboutFragment : SubFragment() {
        override fun getContentResId(): Int {
            return R.xml.prefs_about
        }

        override fun initPrefs() {

        }
    }
}