package org.example.scenes.root

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import org.example.scenes.root.MainHub.MainHubScreen
import org.example.scenes.root.Profile.ProfileScreen
import org.example.scenes.root.login.LoginScreen
import org.example.scenes.root.onboarding.OnboardingScreen

@Composable
fun RootContent(rootComponent: RootComponent) {
    Children(rootComponent.stack, animation = stackAnimation(slide())) { child ->
        when(child.instance) {
            is RootComponent.Child.Login -> LoginScreen(rootComponent.getNavigator())
            is RootComponent.Child.Onboarding -> OnboardingScreen(rootComponent.getNavigator())
            is RootComponent.Child.MainHub -> MainHubScreen(rootComponent.getNavigator())
            is RootComponent.Child.Profile -> ProfileScreen(rootComponent.getNavigator())
        }
    }
}