Feature:
  Scenario Outline: As a customer I want to search products from the main URL
  Given I non-loged user I go to Comfy
  And I go to Odessa city
    When I ented 'холодильник' in search filed
    And Click on Search button
    Then I see all products 'холодильник'

  And I verify that Refrigerator '<Refrigerator>' is present
   Examples:
    |Refrigerator|
    |Холодильник Vestfrost CNF186Z W|
    |Холодильник Beko RCNK310E20S|
    |Холодильник Samsung RB33J3201SA/UA|
    |Холодильник Vestfrost CX 451 W|