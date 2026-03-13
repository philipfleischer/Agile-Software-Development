package no.erlenste.namage.ui.view.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import no.erlenste.namage.ui.theme.NamageTheme


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun AppToolbar(title: String) {
    TopAppBar(
        title = { Text(text = title, color = MaterialTheme.colorScheme.onPrimary) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}

@Composable
@Preview(showBackground = true)
fun AppToolbarPreview() {
    NamageTheme {
        AppToolbar("Application Title")
    }
}