Aufgabe 2a: Interfaces und Typisierung
======================================

### Hinweis:
Die Aufgabe 2 und Aufgabe 3 bauen auf einander auf. 
Da die Aufgabenstellung sehr umfangreich ist, habe ich sie hier zusammengefasst.

Szenario
--------

Da wir in Hamburg sind betrachten wir ein Schiffahrtsszenario. Die Teilnehmer des Szenarios teilen 
wir in Kategorien auf.

Wir betrachten:

- mehrere Werften, die Schiffe bauen
- mehrere Zulieferer, die Komponenten an Werften liefern
- mehrere Reeder, die Schiffe betreiben
- mehrere Mannschaften, die Schiffe führen
- mehrere Befrachter, die Schiffe beladen
- mehrere Reiseunternehmer, die Passagiere auf Reisen schicken,


Alle haben mit Schiffen zu tun, und brauchen eine gemeinsam nutzbares Modell eines
Schiffes.

In der Realität geht es nicht nur um Schiffe, sondern auch um Eisenbahnen, Lastkraftwagen, 
Flugzeuge usw. Der Befrachter muß die Waren ja weitertransportieren, nachdem sie im Hafen 
angekommen sind.

Wir wollen uns aber nur mit den Schiffen und ihren verschiedenen Aspekten beschäftigen. Die 
Teilnehmer unseres Szenarios werden auch nicht modelliert, weil das zu groß werden würde. Aber sie 
sind für das Verständnis unseres Szenarios unbedingt notwendig.

### Also:

Wir modellieren Schiffe (zunächst nur Frachtschiffe), die im Zentrum des Interesses unserer 
Teilnehmer stehen. Die Teilnehmer und die Interaktionen der Teilnehmer untereinander werden nicht 
modelliert.



Teilnehmer des Szenarios
------------------------

- Werften
- Zulieferer
- Reeder
- Befrachter


Problemstellung und Zielsetzung     
-------------------------------
....


Aufgabe 3: Beladung und Staupläne
=================================

Modellierung von Stauplänen
---------------------------

Stauräume von Schiffen
Die Stauräume eines Schiffes sind meistens hierarchisch aufgebaut. 
Z.B. besteht ein Stauraum aus
* mehreren Laderäumen (Luken), 
* die sich vertikal über mehrere Decks erstrecken
* und die wiederum aus einzelnen Stauplätzen bestehen.

Jeder Stauplatz kann leer sein oder ein physikalisches Objekt enthalten. Dieses wird in einem 
Stauplan (stowage plan) festgehalten.
Wir wollen uns auf Staupläne für Containerfahrt beschränken.

