package funksjonell_Prog

import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.Font
import javax.swing.*
import javax.swing.event.DocumentEvent
import javax.swing.event.DocumentListener

fun helloScreen() {
    val frame = JFrame("Hello Screen")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(400, 200)
    frame.layout = BorderLayout()

    val panel = JPanel()
    panel.layout = BoxLayout(panel, BoxLayout.Y_AXIS)
    panel.border = BorderFactory.createEmptyBorder(16, 16, 16, 16)

    val helloLabel = JLabel("Hello ")
    helloLabel.font = Font("Arial", Font.PLAIN, 18)
    helloLabel.alignmentX = JLabel.LEFT_ALIGNMENT

    val nameField = JTextField()
    nameField.maximumSize = Dimension(Int.MAX_VALUE, 30)
    nameField.alignmentX = JTextField.LEFT_ALIGNMENT

    val nameLabel = JLabel("Name")
    nameLabel.alignmentX = JLabel.LEFT_ALIGNMENT

    nameField.document.addDocumentListener(object : DocumentListener {
        override fun insertUpdate(e: DocumentEvent?) = updateHello()
        override fun removeUpdate(e: DocumentEvent?) = updateHello()
        override fun changedUpdate(e: DocumentEvent?) = updateHello()

        private fun updateHello() {
            helloLabel.text = "Hello ${nameField.text}"
        }
    })

    panel.add(helloLabel)
    panel.add(Box.createVerticalStrut(8))
    panel.add(nameLabel)
    panel.add(Box.createVerticalStrut(4))
    panel.add(nameField)

    frame.add(panel, BorderLayout.CENTER)
    frame.isVisible = true
}

fun main() {
    SwingUtilities.invokeLater {
        helloScreen()
    }
}

// Også hentet fra forelesning 2 IN2000
//@Composable
//fun HelloScreen() {
//    var name by rememberSaveable { mutableStateOf("") }
//
//    HelloContent(name = name, onNameChange = { name = it })
//}
//
//@Composable
//fun HelloContent(name: String, onNameChange: (String) -> Unit) {
//    Column(modifier = Modifier.padding(16.dp)) {
//        Text(
//            text = "Hello $name",
//            modifier = Modifier.padding(bottom = 8.dp),
//            style = MaterialTheme.typography.bodyMedium
//        )
//
//        OutlinedTextField(value = name, onValueChange = onNameChange, label = { Text("Name") })
//    }
//}