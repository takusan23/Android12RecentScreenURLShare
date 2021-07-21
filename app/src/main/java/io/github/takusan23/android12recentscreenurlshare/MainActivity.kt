package io.github.takusan23.android12recentscreenurlshare

import android.app.assist.AssistContent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {

    private val button by lazy { findViewById<Button>(R.id.button) }

    private var isURLShare = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            // フラグ切り替え
            isURLShare = !isURLShare
        }

    }

    override fun onProvideAssistContent(outContent: AssistContent?) {
        super.onProvideAssistContent(outContent)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // ここでURLを指定する
            outContent?.webUri = if (isURLShare) {
                "https://takusan.negitoro.dev/".toUri()
            } else {
                null
            }
        }
    }

}