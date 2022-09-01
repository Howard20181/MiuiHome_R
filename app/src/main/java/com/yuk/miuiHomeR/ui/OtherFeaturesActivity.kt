package com.yuk.miuiHomeR.ui

import androidx.fragment.app.Fragment
import com.yuk.miuiHomeR.R
import com.yuk.miuiHomeR.ui.base.BaseAppCompatActivity
import com.yuk.miuiHomeR.ui.base.SubFragment

class OtherFeaturesActivity : BaseAppCompatActivity() {

    override fun initFragment(): Fragment {
        return OtherFeaturesFragment()
    }

    class OtherFeaturesFragment : SubFragment() {
        override fun getContentResId(): Int {
            return R.xml.prefs_other_features
        }

        override fun initPrefs() {}
    }
}