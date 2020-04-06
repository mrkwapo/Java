#Dependency Injection

* Our classes should not instantiate their dependencies.

In software engineering, dependency injection is a technique whereby one object supplies the dependencies of another object. 
A "dependency" is an object that can be used, for example as a service. Instead of a client specifying which service it will use, 
something tells the client what service to use.


# Separation of Concerns:
In computer science, separation of concerns (SoC) is a design principle for separating a computer program into distinct sections such that
each section addresses a separate concern. A concern is a set of information that affects the code of a computer program.


#There are basically three types of dependency injection: #
## constructor injection: ## the dependencies are provided through a class constructor.
## setter injection: ## the client exposes a setter method that the injector uses to inject the dependency.
## interface injection: ## the dependency provides an injector method that will inject the dependency into any client passed to it. 

Clients must implement an interface that exposes a setter method that accepts the dependency. So now its the dependency injection’s 
responsibility to:

  * Create the objects
  * Know which classes require those objects
  * And provide them all those objects

If there is any change in objects, then DI looks into it and it should not concern the class using those objects. 
This way if the objects change in the future, then its DI’s responsibility to provide the appropriate objects to the class.
