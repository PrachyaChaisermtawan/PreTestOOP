public class BillPaymentTEST {
    public static void main(String[] args) {
        BillPayment e1 = new BillPayment("Electric", 250);
        e1.setBill_currentUnit(450);
        e1.displayBill();
    }
}

class BillPayment {
    public String bill_Type;
    public int bill_lastUnit;
    public int bill_currentUnit;
    public double bill_Result;

    public BillPayment(String type, int lastUnit) {
        this.bill_Type = type;
        this.bill_lastUnit = lastUnit;
    }

    public int getBill_currentUnit() {
        return this.bill_currentUnit;
    }

    public void setBill_currentUnit(int newCurrentUnit) {
        if (newCurrentUnit <= bill_lastUnit) {
            System.out.println("Please insert a correct unit");
        } else {
            this.bill_currentUnit = newCurrentUnit;
        }
    }

    public int calculateUnit() {
        return bill_currentUnit - bill_lastUnit;
    }

    public double calculateBill() {
        if (bill_Type.equals("Water")) {
            bill_Result = calculateUnit() * 5;
        } else if (bill_Type.equals("Electric")) {
            bill_Result = calculateUnit() * 6;
        }

        return bill_Result;
    }

    public void displayBill() {
        System.out.println("My payment bill is: " + bill_Type);
        System.out.println("The result is: " + bill_Result);
    }
}