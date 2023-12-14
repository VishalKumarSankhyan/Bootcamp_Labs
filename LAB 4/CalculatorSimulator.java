// Custom exception class for when the country is not valid
class CountryNotValidException extends Exception {
    public CountryNotValidException(String str) {
        super(str);
    }
}

// Custom exception class for when the employee name is invalid
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String str) {
        super(str);
    }
}

// Custom exception class for when the employee is not eligible for tax calculation
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String str) {
        super(str);
    }
}

// Class to calculate tax
class TaxCalculator {
    public static double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        double taxAmount = 0.0;

        // Check if the employee is not an Indian citizen
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        // Check if the employee name is null or empty
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        // Calculate tax based on salary
        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 4 / 100;
        } else {
            // If none of the conditions match, the employee is not eligible for tax
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

public class CalculatorSimulator {
    public static void main(String[] args){
        TaxCalculator taxCalculator = new TaxCalculator();

        try {
            // Example usage of calculateTax method with exception handling
            // Test Cases
            double tax = taxCalculator.calculateTax("Ron", false, 34000);
            //double tax = taxCalculator.calculateTax("Tim",true,1000);
		    //double tax = taxCalculator.calculateTax("Jack",true,55000);
		    //double tax = taxCalculator.calculateTax("",true,30000);
            System.out.println("Tax amount is : " + tax);

        }catch (CountryNotValidException e) {
            // Handle the CountryNotValidException
            System.out.println(e.getMessage()); 
        } catch (EmployeeNameInvalidException e) {
            // Handle the EmployeeNameInvalidException
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            // Handle the TaxNotEligibleException
            System.out.println(e.getMessage());
        }
    
    }
}