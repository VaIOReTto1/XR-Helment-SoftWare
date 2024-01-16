package com.example.myapplication.ui.page

import AlbumButton
import CameraPreview
import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomePage() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth().padding(25.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Rounded.Menu,
                "image",
                modifier = Modifier.size(35.dp)
            )
            Icon(
                imageVector = Icons.Rounded.Settings,
                "image",
                modifier = Modifier.size(28.dp)
            )
        }
        Box (modifier = Modifier.fillMaxWidth().height(500.dp).padding(20.dp)){
            CameraPreview()
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .padding(21.dp).height(100.dp).fillMaxWidth()
                    .shadow(4.dp, RoundedCornerShape(10.dp))
                    .border(2.dp, Color.Black, RoundedCornerShape(10.dp))
                    .background(Color.White, RoundedCornerShape(10.dp)),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Rounded.Person,
                    contentDescription = "Menu",
                    modifier = Modifier
                        .padding(8.dp)
                        .clip(CircleShape).size(50.dp)
                        .border(2.dp, Color.Black, CircleShape).padding(8.dp)
                )
                Icon(
                    imageVector = Icons.Rounded.DateRange,
                    contentDescription = "Settings",
                    modifier = Modifier
                        .padding(8.dp)
                        .clip(CircleShape).size(50.dp)
                        .border(2.dp, Color.Black, CircleShape).padding(8.dp)
                )
                Icon(
                    imageVector = Icons.Rounded.KeyboardArrowUp,
                    contentDescription = "Call",
                    modifier = Modifier
                        .padding(8.dp)
                        .clip(CircleShape).size(50.dp)
                        .border(2.dp, Color.Black, CircleShape).padding(8.dp)
                )
            }
        }
        AlbumButton()
    }
}

@Composable
@Preview
fun PreviewHomePage() {
    HomePage()
}