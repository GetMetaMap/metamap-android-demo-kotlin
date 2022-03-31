package com.metamap.kotlin_demo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.metamap.metamap_sdk.Metadata
import com.metamap.metamap_sdk.MetamapButton
import com.metamap.metamap_sdk.MetamapSdk.ARG_IDENTITY_ID
import com.metamap.metamap_sdk.MetamapSdk.ARG_VERIFICATION_ID
import com.metamap.metamap_sdk.MetamapSdk.DEFAULT_REQUEST_CODE

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<MetamapButton>(R.id.metamapButton)

        btn.setParams(
            this,
            "YOUR_CLIENT_ID",
            "YOUR_FLOW_ID",
            Metadata.Builder()
                .with("userId", "qwfguweo")
                .with("type", 2)
                .build()
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == DEFAULT_REQUEST_CODE) {
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


//    var resultLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
//        ActivityResultContracts.StartActivityForResult()
//    ) { result ->
//        val data: Intent? = result.getData()
//        if (data == null) {
//            Toast.makeText(this@MainActivity, "Verification cancelled", Toast.LENGTH_SHORT)
//                .show()
//            return@registerForActivityResult
//        }
//        if (result.resultCode == Activity.RESULT_OK) {
//            // There are no request codes
//            Toast.makeText(
//                this@MainActivity,
//                "Verification success! " +
//                        "VerificationId:" + data.getStringExtra(ARG_VERIFICATION_ID) +
//                        "IdentityId: " + data.getStringExtra(ARG_IDENTITY_ID),
//                Toast.LENGTH_SHORT
//            ).show()
//        } else {
//            Toast.makeText(
//                this@MainActivity,
//                "Verification cancelled! " +
//                        "VerificationId:" + data.getStringExtra(ARG_VERIFICATION_ID) +
//                        "IdentityId: " + data.getStringExtra(ARG_IDENTITY_ID),
//                Toast.LENGTH_SHORT
//            ).show()
//        }
//    }
}