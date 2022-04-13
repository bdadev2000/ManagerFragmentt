package com.bdadevfs.fragment.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * @author ITSOL JAPAN
 * Created on 15/03/2022.
 * Copyright © 2020 YSL Solution Co., Ltd. All rights reserved.
 **/

abstract class BaseFragment<V : ViewBinding> : Fragment() {

    protected lateinit var binding :V

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getViewBinding(inflater);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        handleEvent()
        observer()
    }

    protected abstract fun getViewBinding(inflater: LayoutInflater): V

    protected abstract fun initView()

    protected abstract fun handleEvent()

    protected abstract fun observer()
}