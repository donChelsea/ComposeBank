package com.example.composebank.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.composebank.R
import com.example.composebank.data.BottomNavigationItem

@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = { },
                    label = {
                        Text(
                            text = stringResource(id = item.title),
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = stringResource(id = item.title),
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            }
        }
    }
}

val items = listOf(
    BottomNavigationItem(
        title = R.string.home,
        icon = Icons.Rounded.Home
    ),
    BottomNavigationItem(
        title = R.string.wallet,
        icon = Icons.Rounded.Wallet
    ),
    BottomNavigationItem(
        title = R.string.notifications,
        icon = Icons.Rounded.Notifications
    ),
    BottomNavigationItem(
        title = R.string.account,
        icon = Icons.Rounded.AccountCircle
    ),
)