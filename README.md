# activities
example of activities service

## Requirements
You only need [Java](https://www.java.com/en/download/) and [Maven](https://maven.apache.org/) in order to run the app.

## Run the app
First we need to create the runnable artifact. Simply go to the _service_ directory (where the _pom.xml_ is located) and execute the command:

`.../service> mvn clean package`

Then go to the _target_ directory and execute the command:

`.../target> java -jar activities-bootified.jar`

The console will show the message  `Started ActivitiesApplication` when the app is ready.
That's it :)

The service will run in the local machine in the port _8080_, however if you want to run the service in a different port use the following command:

`.../target> java -jar -Dserver.port=[your-preferred-port] activities-bootified.jar`

You can also run the app usint IDE's such as [Eclipse](https://www.eclipse.org/downloads/) or [Intellij](https://www.jetbrains.com/idea/download/). Once you have installed the IDE import the _activities_ project, look for the main class (_ActivitiesApplication.java_) and with right click over it select _Run As_ option.

## Check the service
The available endpoints are defined in the _activities.yaml_ file.

### Endpoint examples

Get activities schema: `/test/api/v1/activities/{city}`

Get best activity: `/test/api/v1/activities/{city}/findBest/{category}/{startDatetime}/{endDatetime}`

#### To retrieve all activities (with no filter):
`http://localhost:8080/test/api/v1/activities/madrid`

#### To filter the activities:
`http://localhost:8080/test/api/v1/activities/madrid?category=shopping&location=outdoors`

or

`http://localhost:8080/test/api/v1/activities/madrid?category=shopping&location=outdoors&district=Centro`

#### To get the best activity
`http://localhost:8080/test/api/v1/activities/madrid/findBest/cultural/2018-09-03T20:00:00/2018-09-03T21:00:00`

## Run the tests
The test can be executed from the _service_ directory (where the _pom.xml_ is located) using the command

`.../service> mvn clean test`
