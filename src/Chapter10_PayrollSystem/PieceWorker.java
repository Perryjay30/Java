package Chapter10_PayrollSystem;


import java.util.Date;

public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(wage < 0) {
            throw new IllegalArgumentException("Wages per pieces should be more than 0");
        }
        this.wage = wage;
        if(pieces < 0) {
            throw new IllegalArgumentException("Number of pieces should be more than 0");
        }
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    public double earnings() {
        return wage * pieces;
    }

    @Override
    public String toString() {
        return String.format("Piece worker: %s%n%s%.2f%n%s%d",
                super.toString(), "wage per piece: $", getWage(),
                "Pieces made: ", getPieces());
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
