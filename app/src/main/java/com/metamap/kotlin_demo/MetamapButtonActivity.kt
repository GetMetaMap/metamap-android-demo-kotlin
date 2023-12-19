package com.metamap.kotlin_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.metamap.metamap_sdk.MetamapButton

class MetamapButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metamap_button)

        val btn = findViewById<MetamapButton>(R.id.metamapButton)
        btn.setParams(this, "YOUR_CLIENT_ID", "YOUR_FLOW_ID")
    }
}