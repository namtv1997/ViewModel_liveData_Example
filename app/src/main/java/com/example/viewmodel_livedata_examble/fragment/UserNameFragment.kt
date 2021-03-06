package com.example.viewmodel_livedata_examble.fragment


import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewmodel_livedata_examble.viewmodel.InforViewModel
import android.arch.lifecycle.Observer
import com.example.viewmodel_livedata_examble.R

import kotlinx.android.synthetic.main.fragment_user_name.*

class UserNameFragment : Fragment() {

    private lateinit var mInForViewModel: InforViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user_name, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mInForViewModel= ViewModelProviders.of(activity!!).get(InforViewModel::class.java)
        mInForViewModel.userName.observe(activity!!, Observer { display() })
    }

    private fun display(){
        this.tvGetUserName.text=mInForViewModel.userName.value
    }
}
