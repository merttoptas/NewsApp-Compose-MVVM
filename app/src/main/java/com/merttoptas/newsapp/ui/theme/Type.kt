package com.merttoptas.newsapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.merttoptas.newsapp.R

val Montserrat = FontFamily(
    Font(R.font.montserrat_regular, FontWeight.Light),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_semi_bold, FontWeight.SemiBold),
    Font(R.font.montserrat_bold, FontWeight.Bold),
    Font(R.font.montserrat_extra_bold, FontWeight.ExtraBold)
)

val Typography = Typography(
    h3 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 32.sp
    ),
    h4 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 30.sp
    ),
    h5 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 22.sp,
    ),
    subtitle1 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 18.sp,
    ),
    subtitle2 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
    ),
    body1 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp,
    ),
    overline = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W500,
        fontSize = 10.sp,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W500,
        fontSize = 18.sp,
    )
)