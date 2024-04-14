package com.example.composebank.data

import androidx.annotation.StringRes
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.vector.ImageVector

@Immutable
data class BottomNavigationItem(
    @StringRes val title: Int,
    val icon: ImageVector
)
