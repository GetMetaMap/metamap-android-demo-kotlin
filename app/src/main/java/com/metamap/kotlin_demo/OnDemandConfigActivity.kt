package com.metamap.kotlin_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.metamap.metamap_sdk.MetamapButton

class OnDemandConfigActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metamap_button)
        val btn = findViewById<MetamapButton>(R.id.metamapButton)
        btn.setParams(
            activity = this,
            clientId = "YOUR_CLIENT_ID",
            flowId = "YOUR_FLOW_ID",
            configurationId = "YOUR_CONFIGURATION_ID"
        )
    }
}