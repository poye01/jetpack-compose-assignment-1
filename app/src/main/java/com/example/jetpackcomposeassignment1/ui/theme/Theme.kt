package com.example.jetpackcomposeassignment1.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
private val LightColors = lightColorScheme(
    primary = CardBlue,
    onPrimary =DarkBlueGray ,
    surface = LightBlue,
    onSurface = NavyBlue,
    background = LightBlue
)

private val DarkColors = darkColorScheme(
    primary = NavyBlue,
    onPrimary = White,
    surface = NavyBlue,
    onSurface = LightBlue,
    background = DarkBlueGray,
)

@Composable
fun JetpackComposeAssignment1Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
