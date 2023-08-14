package com.example.qudrat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qudrat.ui.theme.QudratTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QudratTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    fullmane()
                }
            }
        }
    }
}
@Composable
fun fullmane() {
    Column(Modifier.fillMaxWidth()) {
        Row (Modifier.weight(1f)) {
            chanel(
            one = stringResource(R.string.one1_block),
            two = stringResource(R.string.one_block),
            backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            chanel(
                one = stringResource(R.string.image_composable),
                two = stringResource(R.string.creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            chanel(
                one = stringResource(R.string.row_composable),
                two = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_vertical_sequence),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            chanel(
                one = stringResource(R.string.column_composable),
                two = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}
@Composable
fun chanel (one: String, two: String, backgroundColor: Color ,modifier: Modifier = Modifier ){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = one,
        modifier = Modifier
            .padding(bottom = 16.dp),
        fontWeight = FontWeight.Bold
    )
        Text(
            text = two,
        textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QudratTheme {
        fullmane()

    }
}