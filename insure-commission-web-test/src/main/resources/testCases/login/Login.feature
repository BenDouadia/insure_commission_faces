#TSTINSC-884

Feature: Mandant

  Scenario Outline: Mandant Login testen
    Given Ich rufe die Seite auf
    And Ich gebe die Logindaten ein: "<Mandant>","<Benutzername>","<Benutzerpasswort>"
    When Ich loge mich ein
    Then Die StammdatenSucheSeite wird angezeigt

    Examples:
      | Mandant                      | Benutzername    | Benutzerpasswort |
      | Swiss Life Partnermanagement | DevSuperVisor09 | Fab50java09      |
      | Swiss Life Select            | DevSuperVisor09 | Fab50java09      |
      | tecis                        | DevSuperVisor09 | Fab50java09      |
      | Deutsche Proventus           | DevSuperVisor09 | Fab50java09      |
      | HORBACH Wirtschaftsberatung  | DevSuperVisor09 | Fab50java09      |
      | Swiss Compare                | DevSuperVisor09 | Fab50java09      |
