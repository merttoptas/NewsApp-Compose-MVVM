package com.merttoptas.newsapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = DarkGreyBlue,
    primaryVariant = StrongCyan,
    secondary = DarkGrayishBlue
)

private val LightColorPalette = lightColors(
    primary = DarkGreyBlue,
    primaryVariant = StrongCyan,
    secondary = LightGray,
    secondaryVariant = VeryDarkBlue,
    onError = StrongCyan,
    background = LightGray,
    surface = LightGray,
)

@Composable
fun NewsAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}