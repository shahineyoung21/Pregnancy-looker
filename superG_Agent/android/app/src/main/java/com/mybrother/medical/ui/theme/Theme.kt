package com.mybrother.medical.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF4CAF50),
    secondary = Color(0xFF81C784),
    tertiary = Color(0xFF66BB6A),
    background = Color(0xFFF5F5F5),
    surface = Color(0xFFFFFFFF),
    error = Color(0xFFB00020)
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFF81C784),
    secondary = Color(0xFF4CAF50),
    tertiary = Color(0xFF66BB6A),
    background = Color(0xFF121212),
    surface = Color(0xFF1E1E1E),
    error = Color(0xFFCF6679)
)

@Composable
fun MyBrotherMedicalTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}
