package com.metamap.kotlin_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.metamap.metamap_sdk.Metadata
import com.metamap.metamap_sdk.MetamapButton

class CooldownActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metamap_button)

        val btn = findViewById<MetamapButton>(R.id.metamapButton)
        btn.setParams(
            activity = this,
            clientId = "YOUR_CLIENT_ID",
            flowId = "YOUR_FLOW_ID",
            metadata = Metadata.Builder()
                .additionalData("phoneNumber", "USER_PHONE_NUMBER") //Any of the fields is valid
//                .additionalData("email", "USER_EMAIL")
//                .additionalData("documentNumber", "USER_DOCUMENT_NUMBER")
                .build()
        )
    }
}