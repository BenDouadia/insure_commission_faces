#TSTINSC-616
#
#Feature: Vertriebsmitarbeiter
#
  #Background:
    #Given : Ich bin als Admin eingelogt
#
  #Scenario: Vertriebsmitarbeiter kuendigen
    #Given Ich lege einen Vertriebsmitarbeiter an
    #And Ich rufe die Vertriebsmitarbeiter-Detailansicht auf
    #And Ich rufe die Kuendigung-Maske auf
    #And Ich gebe den Kuendigungsgrund und das Wirksamkeitsdatum ein
    #When Ich speichere die Kuendigung
    #Then Der Vertriebsmitarbeiter ist gekuendigt
