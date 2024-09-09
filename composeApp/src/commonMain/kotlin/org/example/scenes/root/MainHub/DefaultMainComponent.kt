package org.example.scenes.root.MainHub

import com.arkivanov.decompose.ComponentContext

class DefaultMainComponent(
    private val componentContext: ComponentContext
) : MainComponent, ComponentContext by componentContext {

}