import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun AlbumButton() {
    val context = LocalContext.current

    Box(contentAlignment = Alignment.BottomStart) {
        FloatingActionButton(
            onClick = {
            },
            modifier = Modifier.padding(16.dp),
            containerColor = Color.LightGray
        ) {
            Icon(Icons.Filled.DateRange, "album")
        }
    }
}
