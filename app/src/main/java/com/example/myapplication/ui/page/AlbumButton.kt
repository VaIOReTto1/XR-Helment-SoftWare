import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.DateRange
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
        // 按钮位置和样式
        FloatingActionButton(
            onClick = {
                // 执行打开相册的操作
            },
            modifier = Modifier.padding(16.dp)
        ) {
            // 使用图库图标
            Icon(Icons.Filled.DateRange, "album")
        }
    }
}
