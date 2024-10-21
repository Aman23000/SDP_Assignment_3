/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2024
 * File Name: MainApp.java
 * Description: Main class to demonstrate the email generation for different customer segments.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.models.*;

public class Main {

  public static void main(String[] args) {
    EmailTemplateBase corporateClient = new CorporateClient();
    EmailTemplateBase returningClient = new ReturningClient();
    EmailTemplateBase loyalCustomer = new LoyalCustomer();
    EmailTemplateBase prospectiveCustomer = new ProspectiveCustomer();
    EmailTemplateBase eliteMember = new EliteMember();

    generateAndPrintEmail(corporateClient, "John", "Aman", "Corporate");
    generateAndPrintEmail(returningClient, "Derek", "Aman", "Returning");
    generateAndPrintEmail(loyalCustomer, "Jhona", "Aman", "Loyal");
    generateAndPrintEmail(prospectiveCustomer, "Emili", "Aman", "Prospective");
    generateAndPrintEmail(eliteMember, "Hari", "Aman", "Elite");
  }

  /**
   * Helper method to generate and print an email for a customer.
   * @param customer the customer type
   * @param recipient the name of the recipient
   * @param sender the name of the sender
   * @param customerType the type of customer
   */
  private static void generateAndPrintEmail(
          EmailTemplateBase customer, String recipient, String sender, String customerType) {
    System.out.println(customerType + " Customer Email:");
    customer.generateEmail(recipient, sender);
    System.out.println("\n--------------------------\n");
  }
}
