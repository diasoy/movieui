import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieui.module.home.model.SnackModel
import com.example.movieui.module.home.model.snackList


@Composable
fun SnackScreen(navController: NavController) {
    Column {
        TopAppBar(
            title = { Text("Snack Tersedia", style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Bold, color = Color.White)) },
            modifier = Modifier.padding(bottom = 8.dp)
        )
        LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)) {
            items(snackList) { snack ->
                SnackItem(snack = snack)
                Spacer(modifier = Modifier.padding(vertical = 8.dp))
            }
        }
    }
}

@Composable
fun SnackItem(snack: SnackModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), // Add padding around the card
        elevation = 4.dp // Add elevation to create shadow
    ) {
        Row(
            modifier = Modifier.padding(16.dp), // Add padding inside the card
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = snack.assetImage),
                contentDescription = "Snack Image",
                modifier = Modifier
                    .size(64.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = snack.title, style = MaterialTheme.typography.h6)
                Text(text = snack.price, style = MaterialTheme.typography.subtitle1)
            }
        }
    }
}