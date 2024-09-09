package org.example.scenes.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import kotlinx.serialization.Serializable

interface RootComponent {
    val stack: Value<ChildStack<*, Child>>
    fun getNavigator(): RootNavigator

    sealed interface Child {
        data object Login : Child
        data object Onboarding : Child
        data object MainHub : Child
        data object Profile : Child
    }

    @Serializable
    sealed interface Config {
        @Serializable
        data object Login: Config
        @Serializable
        data object Onboarding : Config
        @Serializable
        data object MainHub : Config
        @Serializable
        data object Profile : Config
    }
}