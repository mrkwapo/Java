# DO NOT CREATE DEEP INHERITANCE HIERARCHIES

* It couples classes too much.
* If you change a deeply coupled class you will have to modify the classes it is coupled with
* Each class will have to be recompiled and redeployed
* if you declare a new field it might not make sense for them to exist in the other classes
* Hierarchies should be only 1-3 levels the most.
