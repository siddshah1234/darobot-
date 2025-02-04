# Crescendo 8588

[Doc with all info](https://docs.google.com/document/d/1kVM2zx_AzjtKyKTG_mGzInbQ-rBcM5-2JB4lRf7WDtQ/edit)  
[Planning Doc](https://docs.google.com/document/d/1Zz4CwSUwrkcmWaixhhw2TAhLp6Z7IyciOJ-vBNrFHzI/edit) (will probably get merged into main doc) 


*If you have any questions about anything programming subteam related feel free to reach me at mihir.malaviya@mcvts.org* 

# BOT INFO

| Component               | CAN ID |
|-------------------------|--------|
| Front Left Driving      | 11     |
| Rear Left Driving       | 13     |
| Front Right Driving     | 15     |
| Rear Right Driving      | 17     |
| Front Left Turning      | 10     |
| Rear Left Turning       | 12     |
| Front Right Turning     | 14     |
| Rear Right Turning      | 16     |
| Intake Motor            | 20     |
| Indexing Motor Left     | 21     |
| Indexing Motor Right    | 22     |
| Shooter Aiming Motor    | 23     |
| Shooter Bottom Motor    | 24     |
| Shooter Top Motor       | 25     |

# TODOS

*how this works is you look in here for sm that you think you could do, tell me you want to do this, and then get some people to work with you*

*i know these are all pretty much 1 person jobs, but i want every group to have atleast 1 non-experienced person so they can learn*

## Refactoring
- remove all interface files and chassis files and refactor accordingly (dont touch drive subsystem for the moment)
- combine shooter and indexing into "super" subsystem (we will do once done with most of the subsystem code i told u guys to do)
- get rid of gamepadf310 and use xboxcontroller instead, apparently they are the same mappings (low priority)

## Old robot
- we need to set up 2024 boilerplate for our old robot
    - use the old CAN ID constants and code for GamepadF310
- we need some basic code for it
    - set up a simple subsystem that has 2 functions, motor clockwise and motor counterclockwise
    - set up smartdashboard to add telemetry (there are examples in the old code on how to do this)
- get someone in mechanical to detach one of the motors from its load
- use **sysid** to tune the P I D & FF for the motor (need 1-2 experienced/smart ppl)

## Intake
- I want someone to add an IntakeSubsystemInterface and set that up (easy 1-2 person job)
- I want someone to set up PIDs (2-3 person job) (dont do this yet)
    - most of the code is [in here](https://github.com/REVrobotics/SPARK-MAX-Examples/blob/master/Java/Smart%20Motion%20Example/src/main/java/frc/robot/Robot.java) you will just need to integrate it in here, for now dont use constants for PIDS
- We need something set up so that if motors are too hot intake will stop and it will show on the dashboard

## Indexing
(Afnan + ~3 ppl)

set up boilerplate (look at example subsystem, intake subsystem, and the old code for reference, as well as their website if needed)

you will need to make IndexingSubsystem.java

take in the motors

### make some basic functions
- indexing in
- indexing out
- indexing stop

add a command that does indexing in until a boolean is true

for now control the boolean with a button in the joystick or sm

^ any constants should be defined in Constants.java

### testing
- for each function make it print something to identify when its called for testing purposes
- bind them to buttons in RobotContainer.java > configureBindings()
- test it (talk to me for help)

add javadocs and comments where needed

### add telemetry with SmartDashboard
- what state it is in
- for each motor:
    - temprature
    - current draw
    - power draw

### after we are done with all of this, we will show it to Val and take his feedback
this is all really basic, next thing we need to factor in is the sensor

once we figure out the sensor stuff
- we make a system to know at all times where the note is
- have commands that make 2 systems work together at a time to get the note around 


### what we will do next
- PIDS
- figuring out a system to make sure the note is in the right place

## Shooter
(Ethan + ~4 ppl)  

set up boilerplate (look at example subsystem, intake subsystem, and the old code for reference, as well as their website if needed)

you will need to make ShooterSubsystem.java

take in the motors

### make some basic functions
- turn aim up
- turn aim down
- shoot function (takes in power)
- you guys need to brainstorm how we will calculate where the shot will go
    - make a model that takes a bunch of variables and from that determines where it will land
        - visualise in desmos or sm 

^ any constants should be defined in Constants.java

### testing
- for each function make it print something to identify when its called for testing purposes
- bind them to buttons in RobotContainer.java > configureBindings()
- test it (talk to me for help)

add javadocs and comments where needed

### add telemetry with SmartDashboard
- what state shooter is in
- for each motor:
    - temprature
    - current draw
    - power draw

### after we are done with all of this, we will show it to Val and take his feedback
we will need to add stuff, this is just a starting off point

### what we will do next
- PIDS
- figuring out a system to make sure the note is in the right place

## Drive
we need someone to put in debug stuff for smartdashboard 

## Vision
we need a team of ~4 working on vision, 2 experienced at least


hi