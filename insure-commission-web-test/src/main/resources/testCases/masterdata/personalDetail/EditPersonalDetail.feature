#TSTINSC-716

Feature: Personaldetail

  Background:
    Given : Ich bin als Admin eingelogt

  Scenario: Personaldetail editieren
    Given Ich lege einen Personaldetail an
    And Ich rufe die Personaldetail-Detailansicht auf
    And Ich rufe die Personaldetail-Bearbeiten-Maske auf
    And Ich aendere das Personaldetail
    When Ich speichere die Aenderung fuer Personaldetail
    Then Das Personaldetail ist geaendert