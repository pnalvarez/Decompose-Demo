package org.example.decomposedemo

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import org.example.scenes.root.DefaultRootComponent
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.example.scenes.root.RootContent

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        val lifecycle = LifecycleRegistry()
        val componentContext = DefaultComponentContext(lifecycle)
        val rootComponent = DefaultRootComponent(componentContext)
        RootContent(rootComponent)
    }
}