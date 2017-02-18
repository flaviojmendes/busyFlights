# BusyFlights

This application was developed as part of a test.

All the data was _mocked_ to not overcomplicate.

__Test Coverage__: 91%

## How to Build?

 - Navigate do the root folder of the project.
 - Execute:


    mvn package
- Navigate to __target/__
- Execute:


    java -jar busyFlights-01.00.00.jar

### CrazyAir

URI:

      [Post]
      http://localhost:8000/crazyAir

__Carrier__: LATAM

__Available Airports:__

Departure
 - BSB (Brasília, Brazil)
 - RIO (Rio de Janeiro, Brazil)

Arrival
 - GRU (Guarulhos, Brazil)
 - CGH (Congonhas, Brazil)


### ToughJet

 URI:

       [Post]
       http://localhost:8000/toughJet

__Carrier__: Lufthansa

__Available Airports:__

 Departure
  - FRA (Frankfurt, Germany)
  - MAN (Manchester, England)

 Arrival
  - AMS (Amsterdam, Netherlands)
  - BCN (Barcelona, Spain)

### BusyFlights

URI:

      [Post]
      http://localhost:8000/searchFlights
