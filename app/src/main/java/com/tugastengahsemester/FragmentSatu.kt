package com.tugastengahsemester

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tugastengahsemester.hilarionbasriandi.R
import kotlinx.android.synthetic.main.fragment_satu.*


/**
 * A simple [Fragment] subclass.
 .
 */
class FragmentSatu : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentDua = FragmentDua()
        val fragmentTiga = FragmentTiga()
        val fragmentEmpat = FragmentEmpat()


        btndua.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container,fragmentDua,FragmentDua::class.java.simpleName)
                        .addToBackStack(null)
                        .commit()
            }

        }
        button6.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container,fragmentTiga,FragmentTiga::class.java.simpleName)
                        .addToBackStack(null)
                        .commit()
            }

        }
        button7.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container,fragmentEmpat,FragmentEmpat::class.java.simpleName)
                        .addToBackStack(null)
                        .commit()
            }

        }

        }



    }


