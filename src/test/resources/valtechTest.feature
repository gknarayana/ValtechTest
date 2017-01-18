Feature: Valtech Tests

  Background:
    Given User in Valtech home page
#
#  Scenario: Verify Latest News Section is displaying
#    Then Latest News ection is displayed
#
#  Scenario Outline: check the  H1 of each page
#    When I am in <page>
#    Then H1 should be <pageHeader>
#
#    Examples:
#      | page     | pageHeader |
#      | JOBS     | Careers    |
#      | SERVICES | Services   |
#      | CASES    | Work       |

    Scenario Outline: count the offices
      When I am in <page>
      Then I should see <offices> count

      Examples:
        | page     | offices |
        | CONTACT     | 29    |
