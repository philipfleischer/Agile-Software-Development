# Name Age Application

**Namage for short**

## Content

### Components
- **MainScreen** is the main component of MainActivity.kt
- **InputComponent** contains an OutlinedTextField and a Button to trigger an event when clicked.
- **ResultComponent** contains a LazyVerticalStaggeredGrid which renders Result composables.
- **NamageCard** contains a Card displaying a String value

### API
Fetch age based on name input from [Agify](https://agify.io/documentation)

### HTTP Client
This example uses the [Ktor Client](https://ktor.io/docs/client-create-new-application.html#create-client) to make HTTP requests

### Overview of app
![overview of app architecture](https://github.com/user-attachments/assets/ec04bfc9-ffb0-4a96-9095-0405ca23edda)

## TODO
- Implement the NameViewModel containing a list of strings of names and their age
- Use NameViewModel to keep track of names
- Fetch data from a simple data source from the AgeRepository
- Show the names in MainScreen when they are available in the NameViewModel
