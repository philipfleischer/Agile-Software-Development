```mermaid

    sequenceDiagram

        actor Bruker
        participant App
        participant API

            Bruker ->> App: Click on retrieve weather data
            App ->> API: fetchWeatherData()

            alt suksess
                API -->>App: Weather data is returned
                App -->> Bruker: Show weather data
            else feil
                API -->>App: Error
                App -->> Bruker: Show error message
            end



```
