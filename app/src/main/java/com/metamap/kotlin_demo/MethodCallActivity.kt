package com.metamap.kotlin_demo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.metamap.metamap_sdk.Metadata
import com.metamap.metamap_sdk.MetamapSdk.startFlow

class MethodCallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_button)
        val btn = findViewById<Button>(R.id.metamapButton)
        btn.setOnClickListener { v: View? ->
            startFlow(
                activity = this,
                clientId = "YOUR_CLIENT_ID",
                flowId = "YOUR_FLOW_ID",
                metadata = Metadata.Builder()
                    .additionalData("userId", "qwfguweo")
                    .additionalData("type", 2)
                    .build()
            )
        }
    }
}