package com.bdadevfs.fragment

import android.view.LayoutInflater
import com.bdadevfs.fragment.base.BaseFragment
import com.bdadevfs.fragment.databinding.Fragment2Binding

class Fragment2 : BaseFragment<Fragment2Binding>() {

    override fun initView() {

    }

    override fun handleEvent() {

    }

    override fun observer() {

    }
    override fun getViewBinding(inflater: LayoutInflater): Fragment2Binding {
        return Fragment2Binding.inflate(inflater)
    }


}