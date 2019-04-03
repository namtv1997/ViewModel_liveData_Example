package com.example.viewmodel_livedata_examble.fragment



import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewmodel_livedata_examble.viewmodel.InforViewModel

import com.example.viewmodel_livedata_examble.R
import kotlinx.android.synthetic.main.fragment_information.*

class InformationFragment : Fragment() {

    private var mInForViewModel: InforViewModel? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_information, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mInForViewModel= ViewModelProviders.of(activity!!).get(InforViewModel::class.java)
        btnSend.setOnClickListener {
            if (edtAddress.text.toString().isNotEmpty() && edtAddress.text.toString().isNotEmpty() && edtAge.text.toString().isNotEmpty()){
                mInForViewModel?.address?.value =edtAddress.text.toString()
                mInForViewModel?.userName?.value =edtUserName.text.toString()
                mInForViewModel?.age?.value =edtAge.text.toString().toInt()
            }
        }
    }


}
