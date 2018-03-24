Feature:
  Scenario Outline: As a customer I want to search products from the main URL
  Given I non-loged user I go to Comfy
  And I choose Country


  And I verify that City '<City>' is present

    Examples:
    |City|
    |Одесса|
    |Киев|
    |Львов|