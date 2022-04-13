# robot-simulator

The solution of the coding problem from the website: 
<https://exercism.org/tracks/scala/exercises/robot-simulator>

Write a robot simulator.

A robot factory's test facility needs a program to verify robot movements.

The robots have three possible movements:

* turn right
* turn left
* advance

Robots are placed on a hypothetical infinite grid, facing a particular direction (north, east, south, or west) at a set of {x,y} coordinates, e.g., {3,8}, with coordinates increasing to the north and east.

The robot then receives a number of instructions, at which point the testing facility verifies the robot's new position, and in which direction it is pointing.