package com.example.deepn.learning

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var song:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        song=MediaPlayer.create(this,R.raw.chennaisuperkings)
        bt.setOnClickListener {

            if (song.isPlaying()) {
                song.pause()
                tv.text="PAUSED"
                bt.text="PLAY"
            }
            else{
                song.start()
                tv.text="PLAYING"
                bt.text="PAUSE"
            }
        }
        bt2.setOnClickListener {
            if (song.isPlaying())
                song.pause()

            finish()
        }
    }
}
