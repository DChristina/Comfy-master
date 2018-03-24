Feature:
  Scenario: As a customer I want to search products from the main URL
  Given I non-loged user I go to Comfy
  And I go to Odessa city
    When I ented 'холодильник' in search filed
    And Click on Search button
    Then I see all products 'холодильник'