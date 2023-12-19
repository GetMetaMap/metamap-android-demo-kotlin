package com.metamap.kotlin_demo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.metamap.metamap_sdk.MetamapButton
import com.metamap.metamap_sdk.MetamapSdk
import com.metamap.metamap_sdk.MetamapSdk.ARG_IDENTITY_ID
import com.metamap.metamap_sdk.MetamapSdk.ARG_VERIFICATION_ID

class OnActivityResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metamap_button)
        val btn = findViewById<MetamapButton>(R.id.metamapButton)
        btn.setParams(this, "YOUR_CLIENT_ID", "YOUR_FLOW_ID")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == MetamapSdk.DEFAULT_REQUEST_CODE) {
            if (resultCode == RESULT_OK && data != null) {
                // There are no request codes
                Toast.makeText(
                    this,
                    "onActivityResult Verification success! " +
                            "VerificationId:" + data.getStringExtra(ARG_VERIFICATION_ID) +
                            "IdentityId: " + data.getStringExtra(ARG_IDENTITY_ID),
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                if (data != null) {
                    Toast.makeText(
                        this,
                        "onActivityResult Verification cancelled! " +
                                "VerificationId:" + data.getStringExtra(ARG_VERIFICATION_ID) +
                                "IdentityId: " + data.getStringExtra(ARG_IDENTITY_ID),
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(
                        this,
                        "onActivityResult Verification cancelled!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}