package com.mert.valorantguideapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    private val SPLASH_SCREEN = 2500
    private var topAnim: Animation? = null
    private var bottomAnim: Animation? = null
    private var image: ImageView? = null
    private var slogan: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash_screen)
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        image = findViewById<ImageView>(R.id.imageViewSplashScreenLogo)
        slogan = findViewById<TextView>(R.id.textViewSplashScreenSlogan)
        image!!.animation = topAnim
        slogan!!.animation = bottomAnim
        Handler().postDelayed({
            val splashIntent = Intent(this@SplashScreenActivity, MainActivity::class.java)
            splashIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK
            startActivity(splashIntent)
            finish()
        }, SPLASH_SCREEN.toLong())
    }
}

