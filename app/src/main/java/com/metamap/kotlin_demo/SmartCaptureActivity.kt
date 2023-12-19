package com.metamap.kotlin_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.metamap.metamap_sdk.MetamapButton

/**
 * Once the smart capture dependency is added it will automatically be enabled.
 * However, if you want to enable/disable it manually, please use the following methods
 * Enable the Smart Capture: MetamapSdk.enableSmartCapture()
 * Disable the Smart Capture: MetamapSdk.disableSmartCapture()
 */
class SmartCaptureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metamap_button)


        val btn = findViewById<MetamapButton>(R.id.metamapButton)
        btn.setParams(this, "YOUR_CLIENT_ID", "YOUR_FLOW_ID")
    }
}