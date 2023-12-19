package com.metamap.kotlin_demo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.methodCall).setOnClickListener(listener)
        findViewById<View>(R.id.metamapButton).setOnClickListener(listener)
        findViewById<View>(R.id.metadata).setOnClickListener(listener)
        findViewById<View>(R.id.onActivityResult).setOnClickListener(listener)
        findViewById<View>(R.id.resultApi).setOnClickListener(listener)
        findViewById<View>(R.id.colorsCustomization).setOnClickListener(listener)
        findViewById<View>(R.id.fontCustomization).setOnClickListener(listener)
        findViewById<View>(R.id.facematch).setOnClickListener(listener)
        findViewById<View>(R.id.cooldown).setOnClickListener(listener)
        findViewById<View>(R.id.onDemandConfig).setOnClickListener(listener)
        findViewById<View>(R.id.encryptionConfig).setOnClickListener(listener)
        findViewById<View>(R.id.smartCapture).setOnClickListener(listener)
    }

    private val listener = View.OnClickListener { v: View ->
        when (v.id) {
            R.id.methodCall -> {
                startActivity(Intent(this@MainActivity, MethodCallActivity::class.java))
            }

            R.id.metamapButton -> {
                startActivity(Intent(this@MainActivity, MetamapButtonActivity::class.java))
            }

            R.id.metadata -> {
                startActivity(Intent(this@MainActivity, MetadataActivity::class.java))
            }

            R.id.onActivityResult -> {
                startActivity(Intent(this@MainActivity, OnActivityResultActivity::class.java))
            }

            R.id.resultApi -> {
                startActivity(Intent(this@MainActivity, ResultApiActivity::class.java))
            }

            R.id.colorsCustomization -> {
                startActivity(Intent(this@MainActivity, ColorsCustomizationActivity::class.java))
            }

            R.id.fontCustomization -> {
                startActivity(Intent(this@MainActivity, FontCustomizationActivity::class.java))
            }

            R.id.facematch -> {
                startActivity(Intent(this@MainActivity, FaceMatchActivity::class.java))
            }

            R.id.cooldown -> {
                startActivity(Intent(this@MainActivity, CooldownActivity::class.java))
            }

            R.id.onDemandConfig -> {
                startActivity(Intent(this@MainActivity, OnDemandConfigActivity::class.java))
            }

            R.id.encryptionConfig -> {
                startActivity(Intent(this@MainActivity, EncryptionConfigActivity::class.java))
            }

            R.id.smartCapture -> {
                startActivity(Intent(this@MainActivity, SmartCaptureActivity::class.java))
            }
        }
    }
}