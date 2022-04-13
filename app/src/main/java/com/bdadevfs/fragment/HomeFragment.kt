package com.bdadevfs.fragment
import android.view.LayoutInflater
import com.bdadevfs.fragment.base.BaseFragment
import com.bdadevfs.fragment.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {


    override fun initView() {

    }

    override fun handleEvent() {

    }

    override fun observer() {

    }

    override fun getViewBinding(inflater: LayoutInflater): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater)
    }
}