package com.mert.valorantguideapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.mert.valorantguideapp.R
import com.mert.valorantguideapp.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    private val SPLASH_SCREEN = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        with(binding) {
            imageViewSplashScreenLogo.animation =
                AnimationUtils.loadAnimation(this@SplashScreenActivity, R.anim.top_animation)
            textViewSplashScreenSlogan.animation =
                AnimationUtils.loadAnimation(this@SplashScreenActivity, R.anim.bottom_animation)
        }

        Handler().postDelayed({
            val splashIntent = Intent(this@SplashScreenActivity, MainActivity::class.java)
            splashIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK
            startActivity(splashIntent)
            finish()
        }, SPLASH_SCREEN.toLong())
        return setContentView(binding.root)
    }
}

