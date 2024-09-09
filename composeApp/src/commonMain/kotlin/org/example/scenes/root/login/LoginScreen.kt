package org.example.scenes.root.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.example.scenes.root.RootComponent
import org.example.scenes.root.RootNavigator

@Composable
fun LoginScreen(navigator: RootNavigator) {
    Surface(modifier = Modifier.fillMaxSize(), color = Color.Blue) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Login")
            OutlinedButton(onClick = navigator::openOnboarding) {
                Text("Next")
            }
        }
    }
}