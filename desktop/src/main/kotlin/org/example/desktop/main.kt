package org.example.desktop

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Window
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import org.example.shared.ui.app.App
import org.example.shared.ui.app.AppViewModel

fun main() = application {

    Window(
        icon = rememberVectorPainter(
            Icons.TwoTone.Window
        ),
        onCloseRequest = ::exitApplication,
        title = "Compose for Desktop",
        state = rememberWindowState(
            width = 300.dp, height = 300.dp,
            position = WindowPosition.Aligned(
                Alignment.Center
            )
        )
    ) {
        App(AppViewModel())
    }
}

@Preview
@Composable
fun DefaultPreview() {
    App(AppViewModel())
}