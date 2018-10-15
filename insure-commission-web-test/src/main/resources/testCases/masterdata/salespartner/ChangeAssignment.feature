#TSTINSC-615
#
#Feature: Vertriebsmitarbeiter
#
  #Background:
    #Given : Ich bin als Admin eingelogt
#
  #Scenario: Vertriebszuordnung aendern
    #Given Ich lege einen Vertriebsmitarbeiter an
    #And Ich rufe die Vertriebsmitarbeiter-Detailansicht auf
    #And Ich rufe die Vertriebszuordnung-Bearbeiten-Maske auf
    #And Ich aendere der Vertriebskanal, Vertriebsrolle und das Wirksamkeitsdatum
    #When Ich speichere die Aenderung fuer Vertriebszuordnung
    #Then Die Vertriebszuordnung ist geaendert