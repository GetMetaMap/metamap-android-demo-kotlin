package com.metamap.kotlin_demo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.metamap.metamap_sdk.MetamapButton
import com.metamap.metamap_sdk.MetamapSdk.ARG_IDENTITY_ID
import com.metamap.metamap_sdk.MetamapSdk.ARG_VERIFICATION_ID

class ResultApiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metamap_button)
        val btn = findViewById<MetamapButton>(R.id.metamapButton)
        btn.setParams(resultLauncher, this, "YOUR_CLIENT_ID", "YOUR_FLOW_ID")
    }

    /*
     * In case you want to use Activity Result API
     */
    private val resultLauncher = registerForActivityResult<Intent, ActivityResult>(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult ->
        val data = result.data
        if (data == null) {
            Toast.makeText(this, "Verification cancelled", Toast.LENGTH_SHORT).show()
            return@registerForActivityResult
        }
        if (result.resultCode == RESULT_OK) {
            // There are no request codes
            Toast.makeText(
                this,
                "Verification success! " +
                        "VerificationId:" + data.getStringExtra(ARG_VERIFICATION_ID) +
                        "IdentityId: " + data.getStringExtra(ARG_IDENTITY_ID),
                Toast.LENGTH_SHORT
            ).show()
        } else {
            Toast.makeText(
                this,
                "Verification cancelled! " +
                        "VerificationId:" + data.getStringExtra(ARG_VERIFICATION_ID) +
                        "IdentityId: " + data.getStringExtra(ARG_IDENTITY_ID),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}