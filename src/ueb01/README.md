Aufgabe1 : Modellierung einfacher Roboter
=========================================

Sie sollen eine Familie sehr einfacher Roboter modellieren. Jeder Roboter hat eine aktuelle Position 
(repräsentiert durch einen Punkt z.B. (0.0, 0.0)) und eine Orientierung (repräsentiert durch eine Gradzahl 
zwischen 0.0 und 360.0 Grad).

Jeder Roboter versteht Befehle, um sich zu bewegen. Diese sind forward, backward (ein Schritt vorwärts 
bzw. rückwärts), sowie left und right (ein Drehschritt). Bei den Drehschritten verändert der Roboter 
nur seine Orientierung, nicht seine Position. Er dreht also auf der Stelle. 

Die Roboter bewegen sich aber nicht kontinuierlich sondern in diskreten Schritten. Die Größe der 
Translationsschritte und der Drehschritte kann beliebig sein und ist für die einzelnen Klassen der 
Roboter unterschiedlich. 

Sie sollen nun jeweils die neue Position und Orientierung der Roboter nach jeder Bewegung berechnen. 

In einer Klassenvariable soll gezählt werden wie viele Roboter erzeugt wurden.

Implementationshinweise
-----------------------

Da bis auf die Größe der Schritte alles gleich ist, können wir fast alle Methoden in eine abstrakte 
Klasse ```AbstractRobot``` herausfaktorisieren. 

Die konkreten Klassen liefern dann nur noch die Schrittweiten.

Damit Sie es leichter haben, bekommen Sie hier ein Muster wie die Klassen und Methoden aussehen sollen.

```
class               AbstractRobot
superclass          Object
instance variables  double x, y, phi
class variables     int noOfInstances
```


### instance creation

Jeder Roboter soll zwei Konstruktoren haben. Einen Basiskonstruktor bei dem alle Instanzvariablen 
gesetzt werden, und einen darauf aufbauenden Defaultkonstruktor. Auch dieses läßt sich in die 
abstrakte Klassse herausfaktorisieren.

```java
AbstractRobot(double x, double y, double phi)       // nur hier werden die Roboter gezählt
AbstractRobot()                                     // ruft den Konstruktor oben mit Defaultwerten auf
```

Unmittelbar nach der Erzeugung (durch den Defaultkonstruktor) soll jeder Roboter am Punkt (0.0,0.0) 
stehen und eine Orientierung von 0.0 Grad haben. 

 
### instance methods

```java
reset()                 // Position the robot at (0.0, 0,0) in orientation 0.0 degrees
```

Zunächst brauchen wir abstrakte Methoden, um die Schrittgrößen von den Unterklassen zu bekommen.

```java
double rotStepSize()                          // abstrakte Methode, liefert die Größe der Drehschritte
double transStepSize()                         // abstrakte Methode, liefert die Größe der Translationsschritte
```

Da sich die beiden Translations- und die beiden Rotationsbewegungen jeweils nur im Vorzeichen unterscheiden, 
können wir die Mathematik für Translation und Rotation herausfaktorisieren. 
Dazu dienen die beiden folgenden Methoden

```java
rotate(double degrees)                           // dreht je nach Vorzeichen nach links (-) oder rechts (+)
translate(double steps)                          // translation vorwärts(+) oder rückwärts (-)
```

Darauf aufbauend werden dann die “öffentlichen”  Methoden sehr einfach: 

```forward()```, ```backward()```, ```left()```, ```right()```  performs a translation or rotation step 


### Für die Ausgabe brauchen wir :

```java
toString()              // Return position and orientation of the robot as string
```

### Tips zur Mathematik: 

Die Orientierung der Roboter sollte nicht außerhalb von 0 bis 360 Grad liegen.
Für die Berechnung der Translation brauchen Sie Winkelfunktionen. Diese finden Sie in der Klasse Math. Beachten Sie die Beschreibung der Winkelfunktionen !

Die konkreten Klassen brauchen nun jeweils nur zwei konkrete Methoden, die die Schrittweiten liefern. Zusätzlich müssen aber noch jeweils die zwei Konstruktoren implementiert werden. Dabei sollen Sie im jeweiligen Defaultkonstruktor mit Defaultwerten den jeweiligen Basiskonstruktor aufrufen. In dem Basiskonstruktor rufen Sie dann den Basiskonstruktor der Oberklasse auf. Damit vermeiden Sie Code zu duplizieren.

Als Beispiel sollen Sie folgende zwei Klassen von Robotern implementieren:

* SlowRobot hat eine Schrittweite von 1 und dreht in beide Richtungen um 30.0 Grad
* FastRobot hat eine Schrittweite von 2 und dreht in beide Richtungen um 90.0 Grad
    








