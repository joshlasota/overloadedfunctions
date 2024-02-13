import java.util.Scanner

class Customer {
    var name: String = ""
    var phoneNumber: String = ""
    var businessName: String = ""
    var contactName: String = ""

    fun addCustomer(name: String, phoneNumber: String) {
        this.name = name
        this.phoneNumber = phoneNumber
    }

    fun addCustomer(businessName: String, contactName: String, phoneNumber: String) {
        this.businessName = businessName
        this.contactName = contactName
        this.phoneNumber = phoneNumber
    }

    fun displayCustomerInfo() {
        if (businessName.isNotEmpty()) {
            println("Business Name: $businessName")
            println("Contact Name: $contactName")
        } else {
            println("Name: $name")
        }
        println("Phone Number: $phoneNumber")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Are you a residential or business customer? (residential/business)")
    val customerType = scanner.nextLine()

    val customer = Customer()

    when (customerType.toLowerCase()) {
        "residential" -> {
            println("Enter your name:")
            val name = scanner.nextLine()
            println("Enter your phone number:")
            val phoneNumber = scanner.nextLine()
            customer.addCustomer(name, phoneNumber)
        }
        "business" -> {
            println("Enter your business name:")
            val businessName = scanner.nextLine()
            println("Enter contact name:")
            val contactName = scanner.nextLine()
            println("Enter phone number:")
            val phoneNumber = scanner.nextLine()
            customer.addCustomer(businessName, contactName, phoneNumber)
        }
        else -> {
            println("Invalid customer type!")
            return
        }
    }

    println("\nCustomer Information:")
    customer.displayCustomerInfo()
}
