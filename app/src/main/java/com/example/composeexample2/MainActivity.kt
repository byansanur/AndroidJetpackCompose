package com.example.composeexample2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeexample2.fragment.RecipeListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            ColumnLayout()
//            RowLayout()
//            RowColumnLayout()
//        }

        // fragment in jetpack
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainContainer, RecipeListFragment())
            .commit()

    }
}

/*
@Composable
fun ColumnLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF2F2F2))
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.helm),
            contentDescription = "contentDes",
            modifier = Modifier.height(300.dp),
            contentScale = ContentScale.Fit
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Helm JPX, Save your HEAD!!!",
                style = TextStyle(
                    color = colorResource(id = R.color.black),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "800 gr",
                style = TextStyle(
                    fontStyle = FontStyle.Normal,
                    fontSize = 17.sp
                )
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "Rp1.500.000",
                style = TextStyle(
                    color = Color.Red,
                    fontStyle = FontStyle.Normal,
                    fontSize = 17.sp
                )
            )

        }
    }
}

@Composable
fun RowLayout() {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Item 1",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Item 2",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

        }
        Spacer(modifier = Modifier.padding(20.dp))
        Row(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Item 2",
                modifier = Modifier.align(Alignment.CenterVertically)
            )

        }
    }


}

@Composable
fun RowColumnLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF2F2F2))
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.helm),
            contentDescription = "contentDes",
            modifier = Modifier.height(300.dp),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Helm JPX, Save your HEAD!!!",
                    style = TextStyle(
                        color = colorResource(id = R.color.black),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                )
                Text(
                    text = "Rp1.500.000",
                    style = TextStyle(
                        color = Color.Red,
                        fontStyle = FontStyle.Normal,
                        fontSize = 14.sp
                    ),
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "800 gr",
                style = TextStyle(
                    fontStyle = FontStyle.Normal,
                    fontSize = 14.sp
                )
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Order now")
            }
        }
    }
}

//@Preview
//@Composable
//fun Preview() {
////    ColumnLayout()
////    RowLayout()
////    RowColumnLayout()
//}

 */