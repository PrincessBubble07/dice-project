Feature: Applying for a job on Dice

  @wip
Scenario: The user applies for a job on dice

  Given the user is logged in
  And the user navigates to the job search page
  When the user searches "search.value"
  And the user selects Remote Only from sidebar
  And the user selects the Posted Date as Today from sidebar
  And the user selects Yes under Easy Apply from sidebar
  And the user clicks the first job posting
  And the user clicks Easy Apply button
  And the user clicks Next button
  And the user clicks Apply button
  Then the user should see a confirmation message
