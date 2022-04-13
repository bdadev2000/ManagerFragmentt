package com.bdadevfs.fragment

import android.view.LayoutInflater
import com.bdadevfs.fragment.base.BaseFragment
import com.bdadevfs.fragment.databinding.Fragment1Binding

class Fragment1 : BaseFragment<Fragment1Binding>() {
    override fun getViewBinding(inflater: LayoutInflater): Fragment1Binding {
        return Fragment1Binding.inflate(inflater)
    }

    override fun initView() {

    }

    override fun handleEvent() {

    }

    override fun observer() {

    }


}