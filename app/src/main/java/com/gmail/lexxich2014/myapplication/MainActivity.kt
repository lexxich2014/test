package com.gmail.lexxich2014.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    var isFirstRun: Boolean=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity","У лукоморья дуб зелёный;")

    }

    override fun onStart() {
        super.onStart()
        if(!isFirstRun) return
        Log.d("MainActivity","Златая цепь на дубе том:")
    }

    override fun onResume() {
        super.onResume()
        if(!isFirstRun) return
        Log.d("MainActivity","И днём и ночью кот учёный")
    }

    override fun onPause() {
        super.onPause()
        if(!isFirstRun) return
        Log.d("MainActivity","Всё ходит по цепи кругом;")
    }

    override fun onStop() {
        super.onStop()
        if(!isFirstRun) return
        isFirstRun=false
        Log.d("MainActivity","Идёт направо — песнь заводит,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","Налево — сказку говорит")
    }



    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","Там чудеса: там леший бродит...")
    }
}