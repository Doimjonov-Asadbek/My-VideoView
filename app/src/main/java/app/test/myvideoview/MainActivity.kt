package app.test.myvideoview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)

        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.vid)
        videoView.start()
    }
}