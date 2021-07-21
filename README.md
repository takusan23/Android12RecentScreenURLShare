# Android12RecentScreenURLShare

Android 12から追加された、アプリ履歴画面からURLを共有する機能の実装方法？

```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onProvideAssistContent(outContent: AssistContent?) {
        super.onProvideAssistContent(outContent)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // ここでURLを指定する
            outContent?.webUri = "https://takusan.negitoro.dev/".toUri()
        }
    }

}
```


![Imgur](https://imgur.com/WxaAUa0.png)
