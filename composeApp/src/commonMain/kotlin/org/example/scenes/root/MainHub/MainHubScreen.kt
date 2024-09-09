package org.example.scenes.root.MainHub

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
import org.example.scenes.root.RootNavigator

@Composable
fun MainHubScreen(navigator: RootNavigator) {
    Surface(modifier = Modifier.fillMaxSize(), color = Color.Red) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Main Hub")
            OutlinedButton(onClick = navigator::openProfile) {
                Text("Next")
            }
        }
    }
}