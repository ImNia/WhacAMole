package com.delirium.game

import android.os.Bundle
import android.widget.Button
import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration

class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_launcher_screen)

        val buttonPlay = findViewById<Button>(R.id.button_play)
        val config = AndroidApplicationConfiguration()
        initialize(WhacAMole(), config)
/*
        buttonPlay.setOnClickListener {

        }*/
    }
}