package org.example.scenes.root.MainHub

import kotlinx.serialization.Serializable

interface MainComponent {

    @Serializable
    sealed interface Configuration {
        @Serializable
        data object Hub : Configuration
        @Serializable
        data object Transact : Configuration
        @Serializable
        data object Wallet : Configuration
    }
}