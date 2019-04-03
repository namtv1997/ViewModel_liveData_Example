package com.example.viewmodel_livedata_examble.fragment


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewmodel_livedata_examble.viewmodel.InforViewModel
import com.example.viewmodel_livedata_examble.R
import kotlinx.android.synthetic.main.fragment_age.*



class AgeFragment : Fragment() {
    private lateinit var mInForViewModel: InforViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_age, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mInForViewModel= ViewModelProviders.of(activity!!).get(InforViewModel::class.java)
        mInForViewModel.age.observe(activity!!, Observer { display() })
    }
    private fun display(){
        this.tvGetAge.text=mInForViewModel.age.value.toString()
    }
}
