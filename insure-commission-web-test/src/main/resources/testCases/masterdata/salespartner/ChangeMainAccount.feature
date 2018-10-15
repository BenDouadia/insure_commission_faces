#TSTINSC-676
#
#Feature: Vertriebsmitarbeiter
#
  #Background:
    #Given : Ich bin als Admin eingelogt
#
  #Scenario: Hauptkonto editieren
    #Given Ich lege einen Vertriebsmitarbeiter an
    #And Ich rufe die Vertriebsmitarbeiter-Detailansicht auf
    #And Ich rufe die Hauptkonto-Bearbeiten-Maske auf
    #And Ich aendere das Hauptkonto und das Wirksamkeitsdatum
    #When Ich speichere die Aenderung fuer Hauptkonto
    #Then Das Hauptkonto ist geaendert