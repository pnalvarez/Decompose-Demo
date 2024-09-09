package org.example.scenes.root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value

class DefaultRootComponent(
    private val componentContext: ComponentContext
) : RootComponent, ComponentContext by componentContext {

    private val navigation = StackNavigation<RootComponent.Config>()

    override val stack: Value<ChildStack<*, RootComponent.Child>>
        get() = childStack(
            source = navigation,
            serializer = RootComponent.Config.serializer(),
            initialConfiguration = RootComponent.Config.Login,
            handleBackButton = true,
            childFactory = ::child)

    override fun getNavigator(): RootNavigator = RootNavigator(
        navigation = navigation,
        screenStack = stack
    )

    private fun child(
        config: RootComponent.Config,
        componentContext: ComponentContext
    ): RootComponent.Child =
        when (config) {
            is RootComponent.Config.Login -> RootComponent.Child.Login
            is RootComponent.Config.Onboarding -> RootComponent.Child.Onboarding
            is RootComponent.Config.MainHub -> RootComponent.Child.MainHub
            is RootComponent.Config.Profile -> RootComponent.Child.Profile
        }
}