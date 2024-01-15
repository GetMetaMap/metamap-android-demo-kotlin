package com.metamap.kotlin_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.metamap.metamap_sdk.Metadata
import com.metamap.metamap_sdk.MetamapButton
import com.metamap.metamap_sdk.metadata.UIConfig

class ColorsCustomizationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metamap_button)

        val btn = findViewById<MetamapButton>(R.id.metamapButton)

        btn.setParams(
            activity = this,
            clientId = "YOUR_CLIENT_ID",
            flowId = "YOUR_FLOW_ID",
            metadata = Metadata.Builder()
                .uiConfig(
                    UIConfig.Builder()
                        .accentColor(ContextCompat.getColor(this, R.color.colorAccent))
                        .titleTextColor(ContextCompat.getColor(this, R.color.titleTextColor))
                        .subtitleTextColor(ContextCompat.getColor(this, R.color.subtitleTextColor))
                        .backgroundColor(ContextCompat.getColor(this, R.color.backgroundColor))
                        .lineColor(ContextCompat.getColor(this, R.color.lineColor))
                        .build()
                ).build()
        )
    }
}