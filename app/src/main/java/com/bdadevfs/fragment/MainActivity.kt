package com.bdadevfs.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    val fm: FragmentManager = supportFragmentManager
    val homeFragment = HomeFragment()
    val fragment1 = Fragment1()
    val fragment2 = Fragment2()
    var active: Fragment = homeFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNavigatioView = findViewById<BottomNavigationView>(R.id.activity_main_bottom_navigation_view)
        bottomNavigatioView.setOnItemSelectedListener {item->
            when(item.itemId){
                R.id.homeFragment->{
                    fm.beginTransaction().hide(active).show(homeFragment).commit()
                    active=homeFragment
                    return@setOnItemSelectedListener true
                }
                R.id.fragment1->{
                    fm.beginTransaction().hide(active).show(fragment1).commit()
                    active=fragment1
                    return@setOnItemSelectedListener true
                }
                R.id.fragment2->{
                    fm.beginTransaction().hide(active).show(fragment2).commit()
                    active=fragment2
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
        fm.beginTransaction().add(R.id.activity_main_nav_host_fragment,fragment2,"3").commit()
        fm.beginTransaction().add(R.id.activity_main_nav_host_fragment,fragment1,"2").hide(fragment2).commit()
        fm.beginTransaction().add(R.id.activity_main_nav_host_fragment,homeFragment,"1").hide(fragment1).commit()
    }
}