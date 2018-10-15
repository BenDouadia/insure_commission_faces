#TSTINSC-677
#
#Feature: Vertriebsmitarbeiter
#
  #Background:
    #Given : Ich bin als Admin eingelogt
#
  #Scenario: Uebergeordneter wechseln
    #Given Ich lege einen Vertriebsmitarbeiter an
    #And Ich rufe die Vertriebsmitarbeiter-Detailansicht auf
    #And Ich rufe die Uebergeordneter-Bearbeiten-Maske auf
    #And Ich aendere den Uebergeordneter und das Wirksamkeitsdatum
    #When Ich speichere die Aenderung fuer Uebergeordneter
    #Then Der Uebergeordneter ist gewechselt