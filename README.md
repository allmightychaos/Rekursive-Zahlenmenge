Implementieren Sie eine Zahlenmenge mit Hilfe eines binären Baums (Hinweise: Ein Menge enthält niemals mehrere Exemplare der gleichen Zahl).

Erstellen Sie die zwei Klassen Set und Node und implementieren Sie in der Klasse Set folgende Methoden:

- [X] void set(int val) fügt eine neue Zahl in die Menge ein, wenn diese Zahl noch nicht enthalten ist
- [X] boolean get(int val) prüft ob eine Zahl in der Menge enthalten ist
- [X] int size() liefert die Anzahl der Zahlen in der Menge
- [X] void remove(int val) entfernt eine Zahl aus der Menge
- [X] Set clone() liefert eine Kopie der Menge als neue Menge
- [X] void print() gibt eine Menge auf der Kommandozeile aus
- [X] Set intersect(Set s) liefert Schnittmenge aus this und s als neue Menge
- [X] Set union(Set s) liefert Vereinigungsmenge aus this und s als neue Menge
- [X] Set diff(Set s) liefert Mengendifferenz aus this und s als neue Menge
- [X] Set range(int from, int to) liefert alle Zahlen, die im Bereich zwischen from und to liegen, als neue Menge (Bereichsgrenzen jeweils eingeschlossen >=, <=)
Beispiel: Gegeben sind die Mengen s1 und s2:

s1: { -9 -5 -4 -3 0 2 4 10 } <br/>
s2: { -5 -3 0 1 2 7 9 } <br/>
Folgende Operationen auf diesen Mengen s1 und s2 sollen folgende Ergebnisse liefern:

s1.union(s2): { -9 -5 -4 -3 0 1 2 4 7 9 10 } <br/>
s1.intersect(s2): { -5 -3 0 2 } <br/>
s1.range(0, 10): { 0 2 4 10 } <br/>
s2.range(-10, 0): { -5 -3 0 } <br/>
s2.remove(0): { -5 -3 1 2 7 9 } <br/>
s2.remove(2): { -5 -3 1 7 9 } <br/>
s1.intersect(s2): { -5 -3 } <br/>
s1.diff(s2): { -9 -4 0 2 4 10 } <br/>
