package org.example.scenes.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.router.stack.replaceAll
import com.arkivanov.decompose.value.Value

class RootNavigator(
    private val navigation: StackNavigation<RootComponent.Config>,
    private val screenStack: Value<ChildStack<*, RootComponent.Child>>
) {
    fun openOnboarding() {
        navigation.push(RootComponent.Config.Onboarding)
    }

    fun openMainHub() {
        navigation.push(RootComponent.Config.MainHub)
    }

    fun openProfile() {
        navigation.push(RootComponent.Config.Profile)
    }

    fun openLogin() {
        navigation.replaceAll(RootComponent.Config.Login)
    }
}