package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreens(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ) {
        Card(
            colors = CardDefaults.cardColors(
                Color(0xFF9900FF)
            ),
            modifier = Modifier
                .align(Alignment.TopEnd)
                .height(50.dp)
                .width(120.dp),
            shape = RoundedCornerShape(
                bottomStart = 20.dp
            )
        ) {}
        // Card Inferior:
        Card(
            colors = CardDefaults.cardColors(
                Color(0xFF9900FF)
            ),
            modifier = Modifier
                .align(Alignment.BottomStart)
                .height(50.dp)
                .width(120.dp),
            shape = RoundedCornerShape(
                topEnd = 20.dp
            )
        ) {}

        // Coluna:
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxSize()
                .padding(13.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Texto de Por Favor:
            Text(
                text = stringResource(R.string.sing_in),
                fontSize = 13.sp,
                color = Color(0xFF808080),
                modifier = Modifier
                    .padding(5.dp)
            )

            // Para por o email:
            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = {
                    Text(
                        text = stringResource(R.string.e_mail)
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color.Red
                    )
                },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(17.dp)
            )

            // Para por a senha:
            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = {
                    Text(
                        text = stringResource(R.string.password)
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "",
                        tint = Color.Red
                    )

                },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(17.dp)
            )

            // Botão de SingIn:
            Button(
                modifier = Modifier
                    .padding(top = 23.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9900FF)),
                onClick = {},
                shape = RoundedCornerShape(10.dp)
            ) {}
            Text(
                text = stringResource(R.string.sing_in),
            )
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = ""
            )
        }

        // Texto de Login:
        Text(
            text = stringResource(R.string.login),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF9900FF),
        )


    }

    // Linha de Cadastro:
    Row(
        modifier = Modifier
    ) {}
    // Sem cadastro...:
    Text(
        text = stringResource(R.string.login),
        fontSize = 13.sp,
        color = Color(0xFF808080),
        modifier = Modifier
            .padding(top = 7.dp)
    )
    // Cadastre-se:
    Text(
        text = stringResource(R.string.sing_up),
        fontSize = 13.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF9900FF),
        modifier = Modifier
            .padding(top = 7.dp)
    )
}








@Preview
@Composable
private fun HomeScreensPreview() {
    HomeScreens()

}