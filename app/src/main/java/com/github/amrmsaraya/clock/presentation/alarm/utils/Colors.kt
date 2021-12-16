package com.github.amrmsaraya.clock.presentation.alarm.utils

import androidx.compose.ui.graphics.Color
import com.github.amrmsaraya.clock.presentation.theme.*

enum class Colors(
    val activeBackgroundColor: Color,
    val contentColor: Color
) {
    INDIGO(md_theme_dark_primary, md_theme_dark_onPrimary),
    BLUE(Blue200, Blue900),
    PURPLE(Purple200, Purple900),
    PINK(Pink200, Pink900),
    ORANGE(Orange200, Orange900),
    TEAL(Teal200, Teal900),
    GREEN(Green200, Green900),
}