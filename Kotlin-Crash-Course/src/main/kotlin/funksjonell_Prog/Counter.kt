package funksjonell_Prog

import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.SwingConstants

fun counter() {
    var count = 0

    val frame = JFrame("Counter")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(300, 200)

    val label = JLabel(count.toString(), SwingConstants.CENTER)

    val panel = JPanel()
    panel.layout = FlowLayout()

    val values = listOf(1,5,10)

    values.forEach { value ->
        val button = JButton("+$value")
        button.addActionListener {
            count += value
            label.text = count.toString()
        }
        panel.add(button)
    }

    frame.layout = BorderLayout()
    frame.add(label, BorderLayout.CENTER)
    frame.add(panel, BorderLayout.SOUTH)

    frame.isVisible = true
}

fun main() {
    counter()
}

// Denne metoden er hentet fra Forelesning 2 i IN2000
//@Composable
//fun Counter(modifier: Modifier = Modifier) {
//    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
//
//        var count by remember { mutableIntStateOf(0)}
//
//        Text(text = "$count", style = MaterialTheme.typography.displayLarge)
//
//        Row(
//            horizontalArrangement = Arrangement.Center,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            listOf(1, 5, 10).forEach {
//                Button(modifier = Modifier.padding(2.dp), onClick = { count += it }) {
//                    Text(text = "+$it")
//                }
//            }
//        }
//    }
//}