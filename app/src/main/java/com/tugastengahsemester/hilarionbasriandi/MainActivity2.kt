package com.tugastengahsemester.hilarionbasriandi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.tugastengahsemester.FragmentSatu

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val fragmentSatu = FragmentSatu()
        val fragment:Fragment? = supportFragmentManager.findFragmentByTag(FragmentSatu::class.java.simpleName)
         if (fragment !is  FragmentSatu){
             supportFragmentManager.beginTransaction()
                     .add(R.id.container, fragmentSatu, FragmentSatu::class.java.simpleName)
                     .commit()
         }



    }
}