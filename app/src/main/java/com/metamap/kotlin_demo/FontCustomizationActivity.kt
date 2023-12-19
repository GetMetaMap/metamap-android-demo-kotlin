package com.metamap.kotlin_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.metamap.metamap_sdk.Metadata
import com.metamap.metamap_sdk.MetamapButton
import com.metamap.metamap_sdk.metadata.FontConfig
import com.metamap.metamap_sdk.metadata.UIConfig

class FontCustomizationActivity : AppCompatActivity() {
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
                    UIConfig(
                        fontConfig = FontConfig(
                            "comic_neue.ttf",
                            "comic_neue_bold.ttf"
                        )
                    )
                )
                .build()
        )
    }
}