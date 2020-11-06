package com.tugastengahsemester

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tugastengahsemester.hilarionbasriandi.R
import kotlinx.android.synthetic.main.fragment_empat.*
import kotlinx.android.synthetic.main.fragment_tiga.*

class FragmentEmpat : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_empat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentSatu = FragmentSatu()



        button14.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, fragmentSatu, FragmentSatu::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }

        }
    }
}